package ex.exception;

public class exceptionEx4 {

	public static void main(String[] args) {
		method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");

	}
        static void method1() {
        	try {
        		System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
        		return;  //try�� return�� ����, finally�� ����??
        	} catch(Exception e) {
        		e.printStackTrace();
        	} finally { // finally���� ���� �߻����ο� ������� ������ ����ȴ�.
        		System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
        	}
        }
}
