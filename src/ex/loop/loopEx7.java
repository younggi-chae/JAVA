package ex.loop;
import java.util.*;
public class loopEx7 {
     //simple ���� �����
	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean condition = true; //while�� ����ġ ���� ����
		
		System.out.println("�հ踦 ���� ���ڸ� �Է����ּ���.(�������� 0�� �Է�)");
		
		while(condition) {
			System.out.println(">>");
			
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num != 0) {
				sum += num; // num�� 0�� �ƴϸ�, sum = sum+num�� �Ѵ�.
			} else {
				condition = false; // num�� 0�̸�, ������ false
			}
			
		}
		System.out.println("�հ� : "+ sum);
	}

}
