package ex.loop;

public class loopEx6 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
				
		for(int i = 0; i< arr.length; i++) {  // length�� ���� �迭 �ȿ� �� ���� Ȯ��
			System.out.println(arr[i]);
		}
        for(int tmp : arr) {         //  for(Ÿ�� ������ : �迭 or �÷���) { �ݺ��� ����}  JDK1.5���� ��밡��
        	System.out.println(tmp);
        }
	}

}
