package kosta.data;

public class LottoArray {

	public static void main(String[] args) {
		int num[] = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
