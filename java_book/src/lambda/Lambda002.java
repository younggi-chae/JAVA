package lambda;

//���� ����� �ڵ� ��� ��� - �͸� ��ü ����
public class Lambda002 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello Lambda!!");
			}
		};
			r.run();
	}

}
