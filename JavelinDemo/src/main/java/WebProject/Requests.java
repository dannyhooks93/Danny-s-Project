package WebProject;

import java.util.Objects;

public class Requests {
String empid;
String description;
int price;
boolean approved = false;



public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isApproved() {
	return approved;
}
public void setApproved(boolean approved) {
	this.approved = approved;
}
@Override
public int hashCode() {
	return Objects.hash(approved, description, empid, price);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Requests other = (Requests) obj;
	return approved == other.approved && Objects.equals(description, other.description)
			&& Objects.equals(empid, other.empid) && price == other.price;
}
@Override
public String toString() {
	return "Requests [empid=" + empid + ", description=" + description + ", price=" + price + ", approved=" + approved
			+ "]";
}
public Requests(String empid, String description, int price, boolean approved) {
	super();
	this.empid = empid;
	this.description = description;
	this.price = price;
	this.approved = approved;
}
public Requests() {
	super();
	// TODO Auto-generated constructor stub
}



}