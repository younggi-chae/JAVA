package ex.operator;
import java.util.*;
public class operatorEx7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c = ' ';
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scanner.nextLine();
		c = input.charAt(0);
		
		if('0' <= c && c <= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
			
		}
		else if('a' <= c && c <= 'z') {
		     System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.");
		}
	}

}
