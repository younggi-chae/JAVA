package ex.loop;

import java.util.*;

public class loopEx9 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���Ͻô� �޴�(1~3)�� �����ϼ���. (����:0) >");
			System.out.println("(1) pizza");
			System.out.println("(2) spaghetti");
			System.out.println("(3) hamburger");
			

			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����:0)");
				continue;
			}
            System.out.println("�����Ͻ� �޴��� "+menu+"���Դϴ�.");
		}

	}

}
