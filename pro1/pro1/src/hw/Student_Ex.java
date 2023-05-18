package hw;

public class Student_Ex {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu); //주소출력
		
		//System.out.println(stu.school);
		//System.out.println(stu.major);
		//System.out.println(stu.gpa);
		
		
		//getter 호출하여 접근제한의 변수 값 가져오기
		//setter 호출하여 접근제한의 변수 값 수정하기
		String school = stu.getSchool();
		System.out.println("변경전 : " + school);
		
		stu.setSchool("중앙대학교");
		System.out.println("변경후 : " + stu.getSchool());
		
		System.out.println("");
		
		String major = stu.getMajor();
		System.out.println("변경전 : " + major);
		
		stu.setMajor("컴공과");
		System.out.println("변경후 : " + stu.getMajor());
		
		System.out.println("");

		double gpa = stu.getGpa();
		System.out.println("변경전 : " + gpa);
		
		stu.setGpa(4.0);
		System.out.println("변경후 : " + stu.getGpa());
		
		System.out.println("--오버로딩--");
		
		System.out.println(stu.gpaMul(10));
		System.out.println(stu.gpaMul(10, 5));
		
		
		
		
	}

}
