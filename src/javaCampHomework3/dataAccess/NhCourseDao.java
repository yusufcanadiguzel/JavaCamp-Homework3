package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Course;

public class NhCourseDao implements ICourseDao{

	@Override
	public Course getById(int id) {
		System.out.println("Course gotten by NHibernate. Id: " + id);
		return null;
	}

	@Override
	public List<Course> getAll() {
		System.out.println("Courses gotten by NHibernate.");
		return null;
	}

	@Override
	public void add(Course course) {
		System.out.println("Course added by NHibernate.");
	}

	@Override
	public void delete(int id) {
		System.out.println("Course deleted by NHibernate.");
	}

	@Override
	public void update(Course course) {
		System.out.println("Course updated by NHibernate.");
	}
	
}
