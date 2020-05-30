package ex.collection;
import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // ũ�Ⱑ 10�� ArrayList ����
		  list1.add(new Integer(5));
		  list1.add(new Integer(4));  //Add�޼���� ��ü�� ������� ����
		  list1.add(new Integer(2));
		  list1.add(new Integer(0));
		  list1.add(new Integer(1));
		  list1.add(new Integer(3));
		  
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //list1��  index[1]���� [3]���� ������
		  print(list1, list2);
          
		  Collections.sort(list1); //sort�޼��带 ���� ����
		  Collections.sort(list2);
		  print(list1, list2);
		  
		  System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
	      //list2�� ��ü���� list1�� ���ԵǾ� �ִ��� Ȯ��,  true
		  
		  list2.add("B");
		  list2.add("C");
		  list2.add(3, "A");  //index[3]�� "A"�߰�
		  print(list1, list2);
		  
		  list2.set(3, "AA"); // index[3] ��ġ�� "AA" ����
		  print(list1, list2);
		  
		  System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		  print(list1, list2); //list2 ��ü�� ��ġ�� list1 ��ü���� �����ϰ� ������ ��ü ����
		  
		  for(int i = list2.size()-1; i >= 0; i--) {
			  if(list1.contains(list2.get(i))) //���� list2�� ��ü�� list1�� ��ü�� ��ġ�� ���� �ִٸ�?
				  list2.remove(i); //list2�� 0,2,4���� 
		  }
		  print(list1, list2);
	}
          static void print(ArrayList list1, ArrayList list2) {
        	  System.out.println("list1 : "+ list1);
        	  System.out.println("list2 : "+ list2);
        	  System.out.println();
          }
	
	}


