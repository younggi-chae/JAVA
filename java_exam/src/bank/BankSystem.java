package bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankSystem {
	private MyBank myBank; // MyBank

	public BankSystem() {
		myBank = new MyBank();
		showMenu();
	}

	public void showMenu() { // show method �����
		String menu = null;
		String id = null;
		String name = null;
		long balance = 0;

		do {

			System.out.println("****�޴��� �Է��ϼ���****");
			System.out.println("1. �����");
			System.out.println("2. ������(1��)");
			System.out.println("3. ����ü����");
			System.out.println("4. ���������");
			System.out.println("5. �������Ա�");
			System.out.println("***������***");
			System.out.println("***************");
			System.out.print(">>");

			menu = readFromKeyboard();

			if (menu.equals("1")) {

				System.out.print("ID�� �Է��ϼ���: ");
				id = readFromKeyboard();

				System.out.print("�̸��� �Է��ϼ���: ");
				name = readFromKeyboard();

				System.out.print("�ܰ� �Է��ϼ���: ");
				balance = Long.parseLong(readFromKeyboard());

				myBank.addCustomer(id, name, balance);

			} else if (menu.equals("2")) {
				System.out.print("��ID�� �Է��ϼ���: ");
				id = readFromKeyboard();
				Customer cust = myBank.getCustomer(id);
				System.out.println(cust.getId() + ":" + cust.getName() + ": " + cust.getAccount().getBalance());

			} else if (menu.equals("3")) {

				Customer[] allCust = myBank.getAllCustomers();

				for (int i = 0; i < allCust.length; i++) {
					System.out.println(allCust[i].getId() + ": " + allCust[i].getName() + " :"
							+ allCust[i].getAccount().getBalance());
				}

			} else if (menu.equals("4")) {

				System.out.print("���� ID�� �Է��ϼ���.: ");
				id = readFromKeyboard();

				Customer cust = myBank.getCustomer(id);

				if (cust == null) {
					System.out.println("��ϵ� ���� �ƴմϴ�.");

				} else {
					System.out.print("��ݾ��� �Է��ϼ���: ");
					balance = Long.parseLong(readFromKeyboard());

					if (cust.getAccount().withdraw(balance)) {
						System.out.println("���������� ��ݵǾ����ϴ�.");
						System.out.println("����� �ܰ�� :" + cust.getAccount().getBalance());
					} else {
						System.out.println("�ܰ� �����մϴ�.");
					}
				}

			} else if (menu.equals("5")) {

				System.out.print("���� ID�� �Է��ϼ���.: ");
				id = readFromKeyboard();

				Customer cust = myBank.getCustomer(id);

				if (cust == null) {
					System.out.println("��ϵ� ���� �ƴմϴ�.");

				} else {
					System.out.print("�Աݾ��� �Է��ϼ���: ");
					balance = Long.parseLong(readFromKeyboard());

					if (cust.getAccount().deposit(balance)) {
						System.out.println("���������� �ԱݵǾ����ϴ�.");
						System.out.println("�Ա��� �ܰ�� :" + cust.getAccount().getBalance());
					}
				}

			}

		} while (!menu.equals("q"));
	}

	public String readFromKeyboard() {
		String input = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return input;
	}

	public static void main(String[] args) {
		BankSystem bank = new BankSystem();

	}

}
