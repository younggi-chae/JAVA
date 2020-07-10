package lambda;

//����� ���� �Լ��� �������̽�
public class Lambda005 {

	public static void main(String[] args) {
		MyFunctionalInterface mfi =  a -> a*a;  //(int a) -> { return a*a; };
		                                        //Ÿ�� ���� ���
		int b = mfi.runSomething(5);
		
		System.out.println(b);

	}

}


@FunctionalInterface
interface MyFunctionalInterface {
	public abstract int runSomething(int count);
}