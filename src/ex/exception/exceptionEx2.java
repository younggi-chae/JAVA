package ex.exception;

public class exceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch(Exception e) {
			System.out.println(5); //���ܹ߻� x , catch���� ������� �ʴ´�.
		}
            System.out.println(6);
            
            System.out.println(7);
            System.out.println(8);
            try {
            	System.out.println(9);
            	System.out.println(0/0); //ArithmeticException �߻�
            	System.out.println(10);  //���ܹ߻� ���Ŀ� try���� ������� ������� �ʴ´�.
            } catch(ArithmeticException ae) {
            	ae.printStackTrace(); // ���ܹ߻� ����� ȣ�⽺�ÿ� �־��� �޼��������� ���ܸ޽����� ���
            	System.out.println(ae.getMessage());  // �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޼��� ���
            }
                System.out.println(11);
	}         //try���� ���Խ�ų �ڵ��� ������ �� �����Ͽ��߸� �Ѵ�.

}

          