package WebProject;
import java.util.*;
public class Login {

	
public String username;
public String password;
public boolean isboss = false;
public String id;






public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isIsboss() {
	return isboss;
}
public void setIsboss(boolean isboss) {
	this.isboss = isboss;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public int hashCode() {
	return Objects.hash(id, isboss, password, username);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Login other = (Login) obj;
	return Objects.equals(id, other.id) && isboss == other.isboss && Objects.equals(password, other.password)
			&& Objects.equals(username, other.username);
}
@Override
public String toString() {
	return "Login [username=" + username + ", password=" + password + ", isboss=" + isboss + ", id=" + id + "]";
}
public Login(String username, String password, boolean isboss, String id) {
	super();
	this.username = username;
	this.password = password;
	this.isboss = isboss;
	this.id = id;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}



}