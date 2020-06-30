package ex.object3;

class Product{
	static int count = 0; //Ŭ���� ���� , ������ �ν��Ͻ��� ���� �����ϱ� ���� ����, ���� �ν��Ͻ� ������ �����ߴٸ� �ν��Ͻ��� ������ ������ 0���� �ʱ�ȭ
	int serialNo; // �ν��Ͻ� ������ȣ
	
	{  //�ν��Ͻ� �ʱ�ȭ ��
		++count;  // Product�ν��Ͻ��� ������ ������ count�� ���� 1�� �������Ѽ� serialNo�� �����Ѵ�.
		serialNo = count;
	}
	
	public Product() {}  //�⺻������, ��������, �����ڸ� ����ص� ����� ������ ��� �����ڿ��� �������� ����Ǿ���ϴ� �����̱⿡ �ν��Ͻ� �� ���
}

public class initializationEx2 {

	public static void main(String[] args) {
		 Product p1 = new Product();
		 Product p2 = new Product();
		 Product p3 = new Product();
		 
		 System.out.println("p1�� ��ǰ��ȣ(serial no)�� "+p1.serialNo);
		 System.out.println("p2�� ��ǰ��ȣ(serial no)�� "+p2.serialNo);
		 System.out.println("p3�� ��ǰ��ȣ(serial no)�� "+p3.serialNo);
		 System.out.println("����� ��ǰ�� ���� ��� "+Product.count+"�� �Դϴ�.");
	}

}
