package hotel;

public class Customer {
	private String name;
	private String tel;
	private String birth;
	private int reservationNo;
	private Room roomInfo;

	public Customer() {}
	public Customer(String name, String tel, String birth, int reservationNo, Room roomInfo) {
		super();
		this.name = name;
		this.tel = tel;
		this.birth = birth;
		this.reservationNo = reservationNo;
		this.roomInfo = roomInfo;
	}	
	
	public void show() {
		System.out.println("���� : " + name);
		System.out.println("����ó : " + tel);
		System.out.println("������� : " + birth);
		System.out.println("�����ȣ : " + reservationNo);		
		System.out.println("���� : " + roomInfo.getRoomGrade());
	    System.out.println("���� : " + roomInfo.getPrice());
		System.out.println("�ִ��ο� : " + roomInfo.getMaxPeople());
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public String getTel() {
		return tel;
	} 

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

 	public Room getRoomInfo() {
		return roomInfo;
	}

 	public void setRoomInfo(Room roomInfo) {
		this.roomInfo = roomInfo;
	}	

}