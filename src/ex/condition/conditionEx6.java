package ex.condition;
import java.util.*;
public class conditionEx6 {
        //��ø switch�� ����
	public static void main(String[] args) {
		  
		char gender;
		String num = "";
        System.out.println("�ֹι�ȣ�� �Է����ּ���. \"000000-0000000\"");
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        	num = sc.nextLine();  //�Է¹��� ���� num�� ����
        	gender = num.charAt(7); //�Է¹��� ���ڿ� 8��° ���ڸ� gender�� ����, index�� ���� 0���� ����
        	
        	switch(gender) {
        	   case '1': case '3':
        		   switch(gender) { //switch�� �ȿ� switch��
        	            case '1':
        	            	System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
        	            	break;
        	            case '3':
        	            	System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
        	            	} break;
        	   case '2': case '4':
        		   switch(gender) {
        		        case '2':
        		        	System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
        		        	break;
        		        case '4':
        		        	System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
        		        	break;
        		            } break;
        		    default: //if���� else�� ����
        		    	System.out.println("��ȿ���� �ʴ� �ֹι�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
        		    }
        		}
        	}
        }
	


