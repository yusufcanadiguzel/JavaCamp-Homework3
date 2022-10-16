package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
import javaCampHomework3.dataAccess.ICourseDao;
import javaCampHomework3.dataAccess.IEntityDao;
//import javaCampHomework3.dataAccess.ICourseDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Course;

public class CourseManager implements ICourseService{
	
	private ICourseDao _courseDao;
	private ILogger _logger;
	
	public CourseManager(ICourseDao courseDao, ILogger logger) {
		_logger = logger;
		_courseDao = courseDao;
	}
	
	public Course getById(int id) {
		_courseDao.getById(id);
		_logger.Log();
		return null;
	}

	public List<Course> getAll() {
		_courseDao.getAll();
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
			_courseDao.add(course);
		}
		
		_logger.Log();
	}

	public void delete(int id) {
		_courseDao.delete(id);
		
		_logger.Log();
	}

	public void update(Course course) {
		_courseDao.update(course);
		
		_logger.Log();
	}

	
	public List<Course> getByInstructorId(int instructorId) {
		_courseDao.getByInstructorId(instructorId);
		return null;
	}
	
	
}
