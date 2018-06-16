import java.util.Set;
import java.util.HashSet;

public class Course {

	public interface SimpleCourseList {}

	private long id;

	private String title;

	private String image;


	public Course() {}

	public Course(String title, String image) {
		this.title = title;
		this.image = image;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	//To make 'user.getCourse().remove(course)' possible
	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Course))return false;
	    Course otherCourse = (Course)other;
	    return (otherCourse.id == this.id);
	}

	@Override
	public String toString() {
		return "Course[title: \"" + this.title + "]";
	}
}
