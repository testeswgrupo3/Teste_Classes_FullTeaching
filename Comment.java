
import java.util.List;
import java.util.ArrayList;

public class Comment {

	public interface CommentNoParent {}

	private long id;

	private String videourl;
	private boolean audioonly;
	private String message;

	private long date;

	private List<Comment> replies;

	private Comment commentParent;

	private User user;

	public Comment() {}

	public Comment(String message, long date, User user) {
		this.message = message;
		this.date = date;
		this.user = user;
		this.replies = new ArrayList<Comment>();
		this.commentParent = null;
	}

	public Comment(String message, long date, User user, Comment commentParent) {
		this.message = message;
		this.date = date;
		this.user = user;
		this.replies = new ArrayList<Comment>();
		this.commentParent = commentParent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVideourl() {
		return videourl;
	}

	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}

	public boolean getAudioonly() {
		return audioonly;
	}

	public void setAudioonly(boolean audioonly) {
		this.audioonly = audioonly;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public List<Comment> getReplies() {
		return replies;
	}

	public void setReplies(List<Comment> replies) {
		this.replies = replies;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(Comment commentParent) {
		this.commentParent = commentParent;
	}

	@Override
	public String toString() {
		String parent = this.commentParent != null ? commentParent.message : "null";
		String user = this.user != null ? this.user.getNickName() : "";
		int nReplies = this.replies != null ? this.replies.size() : 0;
		return "Comment[message: \"" + this.message + "\", author: \"" + user + "\", parent: \"" + parent + "\", #replies: " + nReplies + "date: \"" + this.date + "\"]";
	}

}
