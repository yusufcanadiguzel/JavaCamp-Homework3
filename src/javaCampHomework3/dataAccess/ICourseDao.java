package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Course;

public interface ICourseDao extends IEntityDao<Course>{
	List<Course> getByInstructorId(int instructorId);
}
