package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
import javaCampHomework3.dataAccess.IEntityDao;
//import javaCampHomework3.dataAccess.IInstructorDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Instructor;

public class InstructorManager implements IInstructorService{
	
	private IEntityDao<Instructor> _entityDao;
	private ILogger _logger;
	
	public InstructorManager(IEntityDao entityDao, ILogger logger) {
		_logger = logger;
		_entityDao = entityDao;
	}

	@Override
	public Instructor getById(int id) {
		_entityDao.getById(id);
		_logger.Log();
		return null;
	}

	@Override
	public List<Instructor> getAll() {
		_entityDao.getAll();
		_logger.Log();
		return null;
	}

	@Override
	public void add(Instructor instructor) {
		_entityDao.add(instructor);
		_logger.Log();
	}

	@Override
	public void update(Instructor instructor) {
		_entityDao.update(instructor);
		_logger.Log();
	}

	@Override
	public void delete(int id) {
		_entityDao.delete(id);
		_logger.Log();
	}
}
