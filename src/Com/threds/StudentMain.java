package Com.threds;

import java.util.Scanner;

public class StudentMain {
	public static void getUserInput() {
		System.out.println("enter the student id  ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		System.out.println("Enter the student name  ");
		String name = scan.next();
		System.out.println("enter the student city  ");
		String city = scan.next();
		
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentName(name);
		student.setStudentCity(city);
		
		System.out.println("student id is  "+student.getStudentId());
		System.out.println("enter the student name  "+student.getStudentName());
		System.out.println("enter the student city  "+student.getStudentCity());

	}
	public static void main(String args []) {
		getUserInput();
	}
		
	
		
	

}
