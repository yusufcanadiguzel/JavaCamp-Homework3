package javaCampHomework3.dataAccess;

import java.util.List;

public class NhEntityDao<T> implements IEntityDao<T> {

	@Override
	public T getById(int id) {
		System.out.println("T entity gotten by NHibernate.");
		return null;
	}

	@Override
	public List<T> getAll() {
		System.out.println("T entities gotten by NHibernate.");
		return null;
	}

	@Override
	public void add(Object entity) {
		System.out.println("T entity added by NHibernate.");
	}

	@Override
	public void update(Object entity) {
		System.out.println("T entity updated by NHibernate.");
	}

	@Override
	public void delete(int id) {
		System.out.println("T entity deleted by NHibernate.");
	}

}
