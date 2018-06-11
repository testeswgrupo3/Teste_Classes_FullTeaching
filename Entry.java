import java.util.List;
import java.util.ArrayList;

public class Entry {

	private long id;

	private String title;

	private long date;

	private List<Comment> comments;

	private User user;

	public Entry() {}

	public Entry(String title, long date, User user) {
		this.title = title;
		this.date = date;
		this.user = user;
		this.comments = new ArrayList<>();
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

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Entry[title: \"" + this.title + "\", author: \"" + user.getNickName() + "\", date: " + this.date + ", #comments: " + this.comments.size() + "]";
	}

}
