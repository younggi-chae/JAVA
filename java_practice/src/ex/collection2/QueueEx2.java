package ex.collection2;
import java.util.*;

// Priority Queue
public class QueueEx2 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue(); //���ڰ� ����  ��, �켱������ ���� ������ ��Ҹ� ������.
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq); // �迭�� ���
		
		Object obj = null;
		
		while((obj = pq.poll()) != null) // ����� ��Ҹ� �ϳ��� ������.
			System.out.println(obj);

	}

}
