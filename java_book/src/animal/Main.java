package animal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Animal kitty = new Cat();
		Animal baw = new Dog();

		Scanner sc = new Scanner(System.in);
		System.out.println("� ������ ��ڽ��ϱ�?");
		System.out.println("1.�����(kitty)  2.������(baw)");
		String menu = sc.nextLine();
		switch (menu) {
		case "1":			
			kitty.introduce();
			break;
		case "2":
			baw.introduce();
			break;
		}
		while (true) {
			System.out.println("=====================");
			System.out.println("1.���  2.����  3.����  4.����");
			String menu2 = sc.nextLine();
			switch (menu2) {
			case "1":				
				if (menu.equals("1")) {
					kitty.bawl();
				} else  {
					baw.bawl();
				}				
				break;
			case "2":
				if (menu.equals("1")) {
					kitty.play();
				} else {
					((Dog) baw).run();
				}
				break;
			case "3":
				if (menu.equals("1")) {
					kitty.eat();
				} else {
					baw.eat();
				}
				break;
			case "4":
				System.out.println("����");
				return;
			}
		}

	}

}
