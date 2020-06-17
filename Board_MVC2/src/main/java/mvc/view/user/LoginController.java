package mvc.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.user.UserDTO;
import mvc.user.impl.UserDAO;
import mvc.view.controller.Controller;

public class LoginController implements Controller {
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("�α��� ó��");
		
		//1. ����� �Է� ���� ����
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		//2. DB ���� ó��
		UserDTO dto = new UserDTO();
		dto.setId(id);
		dto.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserDTO user = userDAO.getUser(dto);
		
		//3. ȭ�� �׺���̼�
		if(user != null) {
			return "getBoardList.do";
			
		} else {
			return "login";
		}
	}
}
