import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {

	public static void main(String[] args) {
		// 2020 7�� Ķ���� �����
		// �� �Է� : 7
		// <2020 7��>
		// �� �� ȭ �� �� �� �� tab
		// 1 2 3 4
		// 5 6 7 8 9 10

		int start = 0;
		int end = 0;

		Scanner sc = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();

		gc.set(Calendar.DATE, 1); // 7�� 1��
		start = gc.get(Calendar.DAY_OF_WEEK); // ������ (4) ��������
		end = gc.getActualMaximum(Calendar.DATE); //������ �� �� (31) ��������

		System.out.println("������� ���� �Է����ּ��� (7�� : 7)");
		System.out.println("�Է� : ");
		String now = gc.get(Calendar.YEAR) + "�� " + (gc.get(Calendar.MONTH) + 1) + "�� ";
	
		int input = sc.nextInt();

		if (input == (gc.get(Calendar.MONTH) + 1)) {
			System.out.println("                  <" + now + ">");
			char[] week = { '��', '��', 'ȭ', '��', '��', '��', '��' };
			for (int i = 0; i < week.length; i++) {
				char a = week[i];
				System.out.print(a + "\t");
			}
			
			System.out.println();
			
			for (int i = 1; i < start; i++) {
				System.out.print("\t"); // start(4)���� �� ����
			}

			for (int i = 1; i <= end; i++) { //end(31)���� ���
				System.out.print(i + "\t"); 
				if (start % 7 == 0) { // 7�� ������� ����
					System.out.println();

				}
				start++; // 7 , 14 , 21 ���� �����ϵ��� ī��Ʈ
			}
		}
	}
}
