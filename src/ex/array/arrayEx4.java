package ex.array;

import java.util.*;

public class arrayEx4 {
	// �迭�� ���� �ִ밪, �ּҰ� ���ϱ�, sort(����)Ȱ��
	public static void main(String[] args) {

		int score[] = { 3, 6, 8, 5, 3, 2, 0, 9, 1 };
		int max = score[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ
		int min = score[0]; // �迭�� ù ���� ������ �ּҰ��� �ʱ�ȭ

		Arrays.sort(score); // �迭 ����

		System.out.println("�ִ밪 : " + score[score.length - 1]);
		System.out.println("�ּҰ� : " + score[0]);

//		int score[] = {100, 90, 80, 70, 60};
//		
//		int max = score[0]; //�迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ
//		int min = score[0]; //�迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ
//		
//		for(int i = 1; i < score.length; i++) { // �迭�� 2��° ������ for���� �����ϱ����� ����i�� 1�� ����
//			 if(score[i] > max) {  // �迭�� index[1]���� max�� ���ϱ� ����
//				 max = score[i]; //�ִ밪
//			 } else if(score[i] < min) { // �迭�� index[1]���� min�� ���ϱ� ����
//					 min = score[i]; //�ּҰ� 
//				 }
//			 }
//			  System.out.println("�ִ밪 : "+max);
//			  System.out.println("�ּҰ� : "+min);
	}

}
