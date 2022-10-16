package javaCampHomework3;


import javaCampHomework3.business.CategoryManager;
import javaCampHomework3.business.CourseManager;
import javaCampHomework3.business.InstructorManager;
import javaCampHomework3.dataAccess.JdbcCategoryDao;
import javaCampHomework3.dataAccess.JdbcInstructorDao;
import javaCampHomework3.dataAccess.NhCourseDao;
import javaCampHomework3.entities.Category;
import javaCampHomework3.entities.Course;
import javaCampHomework3.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		
		//Course Tests
		
		/*
		 * CourseManager courseManager = new CourseManager(new NhCourseDao());
		 * 
		 * Course course = new Course(); course.setId(1); course.setInstructorId(1);
		 * course.setName("C#"); course.setDescription("Mükkemmel bir Java kursu.");
		 * course.setCompletePercent(100); course.setPrice(0);
		 * 
		 * courseManager.add(course); courseManager.delete(1); courseManager.getAll();
		 * courseManager.getById(1); courseManager.update(course);
		 */
		 
		
		//Category Tests
		/*
		 * CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao());
		 * 
		 * Category category = new Category(); category.setId(1);
		 * category.setName("Programlama");
		 * 
		 * categoryManager.getById(1); categoryManager.getAll();
		 * categoryManager.add(category); categoryManager.delete(1);
		 * categoryManager.update(category);
		 */
		
		//Instructor Test
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Yusufcan");
		instructor.setLastName("Adıgüzel");
		instructor.setBiography("İsmim Yusufcan Adıgüzel. Merhaba!");
		instructor.setImageUrl("image.jpeg");
		
		instructorManager.add(instructor);
		instructorManager.delete(1);
		instructorManager.getAll();
		instructorManager.getById(1);
		instructorManager.update(instructor);
	}

}
