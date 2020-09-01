package hotel2;

public class Customer {

	private String name;
	private String tel;
	private String birth;		
	private Room room;
	private int reNo;
	public Customer() {}

	public Customer(String name, String tel, String birth, int reNo , Room room) {
		super();
		this.name = name;
		this.tel = tel;
		this.birth = birth;	
		this.reNo = reNo;
		this.room = room;
	}
	
	public void show() {
		System.out.println("���� : " + name);
		System.out.println("����ó : " + tel);
		System.out.println("������� : " + birth);
		System.out.println("�����ȣ : " + reNo);
		System.out.println("���� : " + room.getGrade());
		System.out.println("���� : " + room.getPrice() + "��");
		System.out.println("�ִ��ο� : " + room.getMaxPeople() + "��");
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getReNo() {
		return reNo;
	}

	public void setReNo(int reNo) {
		this.reNo = reNo;
	}	
	
	
}
