package com.bitcamp.testproject.service;

import java.util.List;
import java.util.Map;
import com.bitcamp.testproject.vo.AttachedFile;
import com.bitcamp.testproject.vo.Board;
import com.bitcamp.testproject.vo.BoardCategory;
import com.bitcamp.testproject.vo.Criteria;

// 비즈니스 로직을 수행하는 객체의 사용규칙(호출규칙)
//
public interface BoardService {

  //  void add(Board board) throws Exception;
  //
  //  boolean update(Board board) throws Exception;
  //
  //  Board get(int no) throws Exception;
  //
  //  boolean delete(int no) throws Exception;
  //
  //  List<Board> list() throws Exception;
  //
  //  BoardAttachedFile getAttachedFile(int fileNo) throws Exception;
  //
  //  boolean deleteAttachedFile(int fileNo) throws Exception;

  //  제동 소스 

  void add(Board board) throws Exception;

  Board get(int no) throws Exception;

  //  List<Board> list(int no) throws Exception;

  boolean delete(int no) throws Exception;

  boolean update(Board board) throws Exception;

  AttachedFile getAttachedFile(int no) throws Exception;

  boolean deleteAttachedFile(int fileNo) throws Exception;

  List<Map<String, Object>> list(Criteria cri) throws Exception;

  int countBoardListTotal(int no);

  List<Map<String, Object>> bestList();

  List<Map<String, Object>> clgList();

  void increaseViews(int no);

  BoardCategory getCategory(int no);



  ////////////
}








