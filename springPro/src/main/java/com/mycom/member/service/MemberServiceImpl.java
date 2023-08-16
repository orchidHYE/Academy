package com.mycom.member.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.member.domain.MemberDTO;
import com.mycom.member.repository.MemberRepositoryImpl;

//Interface MemberSevice의 구현 클래스가 될 예정
//public class MemberServiceImpl implements MemberService
//Controller -> Service -> DAO(Repository) -> myBatis -> DB
@Service
public class MemberServiceImpl {
	//필드
	@Autowired
	private MemberRepositoryImpl memberRepositoryImpl;
	//생성자
	//메서드
	
	//회원수 조회
	public int getTotalMemberCNT () {
		int totalMemberCNT = memberRepositoryImpl.selectTotalMemberCNT(); //dao의 메서드 호출
		return totalMemberCNT;
	}
		
	
	//id로 회원정보 조회
	//리턴 MemberDTO - no, memberid, password, name, regdate, isshow
	public MemberDTO getMemberById (String memberid) {
		MemberDTO memberDTO = memberRepositoryImpl.selectMemberById(memberid);
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
	public List<HashMap<String, Object>> getMemberList () {
		//sqlSession참조변수.메서드명("네임스페이스명.실행하려는id")
		List<HashMap<String, Object>> memberList = memberRepositoryImpl.selectMemberList();
		
		return memberList;
	}

	
	//회원삭제
	//파라미터 String memberid - 삭제하고싶은 회원id
	public int deleteMember(String memberid) {
		return  memberRepositoryImpl.updateIsShow(memberid);
		
	}
}
