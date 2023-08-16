package com.mycom.member.repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycom.member.domain.MemberDTO;

//InterfaceMemberRepository의 구현 클래스가 될 예정
//DAO 역할을하는 클래스. DB 작업
//Controller -> Service -> DAO(Repository) -> myBatis -> DB 
@Repository
public class MemberRepositoryImpl {
	//필드
	@Autowired
	private SqlSession sqlSession;
	
	//생성자
	
	//메서드
	//회원수 조회
	public int selectTotalMemberCNT () {
		int totalMemberCNT = (Integer) sqlSession.selectOne("member.totalMemberCNT");
		return totalMemberCNT;
	}
		
	
	//id로 회원정보 조회
	//리턴 MemberDTO - no, memberid, password, name, regdate, isshow
	public MemberDTO selectMemberById (String memberid) {
		MemberDTO memberDTO = (MemberDTO) sqlSession.selectOne("member.selectById", memberid);
		return memberDTO;
	}
	
	
	//목록조회
	//리턴 List<HashMap<String, Object>>
	//HshMap은 Key와 Value를 필요로한다
	//이 때 Key는 컬럼명, Value는 해당 컬럼의 값이 된다.
	//예) 컬럼명 no, memberid, password, name,  regdate, isshow			, isshow
	//예) 컬럼값 2,	 HONGID,	1234,		  홍길동, 2015-07-01 10:43:10	,	  Y
	//Key no에는 숫자타입 2가 저장
	//Key memberid에는 문자타입 HONGID가 저장
	//한명의 회원정보는 HashMap에 저장
	//다수의 회원정보들이므로 List에 넣는다
	/*	<select id="selectMemberList" resultType="hashmap"> <!-- 컬럼명이 키 값이다 -->
		<![CDATA[
		SELECT no, memberid, password, name, regdate, isshow */
	public List<HashMap<String, Object>> selectMemberList () {
		//sqlSession참조변수.메서드명("네임스페이스명.실행하려는id")
		List<HashMap<String, Object>> memberList = sqlSession.selectList("member.selectMemberList");
		
		return memberList;
	}


	//회원삭제 (update용)
	//리턴 int - 회원삭제에 성공하면 1을 반환
	//파라미터 String memberid - 삭제하고싶은 회원id
	public int updateIsShow(String memberid) {
		int rowCnt = sqlSession.update("member.updateIsShow", memberid);
		//update가 적용된 row수를 반환
		//여기에서는 pk인 회원id로 업데이트되므로 성공하면 1을 반환
		return rowCnt;
	}
}