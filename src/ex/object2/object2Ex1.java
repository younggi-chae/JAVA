package ex.object2;

class Data{ int x; }

public class object2Ex1 {

	public static void main(String[] args) {
		 Data d = new Data();
		 d.x = 10;  //������ �Ű�����
		 System.out.println("main() : x = "+ d.x);
		 
		 change(d.x); // ������ �ƴ� ���纻�� ����, �⺻�� �Ű�����(����)���� �ƹ��� ������ ��ġ�� ����.
		 //change(d); << ������ �Ű������� ���� �о���� �ͻӸ� �ƴ϶� ���浵 ������.
		 System.out.println("After change(d.x)");
		 System.out.println("main() : x = "+d.x);
	}
		 static void change( int x) { // (data d)�� ��� 
			//d.x = 1000;  << ������ �Ű�����
			 x = 1000;   //�⺻�� �Ű�����, �б⸸ �����ϰ� , ������ �Ұ�����
			 System.out.println("change() : x = "+x);
		 
		 
	}

}
