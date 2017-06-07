package user;

import java.util.List;

import entity.Userinfo;

public class UserService {

	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public Userinfo queryUser(Userinfo user) {
		System.out.println("2");
		return dao.loginUser(user);
	}
}
