package ex.array;

public class arrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[5]; //�迭���� �� �迭����
		//int[] score = {50, 60, 70 ,80, 90}
		int j = 1; //test
		
		score[0] = 50;
		score[1] = 60;
		score[j+1] = 70; //test
		score[3] = 80;
		score[4] = 90;
		//score[5] = 100; //�ε����� ������ �Ѿ�� ArrayIndexOutOfBoundsException �����߻�
		
		int tmp = score[j+1] + score[4]; // �ε���[2]�� �ε���[4]�� �հ�, tmp�� ����
		
		for(int i = 0; i < score.length; i++) { //length�� ���� �ε����� ��������
			 System.out.println(score[i]);
			 
			
		}
		System.out.println(tmp); // �հ�
	}

}
