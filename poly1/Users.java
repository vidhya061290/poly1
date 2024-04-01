package poly1;

public class Users {
	String firstName;
	String lastName;
	char role;
	
	public Users(String firstName , String lastname , char role) {
		this.firstName = firstName; 
		this.lastName = lastname;
		this.role = role;
	}
	
	public String getFirstname() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getRole() {
		return role;
	}
	public void setRole(char role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + "]";
	}
	
	public void getDashboard() {
		System.out.println("Displaying dashboard for user");
	}
	
}
