package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Instructor;

public class NhInstructorDao implements IInstructorDao {

	@Override
	public Instructor getById(int id) {
		System.out.println("Instructor gotten by NHibernate. Id: " + id);
		return null;
	}

	@Override
	public List<Instructor> getAll() {
		System.out.println("Instructors gotten by NHibernate.");
		return null;
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added by NHibernate.");
	}

	@Override
	public void delete(int id) {
		System.out.println("Instructor deleted by NHibernate.");
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor updated by NHibernate.");
	}

}
