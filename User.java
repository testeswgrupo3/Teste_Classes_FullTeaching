import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class User {

	private long id;

	private String name;

	private String passwordHash;

	private List<String> roles;

	private String nickName;

	private String picture;

	private long registrationDate;

	//It is ignored in order to avoid infinite recursiveness
	//This makes necessary another interaction with the database (after login to retrieve the courses of the user)

	public User() {}

	public User(String name, String password, String nickName, String picture, String... roles){
		this.name = name;
		this.passwordHash = password;
		this.roles = new ArrayList<>(Arrays.asList(roles));

		this.nickName = nickName;
		if (picture != null && picture != "") {
			this.picture = picture;
		} else {
			this.picture = "/../assets/images/default_session_image.png";
		}
		this.registrationDate = System.currentTimeMillis();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public long getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(long registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof User))return false;
	    User otherUser = (User)other;
	    return ((otherUser.id == this.id) && (otherUser.name.equals(this.name)));
	}

	@Override
	public int hashCode() {
	    return name.hashCode();
	}

	@Override
	public String toString() {
		return this.nickName;
	}

}
