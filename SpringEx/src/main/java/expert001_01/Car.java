package expert001_01;

public class Car {
	Tire tire;
	
	public Car() {
		tire = new KoreaTire();
		//tire = new AmericaTire();
	}
	
	public String getTireBrand() {
		return "������ Ÿ�̾� : " + tire.getBrand();
	}
}
