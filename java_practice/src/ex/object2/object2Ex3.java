package ex.object2;

class Factorial {} 

public class object2Ex3 {

	public static void main(String[] args) {
		int result = factorial(4); // int result = Factorial.factorial(4);
		System.out.println(result);

	}

	static int factorial(int n) { // static�޼����̹Ƿ� �ν��Ͻ��� �������� �ʰ� ���� ȣ�� ����
		int result = 0;
      //n�� ���� 0�̳� ū ���� �Է��ϰ� �Ǹ� stack Overflow Error �߻�, ��ȿ���˻� �ʿ�
		if (n == 1) { 
			result = 1;
		} else {
			result = n * factorial(n - 1); // ���ȣ�� �߻�
		}
		return result;

	}
}
