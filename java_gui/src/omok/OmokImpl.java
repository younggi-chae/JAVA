package omok;

public class OmokImpl implements OmokInterface {

	int[][] omok = new int[10][10];
	// ������ ũ�� x, y ��ü ��ǥ

	@Override
	// ������ ��� �Լ�
	public void viewOmok() {
		int numY = 0;
		// ���� ���� ��ǥ�� �ʱ�ȭ

		int numX = 64;
		// ���� �ϴ� ��ǥ�� �ʱ�ȭ

		for (int[] i : omok) {
			numY++;

			System.out.print(numY < 10 ? numY + " " : numY);
			// ������ Y ��ǥ ǥ��
			// ���ǹ��� �־� 10 ������ ��� ������ ���� ������
			// �������� ���� ���� �ٸ��ֱ� ���ؼ� �Դϴ�.

			for (int j : i) {
				if (j == 1) {
					System.out.print(" ��");
					// �浹 ǥ��
				} else if (j == 2) {
					System.out.print(" ��");
					// �鵹 ǥ��
				} else {
					System.out.print(" ��");
					// ���� ǥ��
				}
			}
			System.out.print("\n");
		}

		System.out.print("  ");

		for (int[] i : omok) {
			numX++;
			System.out.print(" " + (char) numX);
			// �ϴܿ� X�� ��ǥ ǥ��
			// X�� ���� �������� ���� ���� �ٹ̱� ���ؼ� ������ �߰��߽��ϴ�.
		}

		System.out.print("\n");
	}

	@Override
	// ����
	public int OmokAction(char x, int y, int turn) {
		int chX = ((int) x) - 97;
		// x������ �Թ��� �ƽ�Ű�ڵ� ���ڷ� ����

		int chY = --y;
		// �迭�� �ִ� �� -1

		// ���� üũ
		int count = 0;

		int _x, _y = 0;

		String name = new String();
		name = (turn == 1) ? "�浹" : "�鵹";

		if (omok[chY][chX] != 0) {
			System.out.println("�̹� ������ ��ġ�Ǿ� �ֽ��ϴ�.");
			return 0;
		} else {
			omok[chY][chX] = turn;
		}

		// ���� üũ �ڵ�
		_x = chX;
		_y = chY;
		count = 0;
		while (omok[_y][_x] == turn && _x > 0) {
			_x--;
		}
		while (omok[_y][++_x] == turn && _x <= 10) {
			count++;
			// System.out.println(count+"����üũ");
		}
		if (count == 5) {
			System.out.println(name + "�¸�");
			return 1;
		}

		// ���� üũ �ڵ�
		_x = chX;
		_y = chY;
		count = 0;
		while (omok[_y][_x] == turn && _y > 0) {
			_y--;
		}
		while (omok[++_y][_x] == turn && _y <= 10) {
			count++;
			// System.out.println(count+"����üũ");
		}
		if (count == 5) {
			System.out.println(name + "�¸�");
			return 1;
		}

		// �밢�� ��
		_x = chX;
		_y = chY;
		count = 0;
		while (omok[_y][_x] == turn && _y > 0 && _x > 0) {
			_y--;
			_x--;
		}
		while (omok[++_y][++_x] == turn && _y <= 10 && _x <= 10) {
			count++;
			// System.out.println(count+"����üũ");
		}
		if (count == 5) {
			System.out.println(name + "�¸�");
			return 1;
		}

		// �밢�� ��
		_x = chX;
		_y = chY;
		count = 0;
		while (omok[_y][_x] == turn && _y > 0 && _x > 0) {
			_y++;
			_x--;
		}
		while (omok[--_y < 0 ? 0 : _y][++_x] == turn && _y <= 10 && _x <= 10) {
			// omok[][] ���� y ���� ���ǹ��� ���� ������ a, 1 �� �Է½�
			// y ���� -1 �� ���������� �Ѿ�� ������ ����ؼ� ������ �־����ϴ�.
			count++;
		}
		if (count == 5) {
			System.out.println(name + "�¸�");
			return 1;
		}

		return 0;
	}
}