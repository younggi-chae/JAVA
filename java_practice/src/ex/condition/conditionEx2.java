package ex.condition;
import java.util.*;

public class conditionEx2 {

//else if�� ����
	
	public static void main(String[] args) {
		int score = 0; //���� ����
		char grade = ' '; // ���� ����, �������� �ʱ�ȭ

		System.out.println("������ �Է����ּ���.");

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String tmp = sc.nextLine();
			score = Integer.parseInt(tmp);

			if (score >= 90) {  //if-else if ���ǹ� ����
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else {
				grade = 'D'; // 70�̸��� ��� D����
			}
			System.out.println("����� ������ "+score+"�Դϴ�.");
			System.out.println("����� ������ " + grade + "�Դϴ�.");
		}

	}

}
