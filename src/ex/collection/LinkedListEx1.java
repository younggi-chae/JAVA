package ex.collection;
import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		
		//ArrayList�� LinkedList ���ɺ� �� ����� �ľ�
		ArrayList a1 = new ArrayList(2000000);
		LinkedList l1 = new LinkedList();
		
		System.out.println("==���������� �߰��ϱ� ==");  //ArrayList�� LinkedList���� ������.
		System.out.println("ArrayList : " + add1(a1));
		System.out.println("LinkedList : " + add1(l1));
        System.out.println();
        System.out.println("==�߰��� �߰��ϱ� ==");   //LinkedList�� ArrayList���� ������. (�������� ũ�Ⱑ Ŭ ���� ���̰� ����.)
        System.out.println("ArrayList : " + add2(a1));
        System.out.println("LinkedList : " + add2(l1));
        System.out.println();
        System.out.println("==�߰����� �����ϱ� =="); //LinkedList�� ArrayList���� ������. (�������� ũ�Ⱑ Ŭ ���� ���̰� ����.)
        System.out.println("ArrayList : " + remove2(a1));
        System.out.println("LinkedList : " + remove2(l1));
        System.out.println();
        System.out.println("==���������� �����ϱ� =="); //ArrayList�� LinkedList���� ������.
        System.out.println("ArrayList : " + remove1(a1));
        System.out.println("LinkedList : " + remove1(l1));
        
	}
   public static long add1(List list) {
	   long start = System.currentTimeMillis();
	   for(int i = 0; i < 100000; i++) list.add(i+"");
	   long end = System.currentTimeMillis();
	   return end - start;
   }
   public static long add2(List list) {
	   long start = System.currentTimeMillis();
	   for(int i = 0; i < 10000; i++) list.add(500, "X");
	   long end = System.currentTimeMillis();
	   return end - start;
}
   public static long remove1(List list) {
	   long start = System.currentTimeMillis();
	   for(int i = list.size()-1; i >= 0; i--) list.remove(i);
	   long end = System.currentTimeMillis();
	   return end - start;
}
   public static long remove2(List list) {
	   long start = System.currentTimeMillis();
	   for(int i = 0; i < 10000; i++) list.remove(i);
	   long end = System.currentTimeMillis();
	   return end - start;
	   
	
   }}