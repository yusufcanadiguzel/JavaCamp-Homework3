package javaCampHomework3.dataAccess;

import java.util.List;

public interface IEntityDao<T> {
	T getById(int id);
	List<T> getAll();
	void add(T entity);
	void update(T entity);
	void delete(int id);
}
