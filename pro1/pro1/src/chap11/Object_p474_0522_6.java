package chap11;

//Object 클래스
/* hashCode(): 객체의 해시코드를 반환하는 메서드
	-> Object 클래스의 hashCode()메서드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴
	객체마다 다른 값을 가진다
	//객체의 해시코드란? 객체를 식별하는 하나의 정수값을 말한다.

	//p488:문자열비교
	//기본타입 변수값을 비교할 때에는 ==연산자를 사용
	//but 문자열비교시에는 값을 비교할 때에는 equals()를 사용 
 */
public class Object_p474_0522_6 {

	public static void main(String[] args) {
		//주소 == 주소
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1 == str2);
		//결과 = true
		//이유:  ==는 주소지를 비교하는 연산자이기 때문에, str1과 str2의 주소지는 동일하기 때문에 true의 값이 출력된다
	
		System.out.println(str1); //Hello
		System.out.println(str2); //Hello
		
		System.out.println(str1.hashCode()); //69609650
		System.out.println(str2.hashCode()); //69609650
		//해시코드가 동일하다 => 동일객체 => 객체의 주소가 동일하다
		
		System.out.println("========================");
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str3 == str4);
		//결과 = false
		//이유:  new 연산자는 새로운 객체를 생성하는 연산자이기 때문에 str3 과 str4는 서로 다른 주소지에 저장되어 false 값이 출력된다
		
		if (str3.equals(str4)) {
			System.out.println("equals() 일치");
		} else {
			System.out.println("equals() 불일치");
		}
		
/*		
 		참고
 		String 클래스에서는 hashCode()를 재정의하여 동일주소를 리턴하였다
		System.out.println(str3.hashCode()); //69609650
		System.out.println(str4.hashCode()); //69609650
		동일한 해시코드가 출력됐는데.. 왜지
		문자열을 생성할 때 기존에 생성한 문자열이 있다면 동일한 문자열을 지목함. 그래서 해시코드가 출력된것
		== 연산자는 서로 다른 주소값을 가리켜서 false값 출력
		hashCode()는 java.lang.String.hashCode()
		Object는 값이 같아도 새로운 주소값을 생성하지만, String소속인 hashCode()는 값이 같으면 동일한 해시코드를 갖게됨.
*/
	}

}
