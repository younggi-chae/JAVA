package ex.array;
       //������ ��� ���ϱ� ����
public class arrayEx3 {

	public static void main(String[] args) {
		int sum = 0;    //������ �����ϱ� ���� ����
		double avg = 0; //����� �����ϱ� ���� ����

		int[] score = { 100, 87, 75, 60, 52 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // �ݺ����� ���� �迭�� ������ ��� ���Ѵ�.
		}
		avg = sum / (double) score.length; // ��հ��� �Ǽ��� ǥ���ϱ� ���� ����ȯ

		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

}
 