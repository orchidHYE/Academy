package com.mycom.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//log 객체 생성
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//요청주소 http://localhost:8081/app/test?id=hongid&age=12
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletResponse response, HttpServletRequest request, @RequestParam("id")  String rpid, @RequestParam("age")  int rpage) {
		logger.info("Welcome home! The client locale is {}.", locale);
		//1.파라미터 받기
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("syso 파라미터id= " + id);
		System.out.println("syso 파라미터age= " + (age-1));
		logger.info("@RequestParam(id) {}", rpid);
		logger.info("@RequestParam(age) {}", rpage - 1);
		
		
		//2.비즈니스 로직
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		
		//3.Model
		String formattedDate = dateFormat.format(date);
		
		
		//org.springframework.ui패키지의 Model 이용
		response.setCharacterEncoding("utf-8");
		request.setAttribute("name", "홍GD");
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//요청주소 http://localhost:8081/app/form01
	@RequestMapping ("/form01")
	public String form01 () {
		//1.파라미터받기
		//2.비즈니스로직
		//3.Model
		//4.View
		return "form01";
	}
	
	//요청방식 post
	//요청주소 http://localhost:8081/app/form01Result
	@RequestMapping (value="/form01Result", method=RequestMethod.POST)
	public String form01Result (@RequestParam("userName") String userName, @RequestParam("hobby") String[] hobbies) { //파라미터명과 매개변수의 명이 동일하면 파라미터명 생략 가능
		//1.파라미터받기
		logger.info("이름: {}", userName);
		
		for (String h : hobbies) {
			logger.info("관심사: {}", h);
		}
		//2.비즈니스로직
		//3.Model
		//4.View
		return "form01Result";
	}
}
