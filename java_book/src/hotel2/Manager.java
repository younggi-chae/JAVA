package hotel2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	
	private Customer cust;	
	private Room room;
	private int reNo = 100;
	private int roomNo;
	
	Room[] roomInfo =  { new Room("���Ĵٵ�",300000,2),
		             new Room("����",400000,4),
		             new Room("����Ʈ",500000,5)};
	Scanner sc = new Scanner(System.in);	
	
	public Manager() {}
	
	public void addCustomer(LinkedList<Customer> list) {
		System.out.println("========�������� ���========");
		System.out.print("���� : ");
		String name = sc.nextLine();
		System.out.print("����ó : ");
		String tel = sc.nextLine();
		System.out.print("������� : ");
		String birth = sc.nextLine();
		
		System.out.println("=======�� ����=======");	
		showRoom(roomInfo);
		int idx = Integer.parseInt(sc.nextLine());
		room = roomInfo[idx-1];
		
		
		reNo++;
		list.add(new Customer(name, tel, birth, reNo, room));
		System.out.println("������ �Ϸ�Ǿ����ϴ�. ������ �����ȣ�� " + reNo + "�Դϴ�.");
	}
	
	public void showRoom(Room[] roomInfo) {
		for(int i = 0; i < roomInfo.length; i++) {
			System.out.println(i+1 + "��° ���� ����");
			roomInfo[i].show();		
			System.out.println();
		}
	}
	
	public void reInfo(LinkedList<Customer> list) {
		System.out.println("======�������� Ȯ��========");
		Iterator<Customer> iter = list.iterator();
		while(iter.hasNext()) {
			iter.next().show();
		}
	}
	
	public void checkIn(LinkedList<Customer> list) {
		System.out.println("======üũ�� ����======");
		System.out.println("���� ��ȣ�� �Է��� �ּ���.");
		System.out.println("�Է� : ");
		int reserveNo = sc.nextInt();
		sc.nextLine();
		if(reserveNo == reNo) {
			room.setRoomNo(roomNo);
			System.out.println(room.getRoomNo() + "ȣ�Ƿ� ������ �����Ǿ����ϴ�.");
		}
	}
	
	
}
