import java.util.Set;
import java.util.HashSet;

public class Course {

	public interface SimpleCourseList {}

	private long id;

	private String title;

	private String image;

	private User teacher;

	private CourseDetails courseDetails;

	private Set<Session> sessions;

	private Set<User> attenders;

	public Course() {}

	public Course(String title, String image, User teacher) {
		this.title = title;
		this.image = image;
		this.teacher = teacher;
		this.courseDetails = null;
		this.sessions = new HashSet<>();
		this.attenders = new HashSet<>();
	}

	public Course(String title, String image, User teacher, CourseDetails courseDetails) {
		this.title = title;
		this.image = image;
		this.teacher = teacher;
		this.courseDetails = courseDetails;
		this.sessions = new HashSet<>();
		this.attenders = new HashSet<User>();
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

	public User getTeacher() {
		return teacher;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

	public CourseDetails getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(CourseDetails courseDetails) {
		this.courseDetails = courseDetails;
	}

	public Set<User> getAttenders() {
		return attenders;
	}

	public void setAttenders(Set<User> attenders) {
		this.attenders = attenders;
	}

	public Set<Session> getSessions() {
		return sessions;
	}

	public void setSessions(Set<Session> sessions) {
		this.sessions = sessions;
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
		return "Course[title: \"" + this.title + "\", teacher: \"" + this.teacher.getNickName() + "\", #attenders: " + this.attenders.size() + ", #sessions: " + this.sessions.size() + "]";
	}
}
