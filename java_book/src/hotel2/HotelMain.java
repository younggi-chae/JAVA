package hotel2;

import java.util.LinkedList;
import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {

		LinkedList<Customer> list = new LinkedList<Customer>();
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===========ȣ�� ���� ����==========");
			System.out.println("1.�����ϱ�  2.��������  3.üũ��  4.üũ�ƿ�  5.�������");
			String select = sc.nextLine();

			switch (select) {
			case "1":
				m.addCustomer(list);
				break;
			case "2":
				m.reInfo(list);
				break;
			case "3":
				m.checkIn(list);
				break;
			case "4":

				break;
			case "5":

				break;
			}
		}

	}

}
