package miniDos;

import java.io.File;
import java.util.Scanner;

public class MiniDos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		String path = "C:\\Users\\82109\\Desktop\\ddd";
		String dest = "C:\\Users\\82109\\Desktop\\ddd\\home\\test";
		File file = new File(path);
		File file2 = new File(dest);
		
		while(true) {
			System.out.println("======MiniDos ��ɾ�======");
			System.out.println("ls : ���ϸ�� ���");
			System.out.println("cd : ���丮 �̵�");
			System.out.println("cd .. : �θ���丮 �̵�");
			System.out.println("mkdir : ���丮 ����");
			System.out.println("cp : ���� ���丮���� ��� ���� ����");
			System.out.println();
			System.out.println("�Է� : ");
			String menu = sc.nextLine();
			switch(menu) {
			case "ls":
				m.ls(file);
				break;
			case ("cd " ):
				m.afterDir(file);
				break;
			case "cd ..":
				m.backDir();
				break;
			case "mkdir":
				m.makeDir(file);
				break;
			case "cp":
				m.copy(file, file2);
				break;
			}
		}
	}
}
