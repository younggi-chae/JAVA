package baseballGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		baseball b = new baseball();
		Referee referee;
		int arr[] = new int[3];
		int count = 0;
		
		do {
			System.out.println("�߱����� ����");
			System.out.println("�Է� : ");
			String str = sc.nextLine();
			
			arr[0] = Integer.parseInt(str.substring(0,1));
			arr[1] = Integer.parseInt(str.substring(1,2));
			arr[2] = Integer.parseInt(str.substring(2,3));
			
			referee = b.judge(arr);
			
			System.out.println(referee.getStrike() + "S " +  referee.getBall() + " B");
			count++;
			
		} while(referee.getStrike() < 3);
		
		System.out.println(count + "������ ����!");
	}

}
