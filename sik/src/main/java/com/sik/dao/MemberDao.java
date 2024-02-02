package com.sik.dao;

import com.sik.vo.Member;

public interface MemberDao {

 void  save(Member member);

 Member findById(Long memberId);
}
