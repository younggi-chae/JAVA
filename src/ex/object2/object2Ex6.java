package ex.object2;

class MemberCall{
	int iv = 10; //�ν��Ͻ�����
	static int cv = 20; //Ŭ��������
	
	int iv2 = cv;
     //static int cv2 = iv     //�����߻�. Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv; // ��ü�� �����ϸ� ��밡��
	
	static void staticMethod1() {
		System.out.println(cv);
	    //System.out.println(iv);      //�����߻�. Ŭ�����޼��忡�� �ν��Ͻ����� ���Ұ�
	    MemberCall c = new MemberCall();
	    System.out.println(c.iv);  //��ü ���� �� ��밡��
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // �ν��Ͻ��޼��忡���� �ν��Ͻ������� �ٷ� ��밡��
	}
	static void staticMethod2() {
		staticMethod1();
		//intstanceMethod1(); //�����߻�. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		MemberCall c= new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ� ������ �� ȣ�Ⱑ��
	}
	void instanceMethod2() {  //�ν��Ͻ��޼���� �ν��Ͻ��޼���, Ŭ�����޼��� ��� �ν��Ͻ� �������� ȣ�Ⱑ��
		staticMethod1();
		instanceMethod1();
		
	}
}

public class object2Ex6 {

	public static void main(String[] args) {
		

	}

}
