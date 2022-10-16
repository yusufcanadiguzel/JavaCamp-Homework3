package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
import javaCampHomework3.dataAccess.IEntityDao;
//import javaCampHomework3.dataAccess.ICourseDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Course;

public class CourseManager implements ICourseService{
	
	public CourseManager(IEntityDao entityDao, ILogger logger) {
		_logger = logger;
		_entityDao = entityDao;
	}
	
	private IEntityDao<Course> _entityDao;
	private ILogger _logger;

	public Course getById(int id) {
		_entityDao.getById(id);
		_logger.Log();
		return null;
	}

	public List<Course> getAll() {
		_entityDao.getAll();
		_logger.Log();
		return null;
	}

	public void add(Course course) {
		
		String courseName = "Java";
		
		if (courseName == course.getName()) {
			System.out.println("Course already added to database.");
		}else if(course.getPrice() <= 0) {
			System.out.println("Course price must be greater than 0.");
		}else {
			_entityDao.add(course);
		}
		
		_logger.Log();
	}

	public void delete(int id) {
		_entityDao.delete(id);
		
		_logger.Log();
	}

	public void update(Course course) {
		_entityDao.update(course);
		
		_logger.Log();
	}
	
	
}
