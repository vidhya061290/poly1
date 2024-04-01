package poly1;

import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {
		Student student = new Student(" Vidhya" , "Amarnath" , 'S', "feb28");
		Student student1 = new Student("Akshara" , "Kovoor " ,'s' , "feb28");
		Student student2 = new Student("Harish" , "Kovoor " ,'s' , "feb28");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		
		Teacher teacher = new Teacher("Farhaad" , "xxx" , 'T', 5000.0, "feb28");
		Teacher teacher1 = new Teacher("Amarnath" , "msk" , 'T', 5000.0, "feb28");
		Teacher teacher2 = new Teacher("Shanthi" , "Amarnath" , 'T', 5000.0, "feb28");
		
		Classroom classroom =new Classroom("computer",teacher);
		Classroom classroom1 = new Classroom("science" , teacher2);
		Classroom classroom2 = new Classroom("Maths" , teacher1);
		
		ArrayList<Classroom>classes = new ArrayList<>();
		classes.add(classroom);
		classes.add(classroom1);
		classes.add(classroom2);
    	student.setClasses(classes);
		
		Admin admin =new Admin("Sai" , "Amarnath" , 'A',"Admin",8000.0 ,"feb28");
		
		classroom.setNumberOfStudents(3);
		System.out.println("The number of students in the classroom is : " + classroom.getNumberOfStudents());
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println();
		teacher.setSubject("computer science");
		teacher1.setSubject("Maths");
		teacher2.setSubject("physics");
		System.out.println();
		teacher.setClassroom(classroom);
		teacher.getDashboard();
		System.out.println(teacher);
		System.out.println();
		admin.getDashboard();
		System.out.println(admin);
		System.out.println();
		student.getDashboard();
	    classroom.setStudents(students);
		System.out.println(classroom.getStudents());
	    classroom2.setStartDate("feb28");
		System.out.println("The start date of the class is : " + classroom2.getStartDate());
		System.out.println(classroom1);
		System.out.println();
		
		Users users = new Users("VidhyaLakshmi" , "Amarnath",'U');
		Users users1 = new Users("Akshu" , " kovoor" , 'U');
		Users users2 = new Users("Harish" , " kovoor" , 'U');
		users.getDashboard();
		System.out.println(users);
		System.out.println(users1);
		System.out.println(users2);
		
	}
	
}