package ex.view.user;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LogoutController {
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("�α׾ƿ� ó��");
		session.invalidate();
		return "login.jsp";
		
				
		 //1.�������� ����� ���� ��ü�� ���� ����
	    //HttpSession session = request.getSession();
		//session.invalidate();

	    //2.���� ���� ��, ���� ȭ������ �̵��Ѵ�.
	    //ModelAndView mav = new ModelAndView();
	   // mav.setViewName("redirect:login.jsp");
	   // return mav;
		
		//return "login";
	}

}
