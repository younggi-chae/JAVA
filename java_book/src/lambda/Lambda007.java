package lambda;

//�޼��� ���ڷ� ���ٽ�(�Լ��� �������̽�) ���
public class Lambda007 {

	public static void main(String[] args) {
		doIt(a -> a*a);

	}
	
	public static void doIt(MyFunctionalInterface mfi) {
		int b = mfi.runSomething(5);
		
		System.out.println(b);
	}

}
