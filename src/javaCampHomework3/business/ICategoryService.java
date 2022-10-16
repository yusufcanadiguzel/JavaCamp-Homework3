package javaCampHomework3.business;

import java.util.List;

import javaCampHomework3.entities.Category;

public interface ICategoryService {
	Category getById(int id);
	List<Category> getAll();
	void add(Category category);
	void update(Category category);
	void delete(int id);
}
