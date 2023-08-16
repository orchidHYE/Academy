package com.mycom.app;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
//@RequestMapping ("/a")
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
	@RequestMapping (value="/form01Result", method=RequestMethod.GET)
	public String form01Result (
					@RequestParam("userName") String userName,
					@RequestParam("hobby") String[] hobbies,
					@RequestParam(defaultValue = "all") String search, 
					@RequestParam (defaultValue = "") String keyword,
					@RequestParam(value = "pageNo", required=false, defaultValue = "1") int pageNo,
					TestDTO testDTO) { //파라미터명과 매개변수의 명이 동일하면 파라미터명 생략 가능
		//1.파라미터받기
		logger.info("testDTO: {}", testDTO);
		
		logger.info("이름: {}", userName);
		
		for (String h : hobbies) {
			logger.info("관심사: {}", h);
		}
		logger.info("검색분야: {}, 검색어: {}", search, keyword);
		logger.info("페이지번호: {}", pageNo);
		
		//2.비즈니스로직
		//3.Model
		//4.View
		return "form01Result";
	}
	
	
	//파라미터 Map 방식으로 받는 법
	//요청주소 http://localhost:8081/app/paramTest?name=홍&pw=1234
	@RequestMapping("/paramTest")
	public String paramTest (@RequestParam Map<String, Object> paramMap) {
		//Map참조변수명.put(Object키명, Object값)
		//Map참조변수명.get(Object키명)
		
		logger.info("파람name: {}, 파람pw: {}", paramMap.get("name"), paramMap.get("pw"));
		return "paramTest";	//paramTest.jsp 없기에 404에러 발생
	}
	
	
	//파라미터 Map 방식으로 받는 법
	//요청주소 http://localhost:8081/app/paramTest2?name=홍1&name=HONG2&name=이순신
	@RequestMapping("/paramTest2")
	public String paramTest2 (@RequestParam("name") List<String> nameList, HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		//List참조변수명.add(String값)
		//String 값 = List참조변수명.get(인덱스 번호)
		for (String n : nameList) {
			logger.info("파람name: {}", n);
		}
		
		return "paramTest";	//paramTest.jsp 없기에 404에러 발생
	}
	
	
	//요청주소 http://localhost:8081/app/board/hongid/silver/List/1
	//요청주소 http://localhost:8081/app/board/kimid/green/List/99
	//요청주소 http://localhost:8081/app/board/leeid/vip/List/100
	@RequestMapping("/board/{userId}/{grade}/List/{no}")
	public String pramTest3 (
			@PathVariable String userId,
			@PathVariable String grade,
			@PathVariable int no) {
		logger.info("@PathVariable userId: {}, grade: {}", userId, grade);
		logger.info("@PathVariable no: {}", no*99);
		return "paramTest";
	}
	
	
	// * value 부분이 달라도 이 메서드를 호출하고 싶은 경우 => @PathVariable 사용
	//@RequestMapping(value="요청경로", method="RequestMethod.GET / POST / DELETE / PUT 등")
	//GET 방식 요청과 POST 요청 둘 다 허용하는 코드 => method = {RequestMethod.GET, RequestMethod.POST}
	//요청경로만 작성시에는 'value =' 부분 생략 가능
	//요청주소 http://localhost:8081/app/test1
	//요청주소 http://localhost:8081/app/test2
	//요청주소 http://localhost:8081/app/test3 
	@RequestMapping(value="/test1")
	public String mappingTest () {
		return "paramTest";
	}
	
	//method가 GET 방식일 경우 @RequestMapping 대신 @GetMapping 사용 가능
	//POST, DELETE, PUT 다 가능
	
	
	//요청경로만 작성시에는 'value =' 부분 생략 가능
	//요청주소 http://localhost:8081/app/mt0
	//요청주소 http://localhost:8081/app/mt1
	//요청주소 http://localhost:8081/app/mt2 
	@RequestMapping(value= {"/mt0", "mt1", "mt2"} )
	public String mappingTest2 () {
		logger.info("mappingTest2() 호출");
		return "paramTest";
	}
	
	
	//-- Model -------------------------------------------------------------------------------
	
	//요청주소 http://localhost:8081/app/modelTest1
	/*방법1.
	 *매개변수에   Model인터페이스타입의  참조변수 선언후
	   요청메서드내부에서  참조변수명.addAttribute(String속성명,Object값);하여
	   view에게   model전달하는 방식
	  
	  *방법2.
	  *매개변수에   @ModelAttribute("속성명") 타입 매개변수명        선언하여
	    view에게   model전달하는 방식*/
	@RequestMapping(value= "/modelTest1" )
	public String modelTest1 (HttpServletRequest req, HttpSession session,Model model, @ModelAttribute("am5") TestDTO t) {
		logger.info("modelTest1() 호출");
		
		//방법2
		t.setUserName("@모델 attribute에서 설정한 유저명");
		
		
		//기존 방법
		//HttpSession session = req.getSession();
		req.setAttribute("m1", "HttpServletRequest 객체이용");
		session.setAttribute("m2", "HttpSession 객체이용");
		
		//방법1
		//model.addAttribute(String 속성명, Object값);
		model.addAttribute("am3", "스프링 프레임워크의 Model 객체이용");
		
		TestDTO testDTO = new TestDTO();
		testDTO.setUserName("강감찬");
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("바둑");
		hobbyList.add("독서");
		hobbyList.add("등산");
		hobbyList.add("명상을 가장한 잠자기");
		
		testDTO.setHobby(hobbyList);
		testDTO.setPageNo(150);
		testDTO.setSearch("title");
		testDTO.setKeyword("태풍");
		
		model.addAttribute("am4", testDTO);
		//속성명은 model값의 타입으로 사용되는 bean과 동일할 때에는 생략할 수 있다.
		model.addAttribute(testDTO);
	
		return "modelTest1";
	}
	
	
	//-- ModelAndView -------------------------------------------------------------------------------
	//요청주소 http://localhost:8081/app/modelViewTest1
	@RequestMapping("/modelViewTest1")
	public ModelAndView modelViewTest1 (ModelAndView mv) {
		//ModelAndView mv = new ModelAndView(); 
		mv.addObject("mav1", "Object 타입가능 ! !"); //model 작업
		mv.setViewName("modelViewTest1"); //View 지정
		return mv;
	}
	
	//요청주소 http://localhost:8081/app/modelViewTest2
	@RequestMapping("/modelViewTest2")
	public ModelAndView modelViewTest2 (ModelAndView mv) {
		//ModelAndView mv = new ModelAndView(); 
		mv.addObject("mav2", "하하하 호호호"); //model 작업
		
		//ModelAndView참조변수명.setViewName("redirect:요청주소")
		//요청주소로 요청 -> 해당 요청메서드에서 지정한 view가 user에게 보여진다
		mv.setViewName("redirect: /form01");
		return mv;
	}
	
	
	//요청주소 http://localhost:8081/app/modelViewTest3
	@RequestMapping("/modelViewTest3")
	public ModelAndView modelViewTest3 (ModelAndView mv, HttpServletRequest req) throws UnsupportedEncodingException {
		//ModelAndView참조변수명.setViewName("redirect:요청주소")
		//요청주소로 요청 -> 해당 요청메서드에서 지정한 view가 user에게 보여진다
		req.setCharacterEncoding("utf-8");
		mv.setViewName("redirect: /paramTest?name=h1&pw=1");
		return mv;
	}
}
