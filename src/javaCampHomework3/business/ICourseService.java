package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.entities.Course;

public interface ICourseService {
	
	Course getById(int id);
	List<Course> getAll();
	void add(Course course);
	void delete(int id);
	void update(Course course);
}
