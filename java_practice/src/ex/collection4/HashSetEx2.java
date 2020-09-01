package ex.collection4;
import java.util.*;

public class HashSetEx2 {
  //�ߺ��� ���� ������� �ʴ� HashSet�� ������ ���� �ζǹ�ȣ �����
	
	public static void main(String[] args) {
		Set set = new HashSet();  //HashSet ����
		
		for(int i = 0; set.size() < 6; i++) {  // 6���� ���ڸ� �̴´�.
			int num = (int)(Math.random()*45)+1; // 1~45 ���� �������� �̾� num�� ����
			set.add(new Integer(num)); // num���� set�� ����
		}
		
		List list = new LinkedList(set);  // set ���� list�� ����
		Collections.sort(list);           // ��ȣ�� ���� ������ ����
		System.out.println(list);
		

	}

}
