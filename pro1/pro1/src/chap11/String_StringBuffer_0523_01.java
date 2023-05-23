package chap11;

public class String_StringBuffer_0523_01 {

	public static void main(String[] args) {
		//String - immutable (불변)
		String name = "이순신";
		System.out.println(name);
		System.out.println(name.hashCode());
		
		String name2 = name + "장군";
		System.out.println(name2);
		System.out.println(name2.hashCode());

		//StringBuffer - String클래스와 달리 내용을 변경할 수 있다 (mutable)
		StringBuffer sb = new StringBuffer("김구"); 
		System.out.println("sb = " + sb);
		System.out.println("sb = " + sb.hashCode());
		
		sb.append("지도자");
		System.out.println("sb = " + sb);
		System.out.println("sb = " + sb.hashCode());
	}

}
