package ex.loop;

public class loopEx5 {
      //for���� if�� ��ø
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {  // if������ ���� ���� �ָ� ���
				System.out.print("[" +i+ ", " + j + "]");
			} else {
				System.out.print(" ");
			}
			
		  }
			System.out.println();
		}
	}

}
