package factoryMethodPattern;

public class Driver {

	public static void main(String[] args) {
		//���͸� �޼��带 ������ ��ü�� ����
		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		//���͸� �޼��尡 ��ȯ�ϴ� ��ü��
		AnimalToy boltBall = bolt.getToy();
		AnimalToy kittyTower = kitty.getToy();
		
		//���͸� �޼��尡 ��ȯ�� ��ü���� ���
		boltBall.identify();
		kittyTower.identify();

	}

}
