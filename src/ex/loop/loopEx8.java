package ex.loop;
import java.util.*;
public class loopEx8 {
      // do while�� ����
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1; // 1~100������ ������ ���� ����
		Scanner sc = new Scanner(System.in);
		
		do { // �ּ��� �ѹ��� ������ ���� ����, ���ǽ��� �������� ���� �� ����� ������� ���´�.
			System.out.println("1�� 100������ ���ڸ� �Է����ּ���.");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է����ּ���.");
			} 
			else if(input < answer){
		        System.out.println("�� ū ���� �Է��� �ּ���.");
			}
		}
			while(input != answer);  //������ true�� �� ������ ��� �ݺ�����
				System.out.println("�����Դϴ�!"); 
			
		
	}
}
	
	


