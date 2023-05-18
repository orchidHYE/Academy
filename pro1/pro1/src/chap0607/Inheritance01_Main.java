package chap0607;

public class Inheritance01_Main {

	public static void main(String[] args) {
		Inheritance01 ex = new Inheritance01();
		
		System.out.println(ex.model);
		System.out.println(ex.color);
		
		System.out.println(ex.channel);
		
		ex.powerOn();
		ex.bell();
		ex.sendVoice("여보세요");
		ex.receiveVoice("홍길동입니다 ~");
		ex.sendVoice("hi");
		ex.hangup();
		
		System.out.println("========");
		
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
				
	}
	
}
