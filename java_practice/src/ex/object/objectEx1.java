package ex.object;

class Tv {
	// Tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;

	// Tv�� ���(�޼���)
	void power() {
		power = !power;
	} // power�� ���� true�� false��, false�� true�� �����ϴ� ����

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

public class objectEx1 {

	public static void main(String[] args) {

		Tv t1 = new Tv(); // Tv�ν��Ͻ� ����
		Tv t2 = new Tv();

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t1.channel = 7; // channel�� ���� 7�� �Ѵ�.
		t1.channelDown(); // Tv�ν��Ͻ��� �޼��� channelDown�� ȣ��
		t2.channel = 11;
		t2.channelUp();
		System.out.println("t1�� channel�� " + t1.channel + "������ ����Ǿ����ϴ�.");
		System.out.println("t2�� channel�� " + t2.channel + "������ ����Ǿ����ϴ�.");
	}

}
