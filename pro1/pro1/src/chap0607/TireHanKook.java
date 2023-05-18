package chap0607;

//p342 : TireHanKook클래스는 Tire를 상속받는 하위 클래스이다
public class TireHanKook extends Tire {
	//필드
	
	//생성자
	TireHanKook (String location, int maxRotation) {
		super(location, maxRotation);
	}

	//메소드
	@Override
	boolean roll() {
		++accmulatedRotation;
		if ( accmulatedRotation< maxRotation) {
			System.out.println(location + "Hankook 수명 : " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println(location + "Hankook 펑크 ! ! ");
			return false;
		}
	}
}
