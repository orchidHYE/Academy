package chap0607;

public class Inheritance {
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {
		System.out.println("power on");
	}
	
	void powerOff() {
		System.out.println("power off");
	}
	
	void bell () {
		System.out.println("bell~~~~~");
	} 
	
	void sendVoice (String message) {
		System.out.println("me: " + message);
	}
	
	void receiveVoice (String message) {
		System.out.println("you: " + message);
	}
	
	void hangup () {
		System.out.println("전화 끊음");
	}
}

