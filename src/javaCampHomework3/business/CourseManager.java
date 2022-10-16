package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.dataAccess.ICourseDao;
import javaCampHomework3.entities.Course;

public class CourseManager implements ICourseService{
	private ICourseDao _courseDao;
	
	public CourseManager(ICourseDao courseDao) {
		_courseDao = courseDao;
	}

	public Course getById(int id) {
		_courseDao.getById(id);
		return null;
	}

	public List<Course> getAll() {
		_courseDao.getAll();
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
	}

	public void delete(int id) {
		_courseDao.delete(id);
	}

	public void update(Course course) {
		_courseDao.update(course);
	}
	
	
}
