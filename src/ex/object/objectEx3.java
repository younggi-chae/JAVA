package ex.object;

class Card{
	String kind ;              // ī�幫�� - �ν��Ͻ�����
	int number;                // ī���ȣ - �ν��Ͻ�����
	static int width = 100;    // ī�� �� -  Ŭ��������
	static int height = 250;   // ī����� - Ŭ��������
}

public class objectEx3 {

	public static void main(String[] args) {
		System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = "+ Card.height);
        
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 4;
        
        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 7;
        
        System.out.println("c1�� ���� ���ڴ� " + c1.kind + c1.number+ ", " + "ũ��� " + c1.height+", "+ c1.width);
        System.out.println("c2�� ���� ���ڴ� " + c2.kind + c2.number+ ", " + "ũ��� " + c2.height+", "+ c2.width);
	
        System.out.println("c1�� width�� height�� ���� 50, 150���� ����");
        
        Card.width = 50;     //Ŭ�������� ����        // c1.width = 50;
        Card.height = 150;                  // c1.height = 150;
        
        //Ŭ���������� ��� �ν��Ͻ��� ����� ��������� ����, �� Ŭ������ ��� �ν��Ͻ����� �������� ���� �����ؾ��� ��� Ŭ�������� ���
        System.out.println("c1�� ���� ���ڴ� " + c1.kind + c1.number+ ", " + "ũ��� " + c1.height+", "+ c1.width);
        System.out.println("c2�� ���� ���ڴ� " + c2.kind + c2.number+ ", " + "ũ��� " + c2.height+", "+ c2.width);
        //c2�� width, height���� �ڵ����� ����Ǿ���.
	}

}
