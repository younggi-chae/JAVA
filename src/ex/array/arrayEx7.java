package ex.array;

public class arrayEx7 {
        //�迭�� ���� �迭�� �� �󵵼� ���ϱ�
	public static void main(String[] args) {
		 int num[] = new int[10];
		 int counter[] = new int[10];
		 
		 for(int i = 0; i < num.length; i++) { 
			 num[i] = (int)(Math.random()*10); // 0~9������ ������ ���ڸ� i�迭�� ����
			 System.out.print(num[i]);
		 }
		 System.out.println(); //�ٹٲ�
		 
		 for(int i = 0; i < num.length; i++) {
			 counter[num[i]]++;  // num�� ����� ���� ��ġ�ϴ� �ε����� ��ҿ� ����� ���� 1�� ������Ų��.
		 }
		 for(int i = 0; i < num.length ; i++) {
			 System.out.println(i+"�� ���� : "+counter[i]);
		 }
	}

}
