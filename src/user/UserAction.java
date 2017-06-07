package user;

import java.util.List;

import entity.Userinfo;

import base.BaseAction;

public class UserAction extends BaseAction {

	private UserService service;

	public void setService(UserService service) {
		this.service = service;
	}


	private Userinfo user;

	public Userinfo getUser() {
		return user;
	}

	public void setUser(Userinfo user) {
		this.user = user;
	}

	public String login() {
		System.out.println("1");
		user = service.queryUser(user);
		if (user != null) {
			return "querySuccess";
		} else {
			return "queryFailure";
		}
	}
}
