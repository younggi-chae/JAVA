package ex.collection4;
import java.util.*;

public class HashSetEx3 {
    // 5x5 ������ �����
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];  // 5x5 ������ �迭 ����
		
		for(int i = 0; set.size() < 25; i++) {     // �� 25���� ���ڸ� �������� �̴´�
			set.add((int)(Math.random()*50)+1+""); // 50���� ���� �� 25�� ���� �������� �̾Ƽ� set�� ����
		}
		
		Iterator it = set.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next()); //next�� ��ȯ���� objectŸ���̹Ƿ� ����ȯ
				System.out.print((board[i][j] < 10 ? " " : " ")+ board[i][j]);
			}
			System.out.println();
		}

	}

}
