package ex.object4;

class Card {
	static final int KIND_MAX = 4;   //ī�� ������ ��
	static final int NUM_MAX = 13;   //���� �� ī���� ��
	
	static final int SPACE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
    
	int kind;
	int number;
	
	Card() {
		this(SPACE, 1);
	}
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String kinds [] = {"","CLOVER", "HEART", "DIAMOND", "SPACE"};
		String numbers = "0123456789XJQK";
		
		return "kind : "+ kinds[this.kind]+", number : " + numbers.charAt(this.number);
	}
}
// deck Ŭ����
class Deck {
	final int CARD_NUM = 52; //ī���� ����, ��� final�� ����
	Card cardArr [] = new Card[CARD_NUM]; //ũ�Ⱑ 52�� card ��ü �迭
	
	Deck() {
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) 
			for(int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1);
		
	}
	Card pick(int index) {   //deck���� ī�� �ϳ��� ����
		return cardArr[index];
	}
	Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	void shuffle() {  //ī���� ������ ���´�.
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}

public class inheritanceEx3 {

	public static void main(String[] args) {
		Deck d = new Deck();   //ī�� �� ���� �����.
		Card c = d.pick(0);    //���� �� ���� ���� ī�带 �̴´�.
		System.out.println(c); 
		
		d.shuffle();  //ī�带 ���´�.
		c = d.pick(0); //���� �� ���� ���� ī�带 �̴´�.
		System.out.println(c);

	}

}
