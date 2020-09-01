package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class TVUser {
     
	public static void main(String[] args) {
		
		//1. Spring �����̳ʸ� ����
		
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("application3Context.xml");
		
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
	    tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
		
		//3. Spring �����̳� ����
		factory.close();

	}

}
