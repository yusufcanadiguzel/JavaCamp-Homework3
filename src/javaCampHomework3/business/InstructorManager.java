package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.dataAccess.IInstructorDao;
import javaCampHomework3.entities.Instructor;

public class InstructorManager implements IInstructorService{
	
	private IInstructorDao _instructorDao;
	
	public InstructorManager(IInstructorDao instructorDao) {
		_instructorDao = instructorDao;
	}

	@Override
	public Instructor getById(int id) {
		_instructorDao.getById(id);
		return null;
	}

	@Override
	public List<Instructor> getAll() {
		_instructorDao.getAll();
		return null;
	}

	@Override
	public void add(Instructor instructor) {
		_instructorDao.add(instructor);
	}

	@Override
	public void update(Instructor instructor) {
		_instructorDao.update(instructor);
	}

	@Override
	public void delete(int id) {
		_instructorDao.delete(id);
	}
}
