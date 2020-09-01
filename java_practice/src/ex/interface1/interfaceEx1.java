package ex.interface1;

public class interfaceEx1 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Units) {
			System.out.println("f�� Units Ŭ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movalbe �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� Objec Ŭ������ �ڼ��Դϴ�.");
		}
	}

}

class Fighter extends Units implements Fightable {
	public void move(int x, int y) {}  //�������̵� �� ������ �޼��庸�� ���� ������ ���������� ����
	public void attack(Units u) {}     //interface Movable�� Attackable�� public abstract�� ������ ����
}

interface Movable {
	void move (int x, int y);   //������ ��ġ�� �̵��ϴ� �޼���
}
interface Attackable {
	void attack(Units u);
}

interface Fightable extends Movable, Attackable{}    //�������̽��� ���߻���� ������ �ϴ�.��9��

class Units {
	int currentHP;
	int x;
	int y;
}

