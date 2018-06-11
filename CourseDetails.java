import java.util.List;
import java.util.ArrayList;

public class CourseDetails {

	private long id;

	private String info;

	private Forum forum;

	private List<FileGroup> files;

	private Course course;

	public CourseDetails() {
		this.info = "";
		this.forum = new Forum();
		this.files =  new ArrayList<>();
	}

	public CourseDetails(Course course) {
		this.info = "";
		this.course = course;
		this.forum = new Forum();
		this.files =  new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public List<FileGroup> getFiles() {
		return files;
	}

	public void setFiles(List<FileGroup> files) {
		this.files = files;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
