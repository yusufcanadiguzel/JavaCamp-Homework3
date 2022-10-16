package javaCampHomework3.entities;

public class Course {
	
	private int _id;
	private int _instructorId;
	private String _name;
	private String _description;
	private int _completePercent;
	private double _price; 
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setDescription(String description) {
		_description = description;
	}
	
	public String getDescription() {
		return _description;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public int getInstructorId() {
		return _instructorId;
	}

	public void setInstructorId(int instructorId) {
		this._instructorId = instructorId;
	}

	public int getCompletePercent() {
		return _completePercent;
	}

	public void setCompletePercent(int completePercent) {
		this._completePercent = completePercent;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}
}
