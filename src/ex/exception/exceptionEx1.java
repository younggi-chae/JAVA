package ex.exception;

public class exceptionEx1 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10); //ArithmeticException
				System.out.println(result);                   //������ 0���� ���� �� ����
 			} catch (ArithmeticException e) {
				System.out.println("0"); //ArithmeticException�� �߻��ϸ� ����Ǵ� �ڵ�
			}
		}
	}

}
