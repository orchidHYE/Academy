package other;

//접근제한자 (AccessModifier)
/* 클래스 및 클래스의 구성 멤버에 대한 접근을 제한하는 역할
 * 다른 패키지에서 클래스를 사용하지 못하도록 (클래스 제한)
 * 클래스로부터 객체를 생성하지 못하도록 (생성자 제한)
 * 트정 필드와 메소드를 숨김처리 (필드와 메소드 제한)
 
 * 접근 제한자의 종류 (p293)
 * public    : 제한없음
 * protected : (클래스 X) 자식 클래스가 아닌 다른 패키지에서 접근제한 (상속받은 관계일땐 접근 가능) 
 * default   : 다른 패키지에서 접근제한
 * private   : (클래스 X)모든 다른 클래스에서 접근을 제한
 */
public class AccessModifier01 {
	private   int pri = 10;
			  int pack= 10; //default
	protected int pro = 10;
	public    int pub = 10;
	
	void test () {
		pri = 20;
		pack= 20;
		pro = 20;
		pub = 20;
	} //동일한 클래스에서 전부 접근 가능

}
