package ex.object3;

class Data1 {
	int value;
}

class Data2 {

	int value;

	Data2(int x) {

		value = x;
	}
}

public class constructorEx1 {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); // �⺻������(default constructor)�� �ڵ����� �߰�
		// Data2 d2 = new Data2(); //�����Ͽ���, �̹� �����ڰ� ���ǵǾ� �־� �⺻������ x
		Data2 d2 = new Data2(10);
		// �Ű������� �������ִ��� Ŭ���� Data2�� Data2() �⺻ �����ڸ� �߰����ش�.
	}

}
