package ex.condition;
import java.util.*;
public class conditionEx5 {
       //switch�� ����, ���������� ����
	public static void main(String[] args) {
		
		int user, com;
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��Ͻʽÿ�.");
		
		Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()) {
        	String tmp = sc.nextLine();
        	user = Integer.parseInt(tmp);
        	//(int)(math.random *3)�� 0,1,2�� ���, ex) 0.9*3 = 2.7 ������ int�� ����ȯ�ϸ� �ִ� 2���
        	com = (int)(Math.random()*3) + 1;  //math.random�� �Ǽ��� ��ȯ�ϱ⿡ int ���������� ����ȯ
        	
        	System.out.println("����� "+user+"�Դϴ�.");
        	System.out.println("��ǻ�ʹ� "+com+"�Դϴ�.");
        	
        	switch(user-com) { // ������ ��ǻ���� �� ������ ���ǻ���
        	     
        	case 2: case -1: //user - com   ex) user = ����(2), com = ��(3), 2-3 = -1
        		System.out.println("����� �����ϴ�.");
        		break;
        	case 1: case -2:
        		System.out.println("����� �̰���ϴ�.");
        		break;
        	case 0:
        		System.out.println("�����ϴ�.");
        	}
        }
	}

}
