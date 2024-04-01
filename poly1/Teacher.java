package poly1;

public class Teacher extends Users{
	String subject;
	double salary;
	Classroom classroom;
	String startDate;
	public Teacher(String firstName, String lastname, char role, double salary, 
			String startDate) {
		super(firstName, lastname, role);
		this.salary = salary;
		this.startDate = startDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", salary=" + salary + ", startDate=" + startDate + "]";
	}
	
	@Override
	public void getDashboard() {
		System.out.println("Subject: " + subject + " Classroom : " +classroom + " salary : " +salary);
	}
	
	}