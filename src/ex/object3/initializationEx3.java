package ex.object3;

class Document {
	static int count = 0;
	String name; // ���� �̸�

	Document() {    //���� ���� �� �����̸��� �������� �ʾ��� ��
		this("�������" + ++count);
	}

	Document(String name) { //�Ű������� �ִ� ������
		this.name = name;  //�ν��Ͻ����� = ��������
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
}

public class initializationEx3 {

	public static void main(String[] args) {
          Document d1 = new Document();
          Document d2 = new Document("�ڹ�.txt");
          Document d3 = new Document();
          Document d4 = new Document();
	}

}
