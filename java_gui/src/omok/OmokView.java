package omok;

import java.util.Scanner;

public class OmokView {

	public static void main(String[] args) {

		int gameState = 0;
		// ������ ���¸� �˷��ִ� ����

		int turn = 0;
		// ���������� �˷��ִ� ����

		char x = '\u0000';
		// x�� �Է¹޴� ����

		int y = 0;
		// y�� �Է¹޴� ����

		OmokImpl o = new OmokImpl();

		Scanner sc = new Scanner(System.in);

		// ������� ��ǥ �Է� �޴� �޼ҵ�
		while (gameState == 0) {
			o.viewOmok();
			// �������� ����մϴ�.

			System.out.println("x ��ǥ�� �Է��ϼ���.");
			x = sc.next().charAt(0);
			System.out.println("y ��ǥ�� �Է��ϼ���.");
			y = sc.nextInt();

			turn = (turn == 1) ? 2 : 1;
			// ������ �ٲ��ִ� ���ǹ�

			gameState = o.OmokAction(x, y, turn);
		}

		o.viewOmok();
		// ���� �������� ����մϴ�.
		System.out.println("������ �������ϴ�.");
		sc.close();
	}
}