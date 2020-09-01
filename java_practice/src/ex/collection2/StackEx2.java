package ex.collection2;
import java.util.*;
 
public class StackEx2 {
      //����  Ȱ��, �ڷΰ��� �����ΰ���
	  public static Stack back = new Stack();
      public static Stack forward = new Stack();
        
	public static void main(String[] args) {
		
		goURL("1.���̽���");
		goURL("2.���̹�");
		goURL("3.����");
		goURL("4.����Ʈ");
		
		printStatus();
		
		goBack();
		System.out.println("==�ڷΰ��� ��ư�� ���� �� ==");
		printStatus();
		
		goBack();
		System.out.println("==�ڷΰ��� ��ư�� ���� �� ==");
		printStatus();
		
		goForward();
		System.out.println("==�����ΰ��� ��ư�� ���� �� ==");
		printStatus();
		
		goURL("github.com");
		System.out.println("==���ο� �ּҷ� �̵� �� ==");
		printStatus();
		
	}
   public static void printStatus() {
	   System.out.println("back : " + back);
	   System.out.println("forward : " + forward);
	   System.out.println("����ȭ���� '" + back.peek() + "' �Դϴ�.");
	   System.out.println();        //���� back �� ���� ���� �������ʰ� ��ȯ
   }
   public static void goURL(String url) {
	   back.push(url);      // back�� url�� �����Ѵ�.
	   if(!forward.empty()) // ���� forward�� ������� �ʴٸ� forward�� ����.
		   forward.clear();
   }
   public static void goForward() {
	   if(!forward.empty())            
		   back.push(forward.pop()); // foward �� ���� ���� ������ back�� ����
   }
   public static void goBack() {
	   if(!back.empty())
		   forward.push(back.pop()); //back�� �� ���� ���� ������ forward�� ����
   }
}
