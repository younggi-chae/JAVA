package ex.array;
import java.util.Scanner;

public class arrayEx11 {

	public static void main(String[] args) {
		String word[][] = {
				{"chair","����"},      //word[0][0], word[0][1]
				{"computer", "��ǻ��"}, //word[1][0], word[1][1]
				{"camera", "ī�޶�"}    //word[2][0], word[2][1]
		};
		
		Scanner sc = new Scanner(System.in);
        
		for(int i = 0; i < word.length; i++) {  //���� 3
			System.out.println(word[i][0]+"�� ����?"); //1���� �ִ� ������ ���������� ���
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(word[i][1])) { //���ǹ�, �Է°��� 2���� ���� ���ٸ�?
				System.out.println("�����Դϴ�!");
			} else{
				System.out.println("Ʋ�Ƚ��ϴ�!, ������ "+word[i][0]+"�Դϴ�.");
			}
		}
	}

}
