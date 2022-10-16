package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Course;

public interface ICourseDao {
	
	Course getById(int id);
	List<Course> getAll();
	void add(Course course);
	void delete(int id);
	void update(Course course);
}
