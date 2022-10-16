package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public Course getById(int id) {
		System.out.println("Course gotten by JDBC. Where Id: )" + id) ;
		return null;
	}

	@Override
	public List<Course> getAll() {
		System.out.println("Courses gotten by JDBC.");
		return null;
	}

	@Override
	public void add(Course course) {
		System.out.println("Course added by JDBC.");
	}

	@Override
	public void delete(int id) {
		System.out.println("Course deleted by JDBC.");
	}

	@Override
	public void update(Course course) {
		System.out.println("Course updated by JDBC");
	}

}
