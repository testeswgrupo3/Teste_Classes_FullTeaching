import java.util.List;
import java.util.ArrayList;

public class FileGroup {

	private long id;

	private String title;

	private List<FileGroup> fileGroups;

	private FileGroup fileGroupParent;

	public FileGroup() {}

	public FileGroup(String title) {
		this.title = title;
		this.fileGroups = new ArrayList<>();
		this.fileGroupParent = null;
	}

	public FileGroup(String title, FileGroup fileGroupParent) {
		this.title = title;
		this.fileGroups = new ArrayList<>();
		this.fileGroupParent = fileGroupParent;
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

	public List<FileGroup> getFileGroups() {
		return fileGroups;
	}

	public void setFileGroups(List<FileGroup> fileGroups) {
		this.fileGroups = fileGroups;
	}

	public FileGroup getFileGroupParent() {
		return fileGroupParent;
	}

	public void setFileGroupParent(FileGroup fileGroupParent) {
		this.fileGroupParent = fileGroupParent;
	}

	//To make 'courseDetails.getFiles().remove(file)' possible
	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof FileGroup))return false;
	    FileGroup otherFileGroup = (FileGroup)other;
	    return (otherFileGroup.id == this.id);
	}


	@Override
	public String toString() {
		String parent = this.fileGroupParent != null ? this.fileGroupParent.getTitle() : "null";
		return "FileGroup[title: \"" + this.title + "\", parentFileGroup: \", #childrenFileGroups: " + this.fileGroups.size() + "]";
	}

}
