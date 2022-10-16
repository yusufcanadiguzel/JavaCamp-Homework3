package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Course;

public class NhCourseDao extends NhEntityDao<Course> implements ICourseDao{

	
	public List<Course> getByInstructorId(int instructorId) {
		System.out.println("Courses gotten by NHibernate. Instructor id: " + instructorId);
		return null;
	}
}
