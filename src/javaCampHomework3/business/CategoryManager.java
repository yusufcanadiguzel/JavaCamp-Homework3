package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
import javaCampHomework3.dataAccess.IEntityDao;
//import javaCampHomework3.dataAccess.ICategoryDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Category;

public class CategoryManager implements ICategoryService {
	
	private IEntityDao _entityDao;
	private ILogger _logger;
	
	public CategoryManager(IEntityDao entityDao, ILogger logger) {
		_entityDao = entityDao;
		_logger = logger;
	}

	@Override
	public Category getById(int id) {
		_entityDao.getById(id);
		_logger.Log();
		return null;
	}

	@Override
	public List<Category> getAll() {
		_entityDao.getAll();
		_logger.Log();
		return null;
	}

	@Override
	public void delete(int id) {
		_entityDao.delete(id);
		_logger.Log();
	}

	@Override
	public void add(Category category) {
		String categoryName = "Programlama";
		
		if (categoryName == category.getName()) {
			System.out.println("Category already added to database.");
		} else {
			_entityDao.add(category);
		}
		
		_logger.Log();
	}

	@Override
	public void update(Category category) {
		_entityDao.update(category);
		
		_logger.Log();
	}

}
