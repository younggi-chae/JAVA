package proxyPattern;

public class ClientWithProxy {

	public static void main(String[] args) {
		//���Ͻø� �̿��� ȣ��
		IService proxy = new Proxy();
		System.out.println(proxy.runSomething());

	}

}
