package ex.collection2;
import java.util.*;

class MyStack extends Vector {
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	public Object pop() {
		Object obj = peek(); // Stack�� ����� ������ ��Ҹ� �о�´�.
		//���� Stack�� ��������� peek()�޼��尡 EmptyStackException�� �߻���Ų��.
		//������ ��Ҹ� �����Ѵ�. �迭�� index�� 0 ���� �����ϹǷ� 1�� ���ش�.
		removeElementAt(size()-1);
		return obj;
	}
	public Object peek() {
		int len = size();
		
		if(len == 0)
			throw new EmptyStackException();
		// ������ ��Ҹ� ��ȯ�Ѵ�. �迭�� index�� 0���� �����ϹǷ� 1�� ���ش�.
		return elementAt(len-1);
	}
	public boolean empty() {
		return size() == 0;
	}
	public int search(Object o) {
		int i = lastIndexOf(o);  //���������� ��ü�� ã�´�.
		//��ȯ���� ����� ��ġ (�迭�� index)��.
		if(i >= 0) {
			return size() - i; // Stack�� �� ���� ����� ��ü�� index�� 1�� �����ϱ� ����
		}
		return -1;  //�ش� ��ü�� ã�� ���Ѵٸ� -1 ��ȯ
	}
}


public class StackEx1 {

	public static void main(String[] args) {
		  Stack st = new Stack();
		   st.push("0");
		   st.push("1");
		   st.push("2");
		   
		   System.out.println(st.pop());
		   System.out.println(st.peek());
		   System.out.println(st.search("0"));
	}

}
