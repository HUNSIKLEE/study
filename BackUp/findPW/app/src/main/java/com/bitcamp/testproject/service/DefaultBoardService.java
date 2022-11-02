package com.bitcamp.testproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bitcamp.testproject.dao.BoardDao;
import com.bitcamp.testproject.vo.AttachedFile;
import com.bitcamp.testproject.vo.Board;

@Service
public class DefaultBoardService implements BoardService {

  @Autowired 
  BoardDao boardDao;
  //
  //  @Transactional
  //  @Override
  //  public void add(Board board) throws Exception {
  //    // 1) 게시글 등록
  //    if (boardDao.insert(board) == 0) {
  //      throw new Exception("게시글 등록 실패!");
  //    }
  //
  //    // 2) 첨부파일 등록
  //    if (board.getAttachedFiles().size() > 0) {
  //      boardDao.insertFiles(board);
  //    }
  //  }
  //
  //  @Transactional
  //  @Override
  //  public boolean update(Board board) throws Exception {
  //    // 1) 게시글 변경
  //    if (boardDao.update(board) == 0) {
  //      return false;
  //    }
  //
  //    // 2) 첨부파일 추가
  //    if (board.getAttachedFiles().size() > 0) {
  //      boardDao.insertFiles(board);
  //    }
  //
  //    return true;
  //  }
  //
  //  @Override
  //  public Board get(int no) throws Exception {
  //    return boardDao.findByNo(no); // 첨부파일 데이터까지 조인하여 select를 한 번만 실행한다.
  //  }
  //
  //  @Transactional
  //  @Override
  //  public boolean delete(int no) throws Exception {
  //    // 1) 첨부파일 삭제
  //    boardDao.deleteFiles(no);
  //
  //    // 2) 게시글 삭제
  //    return boardDao.delete(no) > 0;
  //  }
  //
  //  @Override
  //  public List<Board> list() throws Exception {
  //    return boardDao.findAll();
  //  }
  //
  //  @Override
  //  public BoardAttachedFile getAttachedFile(int fileNo) throws Exception {
  //    return boardDao.findFileByNo(fileNo);
  //  }
  //
  //  @Override
  //  public boolean deleteAttachedFile(int fileNo) throws Exception {
  //    return boardDao.deleteFile(fileNo) > 0;
  //  }



  //  제동 소스
  @Transactional
  @Override
  public void add(Board board) throws Exception {
    //  1) 게시판 등록
    if (boardDao.insert(board) == 0) {
      throw new Exception("게시글 등록 실패!");
    }
    // 2) 첨부파일 등록
    if (board.getAttachedFiles().size() > 0) {
      boardDao.insertFiles(board);
    }
  }

  @Override
  public Board get(int no) throws Exception {
    return boardDao.findByNo(no); 
  }

  @Override
  public List<Board> list(int no) throws Exception {
    return boardDao.findAll(no);
  }

  @Transactional
  @Override
  public boolean delete(int no) throws Exception {
    // 1) 첨부파일 삭제
    boardDao.deleteFiles(no);
    // 2) 게시글 삭제
    return boardDao.delete(no) > 0;
  }

  @Transactional
  @Override
  public boolean update(Board board) throws Exception {
    // 1) 게시글 변경
    if (boardDao.update(board) == 0) {
      return false;
    }
    // 2) 첨부파일 추가
    if (board.getAttachedFiles().size() > 0) {
      boardDao.insertFiles(board);
    }

    return true;
  }

  @Override
  public AttachedFile getAttachedFile(int no) throws Exception {
    return boardDao.findFileByNo(no);
  }

  @Override
  public boolean deleteAttachedFile(int fileNo) throws Exception {
    return boardDao.deleteFile(fileNo) > 0;
  }

  //////////

}








