package ex.polymorphism;

//����Ŭ������ �ڼ�Ŭ������ ������� �ߺ����� ����
class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method"); 
	}
}

public class polymorphismEx3 {

	public static void main(String[] args) {
       //p�� c ��� Child�ν��Ͻ��� ����
		Parent p = new Child(); //����Ÿ���� �������� p�� Child�ν��Ͻ��� ������� ���
		Child c = new Child();  //�ڼ�Ÿ���� �������� c�� Child�ν��Ͻ��� ������� ���

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		//�޼����� method()�� ��� ���������� Ÿ�Կ� ������� �׻� ���� �ν��Ͻ��� Ÿ���� ChildŬ������ ���ǵ� �޼��� ȣ��
		//�ν��Ͻ������� x�� ���������� Ÿ�Կ� ���� �޶���
	}

}
