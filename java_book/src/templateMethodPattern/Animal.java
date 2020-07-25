package templateMethodPattern;

public abstract class Animal {
	//���ø� �޼���
	public void playWithOwner() {
		System.out.println("�Ϳ����� �̸���~");
		play();
		runSomething();
		System.out.println("���߾�!");
	}
	//�߻� �޼���
	abstract void play();
	
	//hook(����) �޼���
	void runSomething() {
		System.out.println("���� ��� ���..");
	}
}


