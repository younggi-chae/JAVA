package lambda;


//���ο� ����� �ڵ� ��� ��� - ����
public class Lambda003 {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Hello Lambda 3!!!");
		
		
		r.run();
	}
	
//	public static void main(String[] args) {
//		Runnable r = () -> {
//			System.out.println("Hello Lambda 3!!!");
//		};
//		
//		r.run();
//	}
}


