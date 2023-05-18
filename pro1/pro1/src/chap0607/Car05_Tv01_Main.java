package chap0607;

//이 클래스는 Car05의 실행클래스이다
public class Car05_Tv01_Main {

	public static void main(String[] args) {
		//클래스명 참조변수 = new
		Car05 myCar = new Car05();
		System.out.println(myCar);
		
		
		
		System.out.println(myCar.brand); //Machine을 상속받은 Car05의 필드를 사용
		System.out.println(myCar.color);
		System.out.println(myCar.proDay);
		System.out.println(myCar.power);
		myCar.powerOn();
		myCar.powerOff();
		
		System.out.println(myCar.currentSpeed);
		System.out.println(myCar.maxSpeed);
		
		myCar.speedUp(50);
		System.out.println(myCar.currentSpeed);
	
		System.out.println("=========");
		System.out.println();
		
		Tv01 myTv = new Tv01();
		System.out.println(myTv);
		
		System.out.println(myTv.brand); 
		System.out.println(myTv.color);
		System.out.println(myTv.proDay);
		System.out.println(myTv.power);
		System.out.println(myTv.volume);
		System.out.println(myTv.maxVolume);
		System.out.println(myTv.resoultion);
		
		myTv.powerOn();
		
		myTv.volumeUp(15);
		myTv.volumeDown(5);
		
		
		myTv.powerOff();
	}

}
