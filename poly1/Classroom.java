package poly1;

import java.util.ArrayList;

public class Classroom {
	String subject;
	int numberOfStudents;
	ArrayList<Student> students;
	Teacher primaryTeacher;
	String startDate ;
	
	public Classroom(String subject, Teacher primaryTeacher) {
		super();
		this.subject = subject;
		this.primaryTeacher = primaryTeacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Teacher getPrimaryTeacher() {
		return primaryTeacher;
	}

	public void setPrimaryTeacher(Teacher primaryTeacher) {
		this.primaryTeacher = primaryTeacher;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Classroom [subject=" + subject + "]";
	}
	
 public void printEachStudent(ArrayList<Student>students) {
	for(Student arr : students){
		System.out.println(arr);
	}
 }
	

}