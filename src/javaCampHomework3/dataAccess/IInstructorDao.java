package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Instructor;

public interface IInstructorDao {
	Instructor getById(int id);
	List<Instructor> getAll();
	void add(Instructor instructor);
	void delete(int id);
	void update(Instructor instructor);
}
