package chap0607;

//this   : 해당 클래스의 객체주소가 저장된 참조변수
//this() : (동일 클래스내의) 다른 생성자 호출 p.248
//반드시 생성자내의 첫번째 줄에서 호출해야 한다.

//super   : 해당 클래스의 상위 클래스의 객체주소가 저장된 참조변수
//super() : 상위 클래스의 생성자 호출
//생성자내에서만 호출되며 반드시 첫번째 줄에서 호출해야한다.

class Grandmother {
	Grandmother (int a) {
		System.out.println("Grandmother(int)");
	}
	Grandmother () {
		System.out.println("Grandmother()");
	}
	
}

class Mother extends Grandmother {
	int a;
	Mother (int a) {
		super(a);
		System.out.println("Mother(int)");
	}
	//생성자
	Mother () {
		//super();
		System.out.println("Mother()");
	}
	
	void aa () {}
}

class Daughter extends Mother {
	//생성자
	Daughter (int b) {
		super(b);
		System.out.println("Daughter(int)");
	}
	Daughter () {
		super(); //부모클래스의 생성자를 호출 //명시적호출 //명시적호출 없을시 묵시적으로 자동 호출되는데 한다면 안함 
		System.out.println("Daughter()");
		//Constructor call must be the first statement in a constructor
	}
	
	/*
	void bb () {
		super(); //error
		//Constructor call must be the first statement in a constructor
	}
	*/
	
}


public class Super_p313 {

	public static void main(String[] args) {
		//딸 객체 생성
		Daughter d1 = new Daughter(10000);
	}

}
