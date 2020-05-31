package ex.collection2;
import java.util.*;

//�ֱ� �Է��� ��� ��� �����
public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;  //Queue�� �ִ� 5���� ����
    
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) { // ��ҹ��� ������� ��
					System.exit(0);               // �ý����� �������´�.
				} else if(input.equalsIgnoreCase("help")) {  
				      System.out.println("help - ������ �����ݴϴ�.");
				      System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�.");
				      System.out.println("history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "���� �����ݴϴ�.");
				} else if(input.equalsIgnoreCase("history")) {
					  int i = 0;
					  save(input);  //�ԷµǴ� ���� ����
					  
					  LinkedList tmp = (LinkedList)q; //��ũ�帮��Ʈ�� ������ �����ش�.
					  ListIterator it = tmp.listIterator(); //����� ��Ҹ� �о���� ���
					  
					  while(it.hasNext()) {  //hasNext() �޼��带 ���� ��Ҹ� ������ ������ true��ȯ , ������ false��ȯ
						  System.out.println(++i + "." + it.next()); //next()�޼���� ���� ����Ʈ�� ���� ��Ҹ� ��ȯ
					  }
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}

	}
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);   // Queue�� �Է°��� ����
		if(q.size() > MAX_SIZE)
			q.remove();  //����Ʈ�� �ִ� 5�������� �� �� �ֵ���
	}

}
