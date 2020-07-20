package kosta.game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseBall baseBall = new BaseBall();
		Referee referee;
		int arr[] = new int[3];
		int count = 0;

		do{
			System.out.println("야구게임 시작");
			System.out.print("입력: ");
			String str = sc.nextLine();//123
			
			arr[0] = Integer.parseInt(str.substring(0, 1));
			arr[1] = Integer.parseInt(str.substring(1, 2));
			arr[2] = Integer.parseInt(str.substring(2, 3));
			
			referee = baseBall.judge(arr);
			
			System.out.println(referee.getStrike() + "S " + referee.getBall() + "B");
			count++;			
			
		}while(referee.getStrike() < 3);
		
		System.out.println(count + "번만에 성공");
	}

}
