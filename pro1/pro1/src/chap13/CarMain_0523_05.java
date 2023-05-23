package chap13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//CarDTO 객체들을 하나의 변수에 저장, 출력 등의 조작
public class CarMain_0523_05 {

	public static void main(String[] args) {
		//Set타이 carSet 선언 -> 값 저장 -> 출력
		Set<Car_0523_04DTO> carSet = new HashSet<Car_0523_04DTO>();
		
		carSet.add(new Car_0523_04DTO ("기아", "더 뉴레이 1.0", 10000, 12.7, new Date(121,9,1),true));
		carSet.add(new Car_0523_04DTO ("현대", "제네시스GV80", 36000, 10.4, new Date(100,4,4), true));
		carSet.add(new Car_0523_04DTO ("쌍용", "티볼리", 40000, 11.4, new Date(119,5,5), true));
		
		Iterator<Car_0523_04DTO> iter = carSet.iterator();
		while (iter.hasNext()) {
			//int len = iter.next().getManufacturer().length();
			Car_0523_04DTO car = iter.next();
			System.out.println(car);
		}
		
		System.out.println("=======================");
		
		//List타입 carList 선언 -> 값 저장 -> 출력
		List<Car_0523_04DTO> carList = new ArrayList<Car_0523_04DTO>();
		
		carList.add(new Car_0523_04DTO ("기아", "더 뉴레이 1.0", 10000, 12.7, new Date(121,9,1),true));
		carList.add(new Car_0523_04DTO ("현대", "제네시스GV80", 36000, 10.4, new Date(100,4,4), true));
		carList.add(new Car_0523_04DTO ("쌍용", "티볼리", 40000, 11.4, new Date(119,5,5), true));
		
		for (Car_0523_04DTO car : carList) {
			System.out.println(car.getManufacturer());
		}
		

		System.out.println("=======================");
		
		//cars라는 배열 선언
		Car_0523_04DTO[] cars = new Car_0523_04DTO[3];
		cars[0] = new Car_0523_04DTO("기아", "더 뉴레이 1.0", 10000, 12.7, new Date(121,9,1),true);
		cars[1] = new Car_0523_04DTO("현대", "제네시스GV80", 36000, 10.4, new Date(100,4,4), true);
		cars[2] = new Car_0523_04DTO("쌍용", "티볼리", 40000, 11.4, new Date(119,5,5), true);
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			System.out.println(cars[i].getManufacturer());
			System.out.println(cars[i].getModel());
		}
		
	}
	
}
