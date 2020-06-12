package ex.view.user;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import ex.user.UserVO;
import ex.user.impl.UserDAO;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("�α��� ȭ������ �̵�");
		vo.setId("test");
		vo.setPassword("test1234");
		return "login.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession sesstion) {
		if (vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("���̵�� �ݵ�� �Է��ؾ� �մϴ�.");
		}
		System.out.println("�α��� ���� ó��");
		UserVO user = userDAO.getUser(vo);
		if (user != null) {
			sesstion.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}

		else
			return "login.jsp";

		// 1. ����� �Է� ���� ����
		// String id = request.getParameter("id");
		// String password = request.getParameter("password");

		// 2. db���� ó��
		// UserVO vo = new UserVO();
		// vo.setId(id);
		// vo.setPassword(password);

		// UserDAO userDAO = new UserDAO();
		// UserVO user = userDAO.getUser(vo);

		// 3. ȭ�� ���̰��̼�
		// ModelAndView mav = new ModelAndView();
		// if(user != null){
		// mav.setViewName("redirect:getBoardList.do");
		// } else {
		// mav.setViewName("redirect:login.jsp");
		// }
		// return mav;
	}

}
