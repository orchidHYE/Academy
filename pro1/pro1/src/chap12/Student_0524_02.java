package chap13;

//p575
//이 클래스는 학생의 여러정보 보관, 제공, 설정 기능
/* 			map1.put(1 여 "경영" "홍길동", 100);
			map1.put(2 남 "컴공" "이순신", 95);
			map1.put(3 여 "국문" "세종대왕", 90);
			map1.put(4 남 "국문" "세종대왕", 90); */
public class Student_0524_02 {
	//필드
	private int studentNo; //학번
	private String studentName; //학생명
	private String major; //전공
	private char gender; //성별
	
	
	//생성자
	public Student_0524_02 () {}
	public Student_0524_02 (int studentNo, String studentName, String major, char gender) {
				this.studentNo = studentNo;
				this.studentName = studentName;
				this.major = major;
				this.gender = gender;
	}
	
	
	//메서드
	@Override
	public String toString() {
		return this.studentNo + "학번" +this.studentName;
	}
	
	/* 동등 객체라면 같은 키로 간주하고 중복 저장되지 않도록 하기 위해, hashCode()의 리턴값이 같고
	   equals() 메서드가 true이면 동등 객체로 처리한다 */
	
	@Override
	public int hashCode() {
		return this.studentNo;
	}
	
	@Override
	//자신과 (매개변수  Object obj변수에 담긴)비교객체가 동일하면 true리턴, 그렇지 않으면 false리턴
	public boolean equals(Object obj) {
		//obj != null 참조변수 obj에 null이면 안된다 -> 객체 주소가 존재
		//obj instanceof Student_0524_02 참조변수 obj의 객체가 Student_0524_02클래스의 객체라면 true  
		if (obj != null && obj instanceof Student_0524_02) {
			//(Student_0524_02) obj 참조변수 obj의 클래스를 Student_0524_02클래스로 강제형벼화
			Student_0524_02 student = (Student_0524_02) obj;
			return this.studentNo == student.studentNo; //객체 자신의 학번 = 매개변수에 담긴 학생의 학번
		} else {
			return false;
		}
	}
	
}
