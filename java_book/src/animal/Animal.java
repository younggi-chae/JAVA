package animal;

public class Animal {
	
	private String name;
	private String gender;
	private int age;
	 
	public Animal(){}
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
	}
	
	public void bawl() {
		
	}
	
	public void play() {
		System.out.println(name + "�� �����̶� ���� ��� ��...");
	}
	
	public void eat() {
		System.out.println(name + "�� ���� �Դ� ��...");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
