package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyStack {
	public static void main(String[] args) {
		
	
	Map<String, String> map = new HashMap<>();
	
	map.put("abcd", "1234");
	map.put("aaaa", "1111");
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
	System.out.println("id�� password�� �Է����ּ���.");
	System.out.println("id : ");
	String id = sc.nextLine().trim();
	System.out.println("password : ");
	String password = sc.nextLine().trim();
	System.out.println();
	
	if(!map.containsKey(id)) {
		System.out.println("���̵� �������� �ʽ��ϴ�.");
		continue;
	} else {
		if(!(map.get(id)).equals(password)){
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
		}
	}
	
	}
	
	
	}
}
