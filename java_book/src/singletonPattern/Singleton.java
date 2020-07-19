package singletonPattern;

public class Singleton {
	static Singleton singletonObject; // ���� ���� ����
	
	private Singleton() { };  // private ������
	
	//��ü ��ȯ ���� �޼���
	public static Singleton getInstance() {
		if(singletonObject == null) {
			singletonObject = new Singleton();
		}
		
		return singletonObject;
	}

	
}

