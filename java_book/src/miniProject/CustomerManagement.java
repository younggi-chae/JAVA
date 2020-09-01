package miniProject;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner; 

public class CustomerManagement extends Account implements Join {

	List<Customer> cust = new LinkedList<Customer>();
	Scanner sc = new Scanner(System.in);
	Customer c;
	Goods g;
	private int bid;

	@Override
	public void join() {
		System.out.println("*****������ ȸ������*****");
		System.out.println("���̵� �Է����ּ���.");
		System.out.print("�Է� :");
		sc.nextLine();
		String id = sc.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���.");
		System.out.print("�Է� : ");
		String password = sc.nextLine();
		System.out.println("�̸��� �Է����ּ���.");
		System.out.print("�Է� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է����ּ���.");
		System.out.print("�Է� : ");
		String phoneNo = sc.nextLine();
		System.out.println("�ּҸ� �Է����ּ���.");
		System.out.print("�Է� : ");
		String address = sc.nextLine();

		cust.add(new Customer(id, password, name, phoneNo, address, bid));
		System.out.println("*****" + name + "�� ȸ�������� �Ϸ�Ǿ����ϴ�.*****");

	}

 

	public void logIn() {
		System.out.println("���̵� �Է����ּ���.");
		System.out.print("�Է� :");
		String id = sc.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���.");
		System.out.println("�Է� : ");
		String password = sc.nextLine(); 

		for (int i = 0; i < cust.size(); i++) {
			c = cust.get(i);
		}

 

		if (c.getId().equals(id) && c.getPassword().equals(password)) {
			System.out.println("�α��� ����");
		} else if (!c.getId().equals(id)) {
			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}

 

	public void printGoods() {
		for (int i = 0; i < SellerManagement.goodsList.size(); i++) {
			System.out.println(i + 1 + "��° ��ǰ ����");
			SellerManagement.goodsList.get(i).show();
		}
	}

 
	public void purchase() {
		System.out.println("�����Ͻ� ��ǰ�� ������ �ּ���.");
		printGoods();
		System.out.print("�Է� : ");
		int idx = Integer.parseInt(sc.nextLine());
		SellerManagement.goodsList.get(idx - 1);
	}

	public void purchase2() {
		System.out.println("�����Ͻ� �ݾ��� �Է��ϼ���.");
		System.out.print("�Է� : ");
		try {
			bid = sc.nextInt();
		} catch (Exception e) {
			e.getStackTrace();
		}
		c.setBid(bid);
		System.out.println(bid + "���� �Է��Ͽ����ϴ�.");
		
		for (int i = 0; i < cust.size(); i++) {
			c = cust.get(i);
			System.out.println(c);
		}
	}

	public void result() {

		Collections.sort(cust, new Comparator<Customer>() { 

			@Override
			public int compare(Customer o1, Customer o2) {
				
				if (o1.getBid() > o2.getBid()) {
					return 1; 
				} else if (o1.getBid() < o2.getBid()) {
					return -1;
				}
				return 0;
			}
		});
		int max = -1; 

		for (int i = 0; i < cust.size(); i++) {
			Customer cc = cust.get(i);
//			if (cust.indexOf(cc.getBid()) == cust.size()-1) {
//				max = cc.getBid();
//				System.out.println(cc.getName() + "�� ������ �Ϸ�Ǿ����ϴ�.");
//			} else {
//				System.out.println("������ �����Ͽ����ϴ�.");
//
//			}
		}

	}
	public void logOut() {
		cust = null;
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}

	public void account() {
		System.out.println("������� �Է����ּ���.");
		String adr = sc.nextLine();
		System.out.println("���� �ݾ��� " + bid + "�Դϴ�.");		

	}	

}