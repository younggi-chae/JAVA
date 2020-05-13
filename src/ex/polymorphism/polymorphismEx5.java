package ex.polymorphism;
import java.util.*;  //VectorŬ������ ����ϱ� ���� �߰�

class Product {
	int price;       //��ǰ�� ����
	int bonusPoint;  //��ǰ ���� �� �����Ǵ� ����Ʈ
	
	Product(int price) {
	   	 this.price = price;
	   	 bonusPoint = (int)(price/10.0);
	}
	Product () {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() { super(100);  }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200);  }
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50);  }
	public String toString() { return "Audio"; }
}

class Buyer {
	int money = 1000;   //�����ݾ�
	int bonusPoint = 0; //���ʽ�����
	Vector item = new Vector();  //������ ��ǰ�� �����ϴµ� ���� Vector��ü
	//VectorŬ������ ���������� ObjectŸ���� �迭�� ������ �־�, �迭�� ��ü�� �߰��ϰų� ������ �� �ְ� �ۼ��Ǿ� �ִ�.
	//�׸��� �迭�� ũ�⸦ �˾Ƽ� �������ֱ� ������ ������ �ν��Ͻ��� ������ �Ű澲�� �ʾƵ� ��.
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;            //���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;  //��ǰ�� ���ʽ������� ���Ѵ�.
		item.add(p);                 //������ ��ǰ�� Vector�� �����Ѵ�.
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		
	}
	void refund(Product p) {    //������ ��ǰ ȯ��
		if(item.remove(p)) {    //��ǰ�� Vector���� ����
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {            //���ſ� ������ ���   
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() {           //������ ��ǰ�� ���� ���� ���
		int sum = 0;           //������ ��ǰ�� �� ���� �հ�
		String itemList = "";  //������ ��ǰ ���
		int bonus = 0;
		
		if(item.isEmpty()) {   //Vector�� ����ִ� Ȯ��
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);  //Vector�� i��°�� �ִ� ��ü�� ���´�.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
			bonus += p.bonusPoint;
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���  "+ sum + "�����Դϴ�.");
	    System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	    System.out.println("������ ���ʽ�����Ʈ�� "+ bonus + "����Ʈ�Դϴ�.");
	}
}

public class polymorphismEx5 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		b.summary();
		System.out.println();
		b.refund(c);
		b.summary();

	}

}


