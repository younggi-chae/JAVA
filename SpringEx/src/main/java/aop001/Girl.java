package aop001;

public class Girl {
	public void runSomething() {
		System.out.println("����� ���� ���� ���� ����.");
		
		try {
			System.out.println("�丮�� �Ѵ�.");  // �ٽɰ��ɻ�,  �������� Ⱦ�� ���ɻ�
		} catch (Exception e) {
			if(e.getMessage().equals("���� �ҳ�")) {
				System.out.println("119�� �Ű��Ѵ�.");
			}
		} finally {
			System.out.println("�ҵ��ϰ� �ܴ�.");
		}
		System.out.println("�ڹ��踦 ��׷� ���� ������.");
	}
}
