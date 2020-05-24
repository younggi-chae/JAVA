package ex.interface1;

public class abstractEx1 {

	public static void main(String[] args) {
		 Marine m = new Marine();
		 Tank t = new Tank();
		 Dropship d = new Dropship();
         
		 m.move(130, 100);
		 t.move(200, 130);
		 d.move(100, 200);
		 m.stop();
		 m.stimPack();
		 t.changeMode();
		 d.load();
		 d.unload();
	}

}

abstract class Unit {
	int x, y;   //���� ��ġ ��ǥ.
	abstract void move(int x , int y); //�߻�޼���, �ڽ�Ŭ�������� �ݵ�� �������־�� �Ѵ�.
	void stop() {System.out.println("����� ���߾����ϴ�.");}
}

class Marine extends Unit {
	void move (int x, int y) {System.out.println("����� "+ x + ", "+ y +"��ŭ �̵��Ͽ����ϴ�."); } //�߻�Ŭ���� ����
    void stimPack()    {System.out.println("�������� ����Ͽ����ϴ�.");}
	}
class Tank extends Unit {
	void move (int x, int y) { System.out.println("����� "+ x + ", "+ y +"��ŭ �̵��Ͽ����ϴ�.");  } //�߻�Ŭ���� ����
    void changeMode()    {System.out.println("���ݸ��� ��ȯ�Ͽ����ϴ�.");}
	}
class Dropship extends Unit {
	void move (int x, int y) {System.out.println("����� "+ x + ", "+ y +"��ŭ �̵��Ͽ����ϴ�.");  } //�߻�Ŭ���� ����
    void load()    {System.out.println("����� �¿����ϴ�.");}
	void unload()  {System.out.println("����� ���Ƚ��ϴ�.");
}

}
