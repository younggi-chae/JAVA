package hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class HotelMain {	
		public static void main(String[] args) {			
			LinkedList<Customer> list = new LinkedList<Customer>();
			Scanner sc = new Scanner(System.in);
			Manager m = new Manager();			

			while (true) {
				System.out.println("=======ȣ�� ����========");
				System.out.println("1.�����  2.�������� 3.üũ��  4.üũ�ƿ�  5.������� ");
				System.out.println("���� : ");
				String menu = sc.nextLine();

				switch (menu) {
				case "1":
					m.addCustomer(list);						
					break;
				case "2":
					m.printInfo(list);
					break;
				case "3":
					m.checkIn();
					break;
				case "4":
					m.checkOut(list);
					break;
				case "5":
					m.cancel(list);
					break;
				case "6":
					System.out.println("����");
					return;					
				} // end switch
			} // end while
		} // end main()
	}