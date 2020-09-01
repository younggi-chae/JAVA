package ex.user;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("application_boardContext.xml");
		
		//2. Spring �����̳ʷκ��� UserServiceImpl ��ü�� lookup�Ѵ�.
        UserService userService = (UserService)container.getBean("userService");
		
		//3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test1234");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		// 4. Spring �����̳� ����
		container.close();

	}

}
