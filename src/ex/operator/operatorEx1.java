package ex.operator;

public class operatorEx1 {

	public static void main(String[] args) {
		int i = 5 , j = 0;
		
		j = i++; // ������, �����Ͽ� ���� �Ŀ� ����
		System.out.println("j=i++; ���� ��,  i="+i+", j="+j);
		// ��� i=6, j=5
		i = 5;
		j = 0;
		
		j = ++i; // ������, ���� �Ŀ� �����Ͽ� ����
		System.out.println("j=i++; ���� ��,  i="+i+", j="+j);
		//��� i=6, j=6
	}

}
