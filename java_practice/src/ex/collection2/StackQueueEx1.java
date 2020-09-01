package ex.collection2;
import java.util.*;

public class StackQueueEx1 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue�� ������ Ŭ������ �������� �ʴ´�.   Queue�������̽��� ����ü�� LinkedList�� ���
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("==Stack =="); //���� ���� ���� ���߿� �������� ����(LIFO)
		while(!st.empty()) {  // ������� ���� ������ while�� ����
			System.out.println(st.pop()); // ������ ��ü�� ������.
		}
		
		System.out.println("==Queue ==");  //���� ���� ���� ���� �������� ����(FIFO)
		while(!q.isEmpty()) { 
			System.out.println(q.poll()); // ��ü�� ������ ��ȯ
		}

	}

}
