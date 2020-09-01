package hotel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	Room arr[] = { new Room("���Ĵٵ�", 300000, 4), new Room("���� ", 500000, 5),
	               new Room("����Ʈ", 600000, 8) };
	Scanner sc = new Scanner(System.in);
	private Room roomInfo;
	private int reservationNo;	
	private int roomNo;
	
	public void addCustomer(LinkedList<Customer> list) {
		System.out.println("=====������ ���=====");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String tel = sc.nextLine();
		System.out.println("������� : ");
		String birth = sc.nextLine();		
		
		System.out.println("���Ͻô� ���� ��ȣ�� �������ּ���.");		
		System.out.println("1.���Ĵٵ�  2.����  3.����Ʈ");
		printRoom(arr);
		System.out.println("�Է� : ");
		int idx = Integer.parseInt(sc.nextLine());
		roomInfo = arr[idx - 1];
		
		switch (idx) {
		case 1:
			roomNo = (int) (Math.random() * (110 - 100 + 1) + 100);
			break;
		case 2:
			roomNo = (int) (Math.random() * (210 - 200 + 1) + 200);
			break;
		case 3:
			roomNo = (int) (Math.random() * (310 - 300 + 1) + 300);
			break;
		}
		
		reservationNo = (int) (Math.random() * 1000) + 1;
		list.offer(new Customer(name, tel, birth, reservationNo, roomInfo));
		System.out.println("������ �Ϸ�Ǿ����ϴ�. �����ȣ�� " + reservationNo + "�Դϴ�.");
		System.out.println();
	}
	
	public void printRoom(Room[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "��° �� ����");
			arr[i].show();
			System.out.println();
		}
	}

	public void printInfo(LinkedList<Customer> list) {
		Iterator<Customer> iter = list.iterator();
		while(iter.hasNext()) {
			iter.next().show();
		}		
		
	}

	public void checkIn() {
		System.out.println("���� ��ȣ�� �Է��� �ּ���.");
		System.out.println("�Է� : ");
		int reNo = sc.nextInt();
		if(reservationNo == reNo) {
			roomInfo.setRoomNo(roomNo);
			System.out.println(roomInfo.getRoomNo() + "ȣ�Ƿ� ���� �����Ǿ����ϴ�");
		}
		
	}

	public void checkOut(LinkedList<Customer> list) {
		System.out.println("���ȣ�� �Է��� �ּ���.");
		System.out.println("�Է� : ");
		int roomNum = sc.nextInt();
		sc.nextLine();
		if(roomNum == roomInfo.getRoomNo()) {
			System.out.println(roomInfo.getRoomNo() + "ȣ�� üũ�ƿ� �Ǿ����ϴ�.");
			System.out.println("***** ��꼭 �߻� *****");
			for(int i = 0; i < list.size(); i++) {
				list.poll();
				System.out.println("������ �ݾ��� " + roomInfo.getPrice() + "���Դϴ�.");
				System.out.println("���� ������ ������ �ּ���.");
				System.out.println("1.����   2.ī��   3.��ǥ");
				int idx = Integer.parseInt(sc.nextLine());
				
				switch(idx) {				
				case 1:
					System.out.println("���� ���� �� 20% ������ ����");
					int cash = (int) (roomInfo.getPrice() * 0.8);
					System.out.println("�� " + cash + "���� �����Ǿ����ϴ�.");
					break;
				case 2:
					System.out.println("ī�� ���� �� 10% ������ ����");
					int card = (int) (roomInfo.getPrice() * 0.9);
					System.out.println("�� " + card + "���� �����Ǿ����ϴ�.");
					break;
				case 3:
					System.out.println("��ǥ ���� : �ź����� ������ �ּ���.");
					System.out.println("�� " + roomInfo.getPrice() + "���� �����Ǿ����ϴ�.");
					break;
				}
			}
		}
		
	}

	public void cancel(LinkedList<Customer> list) {
		System.out.println("�����ȣ�� �Է��� �ּ���.");
		System.out.println("�Է� : ");
		int reNo = sc.nextInt();	
		if(reservationNo == reNo) {
			list.poll();
			System.out.println("�����ȣ " + reservationNo + " ��� �Ϸ�" );
		}
	}
	
	
}