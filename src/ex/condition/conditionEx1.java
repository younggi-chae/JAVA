package ex.condition;

import java.util.*;

public class conditionEx1 {
	
//if�� ����	
	public static void main(String[] args) {
		
		int input;
		System.out.println("���ڸ� �ϳ� �Է��ϼ���. >");

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
		String tmp = sc.nextLine(); // ȭ���� ���� �Է¹��� ���� tmp�� ����
		input = Integer.parseInt(tmp); //���ڿ��� ���ڷ� ��ȯ
		
		if (input < 0) {
			System.out.println("������ ���Դϴ�.");
		} else if (input > 0) {
			System.out.println("����� ���Դϴ�.");

		}
		System.out.println("�Է��Ͻ� ���ڴ� "+input+"�Դϴ�.");
		
		}
	}
}
