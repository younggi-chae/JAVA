package ex.condition;
import java.util.*;
public class conditionEx4 {
    //switch�� ����
	public static void main(String[] args) {
		 
		int month = 0;
		System.out.println("���� ������� �Է����ּ���.");
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String tmp = sc.nextLine();
			month = Integer.parseInt(tmp);
			System.out.println("�̹����� "+month+"���Դϴ�.");
			switch(month) {
			
			case 3: case 4: case 5: //case�� ���ǽ� ����� ���� �Ǵ� ���ڿ�
				System.out.println("���� ������ ���Դϴ�.");
				break; // break���� ������ switch���� ����������. break���� �� �Ʒ� case�� ���� ���
			case 6: case 7: case 8:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 12: case 1: case 2:
				System.out.println("���� ������ �ܿ��Դϴ�.");
			}
		}
    }
}

//if������ ���� �� �ڵ�

				//if(month == 3 || month ==4 || month == 5) {
				//	System.out.println("���� ������ ���Դϴ�.");
				//}
				//else if(month == 6 || month == 7 || month == 8) {
				//	System.out.println("���� ������ ���Դϴ�.");
				//}
				//else if(month == 9 || month ==10 || month == 11) {
				//	System.out.println("���� ������ ���Դϴ�.");
				//}
				//else{
				//	System.out.println("���� ������ ���Դϴ�.");
				//}