import java.util.List;
import java.util.ArrayList;

public class Forum {

	private long id;

	private boolean activated;

	public Forum(){}

	public Forum(boolean activated) {
		this.activated = activated;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	@Override
	public String toString() {
		int numberOfComments = 0;
		return "Forum[activated: \"" + this.activated + "\", #comments: \"" + numberOfComments + "\"]";
	}

}
