package aop004;

import org.aspectj.lang.JoinPoint;

// POJO�� XML ��� 
public class MyAspect {
		public void before(JoinPoint joinPoint) {
			System.out.println("�� �ν� Ȯ�� : ���� �����϶�");
		}
		
		public void lockDoor(JoinPoint joinPoint) {
			System.out.println("���δ� ������: ����  �� �ᰡ!");
		}
}
