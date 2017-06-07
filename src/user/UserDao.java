package user;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import entity.Userinfo;

public class UserDao {
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public Userinfo loginUser(Userinfo user) {
		System.out.println("3");
		Query query = factory.getCurrentSession().createQuery(
				"from Userinfo where UName=? and UPwd=?");
		query.setString(0, user.getUName());
		query.setString(1, user.getUPwd());
		 List<Userinfo> list= query.list();
		if (list.size() > 0) {
			return list.get(0);
		} else {
			System.out.println("’À∫≈√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î");
			return null;
		}
	}
}
