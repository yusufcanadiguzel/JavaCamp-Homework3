package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
//import javaCampHomework3.dataAccess.ICourseDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Course;

public class CourseManager implements ICourseService{
	//private ICourseDao _courseDao;
	
	public CourseManager(/*ICourseDao courseDao*/ ILogger logger) {
		//_courseDao = courseDao;
		_logger = logger;
	}
	
	private JdbcEntityDao<Course> _jdbcEntityDao = new JdbcEntityDao<>();
	private ILogger _logger;

	public Course getById(int id) {
		_jdbcEntityDao.getById(id);
		_logger.Log();
		return null;
	}

	public List<Course> getAll() {
		_jdbcEntityDao.getAll();
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
			_jdbcEntityDao.add(course);
		}
		
		_logger.Log();
	}

	public void delete(int id) {
		_jdbcEntityDao.delete(id);
		
		_logger.Log();
	}

	public void update(Course course) {
		_jdbcEntityDao.update(course);
		
		_logger.Log();
	}
	
	
}
