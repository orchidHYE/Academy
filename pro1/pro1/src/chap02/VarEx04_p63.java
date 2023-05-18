package chap02;

//char타입 (p63): 하의 문자열을 ''로 감싼 문자리터럴
public class VarEx04_p63 {

	public static void main(String[] args) {
		char v1 ='a';
		System.out.println(v1);
		
		char v2 ='1';
		System.out.println(v2);
		
		char v3 ='가';
		System.out.println(v3);
		
		//------------------------
		int v4 = 97;
		System.out.println(v4);//97
		char v5 = 97;
		System.out.println(v5);//a
		
		//------------------------
		//String 문자열
		//String 클래스 타입
		String v6 = "a"; 
		System.out.println(v6);
		
		//p66 이스케이프 문자
		System.out.println("번호\t이름\t직업");
		System.out.print("행단위출력\n");
		System.out.print("행단위출력\r\n");
		System.out.println(" '작은'따옴표");
		System.out.println(" \"큰\"따옴표");
		System.out.println("");
	}

}
