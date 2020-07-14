package animal;

public class Dog extends Animal {
		
	private DogFood dogFood;
	
	public Dog() {}

	public Dog(String name, String gender, int age) {
		super(name, gender, age);
		
	}
	
	@Override
	public void introduce() {		
		super.setName("baw");
		super.setAge(9);
		super.setGender("��");
		super.introduce();
	}

	@Override
	public void bawl() {
		System.out.println("�۸�!! �۸�!");
		super.bawl();
	}	

	@Override
	public void eat() {
		dogFood = new DogFood();
		System.out.println(dogFood.normalFood() + "����!");
		super.eat();
	}
	
	public void run() {
		System.out.println("baw, �پ�!!");
	}
}
