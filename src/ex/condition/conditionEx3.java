package ex.condition;

import java.util.*;

public class conditionEx3 {

	// ��ø if�� ����
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = ' '; // �ɼ� ���� �߰�

		System.out.println("����� ������ �Է����ּ���.");

		Scanner sc = new Scanner(System.in);
       	String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {  //��ø ���ǹ����� A���� �ȿ� A+���� �߰�
				opt = '+';
			} else if (score >= 93) {
				opt = '-';
			}

		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score >= 83) {
				opt = '-';
			}

		} else {
			grade = 'C';
		}

		System.out.println("����� ������ " + score + "�Դϴ�.");
		System.out.println("����� ������ " + grade + opt + "�Դϴ�.");
	}

}
