package ex.object2;

public class object2Ex4 {

	static long factorial(int n) {
		if (n <= 0 || n > 20)
			return -1; // �Ź躯�� ��ȿ���˻�
		if (n <= 1)
			return 1;
		return n * factorial(n - 1); //���ȣ��
	}

	public static void main(String[] args) {
		int n = 21; // ��ȿ������ ����� ��
		long result = 0;  //20���� �Ѿ�� ���� intŸ������ ���� �� ���� ������ longŸ�� ���

		for (int i = 1; i <= n; i++) {
			result = factorial(i);

			if (result == -1) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�.(0<" + n + "<=20)");
				break; // return���� -1�̸� for���� ��������
			}
			System.out.println(i + "! = " + result);
		}

	}

}
