package javaCampHomework3.entities;

public class Instructor {
	
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _biography;
	private String _imageUrl;
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}
	
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		this._lastName = lastName;
	}
	
	public String getBiography() {
		return _biography;
	}
	public void setBiography(String biography) {
		this._biography = biography;
	}
	
	public String getImageUrl() {
		return _imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this._imageUrl = imageUrl;
	}
}
