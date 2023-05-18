package chap0607;

//p256 : 메서드의 return
//[접근제어자] [제어자] class 클래스명 {}
public class Car03 {
	//필드 (field) : 데이터
			//타입 필드명 = 값;
			private int gas;
	
	
			//생성자 (constructor)
			//클래스명 (매개변수리스트) {}
			
			//메소드 (method) : 기능.동작
			//리턴유형 메서드명(매개변수리스트) {}
			
			//gas필드의 값을 제공
			int getGas () {
				return this.gas;
			}
			
			//gas필드의 값을 변경
			void setGas (int gas) {
				this.gas = gas;
			}
			
			//gas량 체크
			//리턴유형 메서드명(매개변수리스트) {}
			boolean isLeftGas() {
				if (gas == 0) {
					return false;
				}
				return true;
			}
			
			//달리는 기능
			//리턴유형 메서드명(매개변수리스트) {}
			void run () {
				while (true) {
					if (isLeftGas()) {
						System.out.println("달립니다 / 가스량 = " + gas);
						gas -= 10;
					} else {
						System.out.println("멈춥니다 / 가스량 = " + gas);
						return; //메서드 종료
					}
					
				}
				
			}
			
}




