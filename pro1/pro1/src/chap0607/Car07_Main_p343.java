package chap0607;

//p343
public class Car07_Main_p343 {

	public static void main(String[] args) {
		Car07 car = new Car07();
		
		for (int i = 1; i<=5 ;i++) {
			//문제없으면 0, 1 2 3 4 
			System.out.println("▶ " + i + "번째 run()호출");
			int problemLoc = car.run();
			switch (problemLoc) {
			case 1: 
				System.out.println("전면 좌측 새 타이어로 교체" );
				car.fL_Tire = new TireHanKook("전면 좌측", 15);
				break;
			case 2:
				System.out.println("전면 우측 HanKook로 교체" );
				car.fR_Tire = new TireHanKook("전면 우측", 13);
				break;
			case 3:
				System.out.println("후면 좌측 Kumho로 교체" );
				car.bL_Tire = new TireKumho("후면 좌측", 14);
				break;
			case 4:
				System.out.println("후면 우측 새 타이어로 교체" );
				car.bR_Tire = new TireHanKook("후면 우측", 17);
				break;
				
			}
			System.out.println("=======");
		}
	}

}
