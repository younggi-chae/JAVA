package aop001;

public class Boy {
	public void runSomething() {
		System.out.println("����� ���� ���� ���� ����.");
		
		try {
			System.out.println("��ǻ�ͷ� ������ �Ѵ�.");  // �ٽɰ��ɻ�,  �������� Ⱦ�� ���ɻ�
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
