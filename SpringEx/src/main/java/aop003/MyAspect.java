package aop003;

import org.aspectj.lang.JoinPoint;

// POJO�� XML ��� 
public class MyAspect {
		public void before(JoinPoint joinPoint) {
			System.out.println("�� �ν� Ȯ�� : ���� �����϶�");
		}
}
