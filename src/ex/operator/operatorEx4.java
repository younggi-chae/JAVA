package ex.operator;

public class operatorEx4 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		
		long c = a * b; //2,000,000,000,000??
		System.out.println(c); //������ �ս��� �Ͼ��.
		// intŸ�� * intŸ�� = intŸ��, long���� ��������ȯ�� �ؾ���.
		
	    long a1 = 1000000 * 1000000; //intŸ�� * intŸ��
	    long b1 = 1000000 * 1000000L;// intŸ�� * longŸ��
	    
	    System.out.println(a1); //�����÷ο� �߻�
	    System.out.println(b1); //��Ȯ�� �����
	}

}
