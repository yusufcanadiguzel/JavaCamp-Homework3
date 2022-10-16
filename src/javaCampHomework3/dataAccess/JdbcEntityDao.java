package javaCampHomework3.dataAccess;

import java.util.List;

public class JdbcEntityDao<T> implements IEntityDao<T> {

	@Override
	public T getById(int id) {
		System.out.println("T entity gotten by Jdbc.");
		return null;
	}

	@Override
	public List<T> getAll() {
		System.out.println("T's gotten by Jdbc.");
		return null;
	}

	@Override
	public void add(T entity) {
		System.out.println("T entity added by Jdbc.");
	}

	@Override
	public void update(T entity) {
		System.out.println("T entity updated by Jdbc.");
	}

	@Override
	public void delete(int id) {
		System.out.println("T entity deleted by Jdbc.");
	}

	

}
