package mvc.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
				
		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup �Ѵ�.
		UserService userService = (UserService) container.getBean("userService");
				
		// 3. �α��� ��� �׽�Ʈ
		UserDTO dto = new UserDTO();
		dto.setId("test");
		dto.setPassword("test123");
		 
		UserDTO user = userService.getUser(dto);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		container.close();
	}

}
