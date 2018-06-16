import java.util.List;
import java.util.ArrayList;

public class CourseDetails {

	private long id;

	private String info;

	public CourseDetails() {
		this.info = "";
	}

	public CourseDetails(Course course) {
		this.info = "";
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

}
