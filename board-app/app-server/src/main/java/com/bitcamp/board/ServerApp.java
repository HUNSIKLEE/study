package com.bitcamp.board;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

  public static void main(String[] args) {

    
      System.out.println("[게시글 데이터 관리 서버]");

        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("서버 소켓 Ready");

            Socket socket = serverSocket.accept();
            System.out.println("클라이언트와 연결됨");


            serverSocket.close();
            System.out.println("클라이언트와 연결 끊음");

            DataInputStream in = new DataInputStream(socket.getInputStream());

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String dateName = in.readUTF();
            String command = in.readUTF();

            switch (dateName){
                case "board":
                     out.writeUTF("success");
                    break;
                case "member":
                    out.writeUTF("sucess");
                break;
                default:
                    out.writeUTF("fail");
            }

        }catch (Exception x){
            x.printStackTrace();

        }

  }

}
