package ex.array;

public class arrayEx6 {
       //�迭�� ���� �ζǹ�ȣ ���� ����
	public static void main(String[] args) {
		int ball[] = new int[45]; // 45���� �������� �����ϴ� �迭 ����
		
		for(int i = 0; i < ball.length; i++) { //�迭�� 1~45���� ����
			ball[i] = i+1; // ball[0]�� 1�� ����, 1���� �����ϵ��� ����
		}
			int tmp = 0; // �ΰ��� ���� �ٲٴµ� ����� �ӽú���
			int j = 0; // ������ ���� ������ ����
			
			for(int i = 0; i < 6; i++) { // 6���� ������ ���ڸ� �̴´�.
				tmp = ball[i];
				
				j = (int)(Math.random()*45); //1~45���� ���� ���� ����
				
				ball[i] = ball[j]; //���Ƿ� ���� ���ڸ� i�� ����
				ball[j] = tmp; // i�� j���� �ٲ۴�.
			}
			for(int i = 0; i < 6; i++) {
				System.out.println("ball "+i+" = "+ball[i]);
			}
			}

}
