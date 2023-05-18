package hw;

public class Student {
	//필드
	private String school = "dd 대학교";
	private String major = "컴퓨터 공학과";
	private double gpa = 4.2;
	
	//등교를 한다
	void gtschool() {
		System.out.println("학교에 가는 중입니다.");
	}
	
	//하교를 한다
	void gthome() {
		System.out.println("집에 가는 중 입니다.");
	}
	
	//과제를 한다
	void taskDo() {
		System.out.println("과제 중입니다.");
	}
	
	//과제를 끝내다
	void taskFi() {
		System.out.println("과제를 끝냈습니다.");
	}
	
	//메소드 : [접근제어자] [제어자] 리턴유형 메서드명 (매개변수리스트) {}
	 
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	 
	
	
	
	 public String getSchool() {
		 return school;
	 }
	 
	 public String getMajor() {
		 return major;
	 }
	 
	 public double getGpa() {
		 return gpa;
	 }
		
	 double gpaMul(double gpa) {
		 return gpa * gpa;
	 }
	
	 double gpaMul (double gpa, double arr) {
		 return gpa * arr;
	 }
		
}
