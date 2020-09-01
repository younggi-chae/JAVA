package hotel2;

public class Room {

	private String grade;
	private int price;
	private int maxPeople;
	private int roomNo;
	
	public Room() {}

	public Room(String grade, int price, int maxPeople) {
		super();
		this.grade = grade;
		this.price = price;
		this.maxPeople = maxPeople;
	}
	
	public void show() {
		System.out.println("���� : " + getGrade());
	    System.out.println("���� : " + getPrice());
		System.out.println("�ִ��ο� : " + getMaxPeople());
	}	

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}	

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public String toString() {
		return "Room [Grade=" + grade + ", price=" + price + ", maxPeople=" + maxPeople + "]";
	}
	
	
}
