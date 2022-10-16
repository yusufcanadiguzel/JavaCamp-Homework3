package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Category;

public class NhCategoryDao implements ICategoryDao{

	@Override
	public Category getById(int id) {
		System.out.println("Category gotten by NHibernate. Id: "+ id);
		return null;
	}

	@Override
	public List<Category> getAll() {
		System.out.println("Categories gotten by NHibertnate.");
		return null;
	}

	@Override
	public void add(Category category) {
		System.out.println("Category added by NHibernate.");
	}

	@Override
	public void update(Category category) {
		System.out.println("Category updated by NHibernate.");
	}

	@Override
	public void delete(int id) {
		System.out.println("Category deleted by NHibernate. Id:" + id);
	}

}
