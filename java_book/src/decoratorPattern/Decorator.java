package decoratorPattern;

public class Decorator implements IService {
		IService service;
		
		public String runSomething() {
			System.out.println("ȣ�⿡ ���� ��� �ָ���, Ŭ���̾�Ʈ���� ��ȯ ����� ����� ���Ͽ� ����");
			
			service = new Service();
			return "����" + service.runSomething();
				
		}
}
