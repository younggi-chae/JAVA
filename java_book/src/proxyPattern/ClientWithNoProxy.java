package proxyPattern;

public class ClientWithNoProxy {

	public static void main(String[] args) {
		//���Ͻø� �̿����� ���� ȣ��
		Service service = new Service();
		System.out.println(service.runSomething());

	}

}
