package ex.array;
import java.util.*;
public class arrayEx2 {
       //�迭�� ���� System.arraycopy()Ȱ��
	public static void main(String[] args) {
		  char[] abc = {'A', 'B', 'C', 'D'};
		  char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		  System.out.println(abc);
		  System.out.println(num);
		  
		  //�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		  char[] result = new char[abc.length + num.length]; //abc+num���� ���� ��ü�� �����Ͽ� result�� ����
		  System.arraycopy(abc, 0, result, 0, abc.length); //abc[0]���� result[0]���� abc.length���� ������ ����
		  System.arraycopy(num, 0, result, abc.length , num.length);// num[0]���� result[abc.length]���� num.length���� ������ ����
		  System.out.println(result);
		  
		  //�迭  abc�� num�� ù ��° ��ġ�κ��� �迭 abc�� ���̸�ŭ ����
		  System.arraycopy(abc, 0, num, 0, abc.length); //abc[0]���� num[0]���� abc.length���� ������ ����
		  System.out.println(num);
		  
		  //number�� �ε��� 6 ��ġ�� 3���� ����
		  System.arraycopy(abc, 0, num, 6, 3); // abc[0]���� num[6]���� 3���� ������ ����
		  System.out.println(num);
	}

}
