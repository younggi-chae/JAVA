package ex.collection4;
import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();  // �ߺ����� ������� �ʴ´�. 
		                          // 1�� ��� �ϳ��� String�ν��Ͻ� , �ϳ��� Integer�ν��Ͻ��� ���� �ٸ� ��ü
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet�� objArr�� ��ҵ��� ����
		}
		System.out.println(set);
	}

}
