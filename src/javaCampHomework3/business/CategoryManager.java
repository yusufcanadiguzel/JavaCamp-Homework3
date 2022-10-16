package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
//import javaCampHomework3.dataAccess.ICategoryDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Category;

public class CategoryManager implements ICategoryService {
	
	//private ICategoryDao _categoryDao;
	private JdbcEntityDao<Category> _jdbcEntityDao = new JdbcEntityDao<>();
	private ILogger _logger;
	
	public CategoryManager(/*ICategoryDao categoryDao*/ ILogger logger) {
		//_categoryDao = categoryDao;
		_logger = logger;
	}

	@Override
	public Category getById(int id) {
		_jdbcEntityDao.getById(id);
		_logger.Log();
		return null;
	}

	@Override
	public List<Category> getAll() {
		_jdbcEntityDao.getAll();
		_logger.Log();
		return null;
	}

	@Override
	public void delete(int id) {
		_jdbcEntityDao.delete(id);
		_logger.Log();
	}

	@Override
	public void add(Category category) {
		String categoryName = "Programlama";
		
		if (categoryName == category.getName()) {
			System.out.println("Category already added to database.");
		} else {
			_jdbcEntityDao.add(category);
		}
		
		_logger.Log();
	}

	@Override
	public void update(Category category) {
		_jdbcEntityDao.update(category);
		
		_logger.Log();
	}

}
