package chap11;

//p488:문자열비교
//기본타입 변수값을 비교할 때에는 ==연산자를 사용
//but 문자열비교시에는 값을 비교할 때에는 equals()를 사용
public class String01_p489_hye {

	public static void main(String[] args) {
		// 주소==주소
		// 참조변수.equals(참조변수)
		// 기준문자열.equals(비교문자열)
		
		String name1 = "홍길동";
		String name2 = "홍길동";	
		//System.out.println("name1="+name1.to);
		//System.out.println("name2="+name2);
		if(name1==name2) {
			System.out.println("==일치합니다");//주소가 동일하므로 출력
		}else {
			System.out.println("==일치x");
		}
		if(name1.equals(name2)) {
			System.out.println("equals()일치합니다");//값이 동일하므로 출력
		}else {
			System.out.println("equals()일치x");
		}
		System.out.println("-------------------------");
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");	
		
		//System.out.println("name3="+name3);
		//System.out.println("name4="+name4);
		if(name3==name4) {
			System.out.println("new String()==일치합니다");
		}else {
			System.out.println("new String()==일치x");//주소가 동일x하므로 출력
		}
		if(name3.equals(name4)) {
			System.out.println("equals()일치합니다");//값이 동일하므로 출력
		}else {
			System.out.println("equals()일치x");
		}
		
	}

}








