package ex.loop;

public class loopEx1 {

	public static void main(String[] args) {
		int sum = 0; //�հ踦 �����ϱ� ���� ����
	//for(�ʱ�ȭ ; ���ǽ� ; ������) ���ǽ��� ���϶� ���� �ݺ�����
		for(int i = 1; i <= 10; i++ ) {
			sum += i;
			System.out.println("1���� "+ i +"������ �� = "+sum);
		}
    }
}
