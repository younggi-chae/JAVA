package ex.loop;

public class loopEx4 {
     //������ 2~9�ܱ��� ��� ����
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {  //2��~9�ܱ��� 8�� �ݺ�����Ѵ�. ���� for�� 1~9���� ��ȯ �� ���� �ݺ����� ����
			for(int j = 1; j <= 9; j++) { //1~9���� �ݺ������� ��ȯ
			 System.out.println(i+ " x "+ j +" = " + i*j);	
			}
		}

	}

}
