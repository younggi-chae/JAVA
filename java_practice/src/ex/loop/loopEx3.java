package ex.loop;
import java.util.*;
public class loopEx3 {
     //����� �ﰢ��
	public static void main(String[] args) {
	    int num = 0;
	    System.out.println("\"*\"�� ����� ������ ���� �Է����ֽʽÿ�.");
	    
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNextLine()) {	
	    String tmp = sc.nextLine();
	    num = Integer.parseInt(tmp);
	    
		for(int i = 1; i <= num ; i++) { //���ڴ�� num�̶�� ������ �ְ� ������� �Է°��� ���� ������ ����
			for(int j = 1; j <= i; j++) { //���ڴ�� i��� ������ �ְ� i�� 1~5���� �����ϴ� for���� �ȿ� �ִ´�.
				System.out.print("*");
			}
			System.out.println(); //�ٹٲ�
		}
	    }
	}
}
	