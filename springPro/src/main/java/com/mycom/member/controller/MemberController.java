package com.mycom.member.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.member.domain.MemberDTO;
import com.mycom.member.service.MemberServiceImpl;

//Controller -> Service -> DAO(Repository) -> myBatis -> DB
@Controller
@RequestMapping("/member")
public class MemberController {
	//필드
	@Autowired
	private MemberServiceImpl memberServiceImpl;
	
	//생성자
	//메서드
	//회원수 조회
	//요청주소 http://localhost:8081/app/totalMember
	@RequestMapping("/totalMember")
	public void selectTotalMemberCNT (Model model) {
		//1.파라미터 받기
		//2.비즈니스로직 <-> Service <-> DAO(Repository) <-> myBatis <-> DB
		int totalMemberCNT = memberServiceImpl.getTotalMemberCNT();
		
		//3.Model
		model.addAttribute("totalMemberCNT", totalMemberCNT);
		System.out.println("전체회원수 totalMemberCNT: " + totalMemberCNT);
		
		//4.View => 여기에서는 WEB-INF/views/totalMember.jsp 존재하지 않으므로 404에러
	}
	
	//id로 회원정보 조회
	//파라미터  String memberid - 조회하고 싶은 회원의 id
	//리턴 MemberDTO - no, memberid, password, name, regdate, isshow
	//요청주소 http://localhost:8081/app/member/getMamber?mid=회원id
	@RequestMapping("/getMember")
	public String getMemberById (Model model,@RequestParam("mid") String memberid) {
		//1.파라미터 받기 - 회원id
		//String memberid = request.getParameter("mid"); =>기존방식
		
		
		
		//2.비즈니스로직 <-> Service <-> Repository <-> myBatis <-> DB
		MemberDTO memberDTO = memberServiceImpl.getMemberById(memberid);
		System.out.println(memberDTO);
		
		//3.Model
		model.addAttribute("memberDTO", memberDTO);
		
		//4.View
		return "/member/memberInfo";
	}
	
	//목록조회
	//요청주소 http://localhost:8081/app/member/list
	//요청방식 get
	//view: /WEB-INF/views/member/list
	@RequestMapping("/list")
	public void getMemberList (Model model) {
		//리턴 List<HashMap<String, Object>>
		//HshMap은 Key와 Value를 필요로한다
		//이 때 Key는 컬럼명, Value는 해당 컬럼의 값이 된다.
		//예) 컬럼명 no, memberid, password, name,  regdate, isshow			, isshow
		//예) 컬럼값 2,	 HONGID,	1234,		  홍길동, 2015-07-01 10:43:10	,	  Y
		//Key no에는 숫자타입 2가 저장
		//Key memberid에는 문자타입 HONGID가 저장
		//한명의 회원정보는 HashMap에 저장
		//다수의 회원정보들이므로 List에 넣는다
		List<HashMap<String, Object>> memberList = memberServiceImpl.getMemberList();
		model.addAttribute("memberList", memberList);
		//return "/member/list";
	}
	
	
	//수정
	//수정폼 보여주기 요청 => get방식
	//@RequestMapping("/member/modify")
	//1.파라미터 받기 		mid = 회원id
	
	//수정처리 요청 => post방식
	//@RequestMapping("/member/modify")
	//1.파라미터 받기 		mid = 회원id
	
	//삭제
	//요청주소 http://localhost:8081/app/member/member/delete?mid=회원번호
	@RequestMapping("/delete")
	public ModelAndView deleteMember (ModelAndView mv, @RequestParam String mid) {
		//1.파라미터 받기 mid = 회원id
		//2.비즈니스로직
		//파라미터 String mid - 삭제하고싶은 회원id 
		int rowCnt = memberServiceImpl.deleteMember(mid);
		
		//3.Model
		//4.View
		if (rowCnt != 1) { //삭제 실패시 상세페이지로 이동
			mv.setViewName("redirect: /member/getMember?mid=" + mid);
		} else { //삭제 성공시 목록페이지로 이동
			mv.setViewName("redirect: /member/list");
		}
		return mv;
	}
	
	
	
	//회원가입
	//회원가입을 위한 폼 요청 => get방식
	//요청주소 http://localhost:8081/app/mamber/join
	
	//가입처리 요청=> post방식
	//요청주소 http://localhost:8081/app/mamber/join
}
