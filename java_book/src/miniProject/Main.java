package miniProject;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SellerManagement sm = new SellerManagement();

		CustomerManagement cm = new CustomerManagement();

		LinkedList<Seller> loginInfo = new LinkedList<Seller>();

		LinkedList<Goods> itemList = new LinkedList<Goods>();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1:ȸ������  2:�α���  3:���α׷� ����");

			String input = sc.nextLine();

			switch (input) {

			case "1":

				System.out.println("1:�Ǹ��� ȸ������  2.������ ȸ������");

				String input2 = sc.nextLine();

				switch (input2) {

				case "1":

					sm.join();

					break;

				case "2":

					cm.join();

					break;

				}

				break;

			case "2":

				System.out.println("1:�Ǹ��� ���ǰ���  2:������ �����ϱ�");

				String input3 = sc.nextLine();

				switch (input3) {

				case "1":

					sm.login();

					sm.addItem();

					break;

				case "2":

					System.out.println("1:������ �Է�  2:������ Ȯ��  3:���  4:�׽�Ʈ");

					String input4 = sc.nextLine();

					switch (input4) {

					case "1":

						cm.logIn();

						System.out.println();

						cm.printGoods();

						System.out.println();

						cm.purchase();

						System.out.println();

						cm.purchase2();

						break;

					case "2":

						cm.result();

						cm.account();

						break;

					case "3":

						System.out.println("���� ���");

						break;

					case "4":

						System.out.println("������ �α����Դϴ�. ������ ���Ͻø� 1�� �����ּ���.");

						String input5 = sc.nextLine();

						switch (input5) {

						case "1":

							cm.logIn();

							System.out.println();

							cm.printGoods();

							System.out.println();

							cm.purchase();

							System.out.println();

							cm.purchase2();

							break;

						}

						break;

					}

					break;

				}

				break;

			case "3":

				System.out.println("���α׷� ����");

				return;

			}

		}

	}

}