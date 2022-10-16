package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
import javaCampHomework3.dataAccess.IEntityDao;
import javaCampHomework3.dataAccess.IInstructorDao;
//import javaCampHomework3.dataAccess.IInstructorDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Instructor;

public class InstructorManager implements IInstructorService{
	
	private IInstructorDao _instructorDao;
	private ILogger _logger;
	
	public InstructorManager(IInstructorDao instructorDao, ILogger logger) {
		_logger = logger;
		_instructorDao = instructorDao;
	}

	@Override
	public Instructor getById(int id) {
		_instructorDao.getById(id);
		_logger.Log();
		return null;
	}

	@Override
	public List<Instructor> getAll() {
		_instructorDao.getAll();
		_logger.Log();
		return null;
	}

	@Override
	public void add(Instructor instructor) {
		_instructorDao.add(instructor);
		_logger.Log();
	}

	@Override
	public void update(Instructor instructor) {
		_instructorDao.update(instructor);
		_logger.Log();
	}

	@Override
	public void delete(int id) {
		_instructorDao.delete(id);
		_logger.Log();
	}
}
