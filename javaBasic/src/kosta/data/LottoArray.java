package kosta.data;

public class LottoArray {

	public static void main(String[] args) {

		int lotto[] = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + ", ");
		}
	}

}
