package ex.object2;

public class object2Ex2 {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 2, 1, 6, 5, 4 }; //�迭 ��ü ����

		printArr(arr); //�迭�� ��� �ε��� �� ���
		sortArr(arr); //�迭 ����
		printArr(arr); //���� �� ��� ���
		System.out.println("sum = " + sumArr(arr)); // �迭�� ����
	}

	static void printArr(int[] arr) {
		System.out.print("[");

		for (int i : arr) { // for(���Թ��� �������� : �迭��)
			System.out.print(i + ",");

		}
		System.out.println("]");
	}

	static int sumArr(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		return sum;
	}

	static void sortArr(int[] arr) { // �迭 �������� ����
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}