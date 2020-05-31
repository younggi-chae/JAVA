package ex.collection;
import java.util.*;

public class LinkedListEx2 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(1000000);
		LinkedList l1 = new LinkedList();
		
		add(a1);
		add(l1);
		
		System.out.println("==���ٽð� �׽�Ʈ ==");
		System.out.println("ArrayList : " + access(a1));  // ���������� ��ҵ��� �޸𸮻� �����ϱ� ������ ������ �������� �������� �ּҸ� ��� �����Ѵ�.
		System.out.println("LinkedList : " + access(l1)); //�ҿ��������� �����Ͱ� ����Ǿ� �־� ó������ n��° �����ͱ��� ���ʴ�� ���󰡾߸� ���ϴ� ������ ���� ���� �� �ִ�.
                                                          //�����Ͱ� �������� LinkedList ���ټ��� ������.
		                                                  //ArrayList�� LinkedList���� ���ٽð��� ������.
	}
	
	public static void add(List list) {
		for(int i=0; i < 100000; i++) list.add(i+"");
	}
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start ;
	}

}
        //Queue�� LinkedList, Stack�� ArrayList�� ����.
        /* �� Ŭ������ ������ ���ؿ� �� Ŭ������ �����ؼ� ����ϴ� ����� ������ �� �� �ִ�.
         ArrayList a1 = new ArrayList(1000000);
         for(int i = 0; i < 100000; i++) a1.add(i+"");
         
         LinkedList l1 = new LinkedList(a1);
         for(int i = 0; i < 1000;i++) li.add(500, "X"); */