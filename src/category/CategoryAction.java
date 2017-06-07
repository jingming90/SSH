package category;

import java.math.BigDecimal;
import java.util.List;
import entity.Categories;
import base.BaseAction;

public class CategoryAction extends BaseAction {

	private CategoryService service;

	public void setService(CategoryService service) {
		this.service = service;
	}

	private Categories cate;

	public Categories getCate() {
		return cate;
	}

	public void setCate(Categories cate) {
		this.cate = cate;
	}

	public String addCategory() {
		System.out.println("addµÄaction");
		this.service.addCategory(cate);
		return "success";
	}

	private List<Categories> cates;

	public List<Categories> getCates() {
		return cates;
	}

	public void setCates(List<Categories> cates) {
		this.cates = cates;
	}

	public String categoryLogin() {
		System.out.println("1");
		cates = service.queryCategory(cate.getCategoryname());
		return "success";
	}

	public String deleteCategory() {
		System.out.println("4");
		this.service.deleteCategory(cate);
		return "success";
	}

	public String updateCategroy() {
		if (cate.getCategoryid().equals(cate.getCategoryid())) {
			this.service.updateCategory(cate);
			return "success";
		} else {
			return "failure";
		}
	}
}
