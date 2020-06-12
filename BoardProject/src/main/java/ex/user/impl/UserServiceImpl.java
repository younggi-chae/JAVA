package ex.user.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ex.user.UserVO;
import ex.user.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
	
	
    
}
