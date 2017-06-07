package category;

import java.math.BigDecimal;
import java.util.List;

import entity.Categories;

public class CategoryService {

	private CategoryDao dao;

	public void setDao(CategoryDao dao) {
		this.dao = dao;
	}

	public void addCategory(Categories cate) {
		System.out.println("addµÄservice");
		this.dao.addCategory(cate);
	}

	public List<Categories> queryCategory(String categoryname) {
		System.out.println("2");
		return dao.categoryQuery(categoryname);
	}

	public void deleteCategory(Categories cate) {
		System.out.println("5");
		dao.deleteCategory(cate);
	}

	public void updateCategory(Categories cate) {
		this.dao.updateCategory(cate);
	}

}
