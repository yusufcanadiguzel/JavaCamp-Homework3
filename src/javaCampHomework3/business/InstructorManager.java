package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.core.logging.ILogger;
//import javaCampHomework3.dataAccess.IInstructorDao;
import javaCampHomework3.dataAccess.JdbcEntityDao;
import javaCampHomework3.entities.Instructor;

public class InstructorManager implements IInstructorService{
	
	//private IInstructorDao _instructorDao;
	private JdbcEntityDao<Instructor> _jdbcEntityDao = new JdbcEntityDao<>();
	private ILogger _logger;
	
	public InstructorManager(/*IInstructorDao instructorDao*/ ILogger logger) {
		//_instructorDao = instructorDao;
		_logger = logger;
	}

	@Override
	public Instructor getById(int id) {
		_jdbcEntityDao.getById(id);
		_logger.Log();
		return null;
	}

	@Override
	public List<Instructor> getAll() {
		_jdbcEntityDao.getAll();
		_logger.Log();
		return null;
	}

	@Override
	public void add(Instructor instructor) {
		_jdbcEntityDao.add(instructor);
		_logger.Log();
	}

	@Override
	public void update(Instructor instructor) {
		_jdbcEntityDao.update(instructor);
		_logger.Log();
	}

	@Override
	public void delete(int id) {
		_jdbcEntityDao.delete(id);
		_logger.Log();
	}
}
