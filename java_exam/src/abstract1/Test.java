package abstract1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ����� ��������.
		// 1.�߰� 2.��� 3.�˻� 4.����
		// String �迭�� ����
		// �Է� : 1
		// �迭�� �����͸� �߰�
		// �Է� : 2
		// �迭�� �ִ� ��� �����Ͱ� ���
		// �Է� : 3
		// �ε��� : 2
		// �ش� �ε����� �迭 ������ ���
		// switch�� ���

		String[] menu = new String[3];
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====�޴� ����====");
		System.out.println("1.�߰�  2.���  3.�˻�  4.����");
		num = sc.nextInt();		
		
		switch (num) {		
		case 1:
			System.out.println("1.�迭�� �߰��ϱ�");
		    for(int i = 0; i < menu.length; i++) {
		    	menu[i] = sc.nextLine();
		    }		    
		case 2:
			System.out.println("2.���");
			for(int i = 0; i <menu.length; i++) {
				System.out.print(menu[i]+ ",");
			}			
		case 3:
			System.out.println("�˻�");
			System.out.println(menu[2]);
		case 4:
			break;
		}	
	}
}