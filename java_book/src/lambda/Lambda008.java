package lambda;

//�޼��� ��ȯ������ ���ٽ�(�Լ��� �������̽�) ���
public class Lambda008 {

	public static void main(String[] args) {
		MyFunctionalInterface mfi = todo();
		
		int result = mfi.runSomething(5);
		
		System.out.println(result);

	}
	
	public static MyFunctionalInterface todo() {
		return num -> num * num;
	}

}
