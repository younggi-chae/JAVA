package ex.object3;

class Car2 {
	String color;       //����
	String gearType;    //���ӱ�����
	int door;           //���� ����
	
	Car2() {
		this("white","auto", 4); //Car2(String color, String gearType, int door) ȣ��
	}                            //������ �� ȣ���� ������ �̸���� this�� ���
	
	Car2(String color){
		this(color,"auto", 4);
	}   
	Car2(String color, String gearType, int door){ //�Ű������� �ִ� ������
		this.color = color; // this.color�� �ν��Ͻ�����, color�� ������ �Ű������� ���ǵ� ��������
		this.gearType = gearType;
		this.door = door;
	}
}
   //this - �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�. ��� �ν��Ͻ��޼��忡 ���������� ������ ä�� ����
   //this(), this(�Ű�����) - ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���

public class constructorEx3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
        Car2 c3 = new Car2("dark", "manual", 2);
		
		System.out.println("c1�� color = "+c1.color+", gearType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2�� color = "+c2.color+", gearType = "+c2.gearType+", door = "+c2.door);
		System.out.println("c3�� color = "+c3.color+", gearType = "+c3.gearType+", door = "+c3.door);
	}

}
