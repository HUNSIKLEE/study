package com.bitcamp.board;

import com.bitcamp.board.servlet.BoardServlet;
import com.bitcamp.board.servlet.MemberHandler;
import com.bitcamp.servlet.Servlet;
import com.bitcamp.util.Prompt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Stack;

public class ClientApp {

    public static Stack<String> breadcrumbMenu = new Stack<>();

    public static void main(String[] args) {

              System.out.println("[게시판 관리 클라이언트]");



              try (Socket socket = new Socket("127.0.0.1", 8888);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());){
                System.out.println("연결됨");

                  welcome();

                  // 핸들러를 담을 레퍼런스 배열을 준비한다.
                  Servlet[] handlers = new Servlet[] {
                          new BoardServlet("board", in ,out), // 게시판
                          new BoardServlet("reading", in ,out), // 독서록
                          new BoardServlet("visit", in ,out), // 방명록
                          new BoardServlet("notice", in ,out), // 공지사항
                          new BoardServlet("daily", in ,out), // 일기장
                          new MemberHandler("member", in ,out) // 회원
                  };

                  // "메인" 메뉴의 이름을 스택에 등록한다.
                  breadcrumbMenu.push("메인");


                  // 메뉴명을 저장할 배열을 준비한다.
                  String[] menus = {"게시판", "독서록", "방명록", "공지사항", "일기장", "회원"};


                  loop: while (true) {

                      printTitle();
                      printMenus(menus);
                      System.out.println();

                      try {
                          int mainMenuNo = Prompt.inputInt("메뉴를 선택하세요[1..6](0: 종료) ");

                          if (mainMenuNo < 0 || mainMenuNo > menus.length) {
                              System.out.println("메뉴 번호가 옳지 않습니다!");
                              continue; // while 문의 조건 검사로 보낸다.

                          } else if (mainMenuNo == 0) {
                              break loop;
                          }

                          // 메뉴에 진입할 때 breadcrumb 메뉴바에 그 메뉴를 등록한다.
                          breadcrumbMenu.push(menus[mainMenuNo - 1]);

                          // 메뉴 번호로 Handler 레퍼런스에 들어있는 객체를 찾아 실행한다.
                          handlers[mainMenuNo - 1].service();

                          breadcrumbMenu.pop();

                      } catch (Exception ex) {
                          System.out.println("입력 값이 옳지 않습니다.");
                      }


                  } // while

                  Prompt.close();



                  out.writeUTF("board");
                out.writeUTF("insert");

                String status = in.readUTF();
                  System.out.println(status);

                socket.close();
                System.out.println("연결 끊음");
              }catch (Exception x){
                x.printStackTrace();
              }
            System.out.println("종료");
    }

    static void welcome() {
        System.out.println("[게시판 애플리케이션]");
        System.out.println();
        System.out.println("환영합니다!");
        System.out.println();
    }

    static void printMenus(String[] menus) {
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("  %d: %s\n", i + 1, menus[i]);
        }
    }

    protected static void printTitle() {
        StringBuilder builder = new StringBuilder();
        for (String title : App.breadcrumbMenu) {
            if (builder.length() != 0) {
                builder.append(" > ");
            }
            builder.append(title);
        }
        System.out.printf("%s:\n", builder.toString());
    }
}
