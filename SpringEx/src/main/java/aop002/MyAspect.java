package aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinpoint) {
		System.out.println("�� �ν� Ȯ�� : ���� �����϶�");
		//System.out.println("����� ���� ���� ���� ����.");
	}
	
}
