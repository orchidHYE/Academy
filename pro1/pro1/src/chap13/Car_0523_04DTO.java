package chap13;

import java.util.Date;

//DTO : Data Transfer Object => getter, setter
//new Car("기아", "더 뉴레이 1.0", 10000, 12.7, new Date(121,9,1), true)
//new Car("현대", "제네시스GV80", 36000, 10.4, new Date(100,4,4), true)
//new Car("쌍용", "티볼리"      , 40000, 11.4, new Date(119,5,5), true)

//VO : Value Object => getter / read only 성격
public class Car_0523_04DTO {
	//필드
	//[접근제한자] [제어자] 타입 필드명[=초기값];
	private String manufacturer;
	private String model;
	private int runDistant;
	private double fuelEco;
	private Date madeDate;
	private boolean hasNavi;
	
	//생성자 
	//[접근제한자] [제어자] 클래스명 (매개변수리스트) {}
	public Car_0523_04DTO () {}
	public Car_0523_04DTO (String manufacturer, String model, int runDistant, double fuelEco, Date madeDate, boolean hasNavi) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.runDistant = runDistant;
		this.fuelEco = fuelEco;
		this.madeDate = madeDate;
		this.hasNavi = hasNavi;
	}
	
	//메소드
	//[접근제한자] [제어자] 리턴타입 메소드명(매개변수리스트) {}
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getRunDistant() {
		return runDistant;
	}
	
	public void setRunDistant(int runDistant) {
		this.runDistant = runDistant;
	}
	
	public double getFuelEco() {
		return fuelEco;
	}
	
	public void setFuelEco(double fuelEco) {
		this.fuelEco = fuelEco;
	}
	
	public Date getMadeDate() {
		return madeDate;
	}
	
	public void setMadeDate(Date madeDate) {
		this.madeDate = madeDate;
	}
	
	public boolean isHasNavi() {
		return hasNavi;
	}
	
	public void setHasNavi(boolean hasNavi) {
		this.hasNavi = hasNavi;
	}
	
	@Override
	public String toString() {
		return "Car_0523_04DTO [manufacturer=" + manufacturer + ", model=" + model + ", runDistant=" + runDistant
				+ ", fuelEco=" + fuelEco + ", madeDate=" + madeDate + ", hasNavi=" + hasNavi + "]";
	}
	
}
