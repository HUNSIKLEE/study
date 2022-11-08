package com.bitcamp.testproject.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.bitcamp.testproject.vo.Member;



@Mapper
public interface MemberDao {

  int insert(Member member);

  Member findByNo(int no);

  int update(Member member);

  int delete(int no);

  List<Member> findAll();

  void insertRegion(Member member);

  void insertSports(Member member);

  // 메서드의 파라미터가 여러 개일 때:
  // - SQL에서 참조할 파라미터라고 애노테이션으로 표시해야 한다.
  // - 이때 SQL에서 참조할 이름도 지정해야 한다.
  Member findByIdPassword(
      @Param("id") String id, 
      @Param("password") String password);


  Member findById(
      @Param("name") String name, 
      @Param("email") String email);


  Member findByPassword(
      @Param("id") String id, 
      @Param("email") String email,
      @Param("SecCode") String SecCode);


  boolean updatePW(
      @Param("password") String password);


}










