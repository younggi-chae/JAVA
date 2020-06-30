package ex.polymorphism;
//���������� ����ȯ
class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~");
	}
}

public class polymorphismEx1 {

	public static void main(String[] args) {
		Car car = null; //null������ �ʱ�ȭ
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();  //fe�� �����ϰ� �ִ� �ν��Ͻ��� �������� car�� �����ϵ��� �Ѵ� (car = fe;)
		car = fe;   // car = (Car)fe; ���� ����ȯ�� ����, ��ĳ���� , fe�� �޸� car�� CarŸ���̹Ƿ� CarŬ������ ����� �ƴ� water();�� ���x
		//car.water(); // �����Ͽ���, CarŸ���� ���������δ� water()�� ȣ���� �� ����.
		fe2 = (FireEngine)car; //����Ÿ�� > �ڼ�Ÿ��(�ٿ�ĳ����), ���������ȯ �ʼ�
		fe2.water(); // car�� �޸� fe2�� FireEngineŸ���̹Ƿ� FireEngine�ν��Ͻ� ��� ������� ����� �� ����.
        
		Car c1 = new Car();
		Car c2 = null;
		FireEngine f1 = null;
		
		car.drive();
		f1 = (FireEngine)car; //�ٿ�ĳ����
		f1.drive();
		c2 = f1; //��ĳ����
		c2.drive(); 
	}
       
}
