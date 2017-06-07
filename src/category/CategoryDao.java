package category;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Categories;

public class CategoryDao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void addCategory(Categories cate) {
		this.factory.getCurrentSession().save(cate);
		System.out.println("addµÄdao");
	}

	public List categoryQuery(String categoryname) {
		System.out.println("3");
		Query query = this.factory.getCurrentSession().createQuery(
				"from Categories where categoryname like '%" + categoryname
						+ "%'");
		List<Categories> list = query.list();
		if (list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}

	public void deleteCategory(Categories cate) {
		Session session = this.factory.getCurrentSession();
		session.delete(cate);
		System.out.println("6");
	}

	public void updateCategory(Categories cate) {
		this.factory.getCurrentSession().update(cate);
	}

}