package poly1;

public class Admin extends Users{
	String title;
	double salary;
	String startDate;
	
	public Admin(String firstName, String lastname, char role, String title, double salary, String startDate) {
		super(firstName, lastname, role);
		this.title = title;
		this.salary = salary;
		this.startDate = startDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Admin [title=" + title + ", salary=" + salary + ", startDate=" + startDate + "]";
	}
	
	@Override
	public void getDashboard() {
		System.out.println("displaying dashboard for administrator");
		
	}
	
	
	
	
	
	

}
