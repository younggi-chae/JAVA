package ex.collection;
import java.util.*;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		//Vetor�� �뷮(capacity)�� ũ��(size) ����
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); //�� ������ ����.(�뷮�� ũ�Ⱑ ������), ���ο� �迭 ����, ������ü�� GC�� ���� ����
		System.out.println("====After trimToSize() ====");
		print(v);
		
		v.ensureCapacity(6);  //capacity 6���� ����, ���ο� �ν��Ͻ� ����
		System.out.println("====After ensureCapacity(6) ====");
		print(v);
		
		v.setSize(7); // size�� 7�� ���� , capacity�� 2��� ����, ����� null��
		System.out.println("====After setSize(7) ====");
		print(v);
		
		v.clear(); // v�ȿ� �ִ� ������ ����, size 0, capacity�� ��������.
		System.out.println("====After clear() ====");
		print(v);

	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}

}

 /* ArrayList�� Vector ���� �迭�� �̿��� �ڷᱸ���� �˷��� �����ؾ��� �� ���ο� �迭�� ������ ��
  ������ �迭�κ��� ���� ������ �迭�� �����͸� �����ؾ��ϱ� ������ ȿ���� ��������.
  ó���� �ν��Ͻ��� ������ �� ������ �������� ������ �� ����Ͽ� ����� �뷮�� �ν��Ͻ� ������ �߿� */
