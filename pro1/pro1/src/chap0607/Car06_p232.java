package chap0607;

import java.util.Date;

/*생성자 (constructor) : new 연산자에 의해 호출되어 객체의 초기화 담당
					     필드의 값 설정
					     메소드 호출해 객체를 사용할 수 있도록 준비하는 역할 수행

 *기본 생성자 (Default Constructor)
    모든 클래스는 생성자가 반드시 존재하며 하나 이상 가질 수 있음
    생성자 선언을 생략하면 컴파일러는 기본 생성자 추가
*/
public class Car06_p232 {
	//필드
	private String company;
	private int price;
	private char grade; //에너지 등급
	private boolean isHybrid; //하이브리드 유무
	private Date proDay; //생산일
	
	//생성자
	//생성자 오버로딩
	public Car06_p232 () {}
	public Car06_p232 (String company, int price, char grade,
			boolean isHybrid, Date proDay) {
		this.company = company;
		this.price = price;
		this.grade = grade;
		this.isHybrid = isHybrid;
		this.proDay = proDay;
	}
	
	public Car06_p232 (String company, int price) {
		this(company, price, 'B', false, new Date());
		//주의.생성자 내의 반드시 첫번째 줄에서 호출해야만 한다.
	}
	
	public Car06_p232 (int price) {
		this("첨단자동차", price, 'B', false, new Date());
	}
	public Car06_p232 (String company) {
		this(company, 2600, 'B', false, new Date());
	}
	//생성자내에서 동일 클래스내의 또 다른 생성자는 this()를 이용하여 호출할 수 있다.
	
	
	//메소드
	public String getCompany() {
		return company;
	}
	
	public int getPrice() {
		return price;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public boolean isHybrid() {
		return isHybrid;
	}
	
	public Date getProDay() {
		return proDay;
	}
	
	public void showInfo () {
		System.out.println("[company]: " + company +
						   ",[price]: " + price +
						   ",[grade]: " + grade + 
						   ",[isHybrid]: " + isHybrid + 
						   ",[proDay]: " + proDay);
	}	
	
	/* 내가 선언
	@Override
	public String toString() {
		return  "[company]: " + company +
				",[price]: " + price +
				",[grade]: " + grade + 
				",[isHybrid]: " + isHybrid + 
				",[proDay]: " + proDay;
	}
	*/
	
	@Override
	public String toString() {
		return "Car06_p232 [company=" + company + ", price=" + price + ", grade=" + grade + ", isHybrid=" + isHybrid
				+ ", proDay=" + proDay + "]";
	}
	
}
