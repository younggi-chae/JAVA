package ex.array;

public class arrayEx5 {
       //�迭�� ���� shuffle(����) ����
	  public static void main(String[] args) {
    	  
		  int num[] = new int[10]; //���̰� 10�� �迭 ����
    	   
    	   for(int i = 0; i < num.length; i++) {
		   num[i] = i; //�迭�� 0~9�� ���ڷ� �ʱ�ȭ, for���� ���� 0~9������ ���ڸ� �ϳ��� �����´�.
    		   System.out.print(num[i]);
    	   }
    	  System.out.println();
    	  
    	  for(int i = 0; i < num.length; i++) {
    		  int n = (int)(Math.random()*10); //0~9�� ���� ���Ƿ� ���� �ڵ�
    		  int tmp = num[0]; //�� ����� ����, num[0]�� ���� ���� tmp�� ����
    		  num[0] = num[n]; //0�� n�� ���� ���� �ٲ�
    		  num[n] = tmp; // n���� �� ����ҿ� ����
    	  }
    	  for(int i = 0; i < num.length; i++) {
    		  System.out.print(num[i]);
    	  }
      }
	  
}
