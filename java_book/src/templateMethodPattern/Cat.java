package templateMethodPattern;

public class Cat extends Animal {
	@Override
	//�߻� �޼��� �������̵�
	void play() {
		System.out.println("�߿�! �߿�!");
	}
	
	@Override
	//hook(����) �޼��� �������̵�
	void runSomething() {
		System.out.println("�߿�! �߿�!~ ���� ��� ���~");
	}
}

