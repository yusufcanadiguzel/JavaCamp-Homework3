package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.entities.Instructor;

public interface IInstructorService {
	Instructor getById(int id);
	List<Instructor> getAll();
	void add(Instructor instructor);
	void update(Instructor instructor);
	void delete(int id);
}
