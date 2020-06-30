package mvc.view.user;
 
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.user.UserDTO;
import mvc.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(UserDTO dto) {
		System.out.println("�α��� ȭ������ �̵�");
		dto.setId("test");
		dto.setPassword("test123");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserDTO dto, UserDAO userDAO, HttpSession session) {
		
		if (dto.getId() == null || dto.getId().equals("")) {
			throw new IllegalArgumentException("���̵�� �ݵ�� �Է��ؾ� �մϴ�.");
		}
		
		UserDTO user = userDAO.getUser(dto);
		if(user != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		
		else return "login.jsp";
		
	}
}
