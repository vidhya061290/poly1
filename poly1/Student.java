package poly1;

import java.util.ArrayList;

public class Student extends Users {
	double gpa;
	ArrayList<Classroom> classes;
	String startDate;
	
	public Student(String firstName, String lastname,char role, String startDate) {
		super(firstName, lastname, role);
		this.startDate = startDate;
	}
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public ArrayList<Classroom> getClasses() {
		return classes;
	}
	public void setClasses(ArrayList<Classroom> classes) {
		this.classes = classes;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	public void getDashboard() {
		System.out.println("the student gpa is: " + gpa + "  " +" The classes are : " + classes);
	}
	
	

}