import java.util.List;
import java.util.ArrayList;

public class Entry {

	private long id;

	private String title;

	private long date;

	public Entry() {}

	public Entry(String title, long date) {
		this.title = title;
		this.date = date;
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

	@Override
	public String toString() {
		return "Entry[title: \"" + this.title + "\", date: " + this.date + "]";
	}

}
