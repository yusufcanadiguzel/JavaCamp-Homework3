package javaCampHomework3.dataAccess;

import java.util.List;

import javaCampHomework3.entities.Category;

public interface ICategoryDao {
	Category getById(int id);
	List<Category> getAll();
	void add(Category category);
	void update(Category category);
	void delete(int id);
}
