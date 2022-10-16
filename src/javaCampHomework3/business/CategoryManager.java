package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.dataAccess.ICategoryDao;
import javaCampHomework3.entities.Category;

public class CategoryManager implements ICategoryService {
	
	private ICategoryDao _categoryDao;
	
	public CategoryManager(ICategoryDao categoryDao) {
		_categoryDao = categoryDao;
	}

	@Override
	public Category getById(int id) {
		_categoryDao.getById(id);
		return null;
	}

	@Override
	public List<Category> getAll() {
		_categoryDao.getAll();
		return null;
	}

	@Override
	public void delete(int id) {
		_categoryDao.delete(id);
	}

	@Override
	public void add(Category category) {
		String categoryName = "Programlama";
		
		if (categoryName == category.getName()) {
			System.out.println("Category already added to database.");
		} else {
			_categoryDao.add(category);
		}
	}

	@Override
	public void update(Category category) {
		_categoryDao.update(category);
	}

}
