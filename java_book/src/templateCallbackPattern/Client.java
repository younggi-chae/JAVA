package templateCallbackPattern;

public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("��! ��������!");
		
		System.out.println();
		
		rambo.runContext("Į! īīīĮ!");
		
		System.out.println();
		
		rambo.runContext("����! ����������!");
		
	}

}
