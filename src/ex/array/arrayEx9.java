package ex.array;

public class arrayEx9 {
          // 2���� �迭 ����
	public static void main(String[] args) {
		int score[][] = { { 100, 90, 80 }, { 90, 80, 70 }, { 80, 70, 60 }, { 70, 60, 50 } };
        //���� ���� ��������
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("==========================");

		for (int i = 0; i < score.length; i++) { //���� �հ� 
			int sum = 0;   //���κ� ����
			float avg = 0.0f; //���κ� ���

			korTotal += score[i][0]; // �ุ for������ ��ȯ 1��°��, �����հ�
			engTotal += score[i][1]; // �ุ for������ ��ȯ 2��°��, �����հ�
			mathTotal += score[i][2]; // �ุ for������ ��ȯ 3��°��, �����հ�
			System.out.printf("%1d", i + 1);

			for (int j = 0; j < score[i].length; j++) { //���κ� �հ�
				sum += score[i][j];
				System.out.printf("%4d", score[i][j]);

			}
			avg = sum / (float) score[i].length; //��� ���
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("==========================");
		System.out.printf("����:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}

}
