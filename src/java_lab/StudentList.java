package java_lab;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<Student5> student = new ArrayList<Student5>();
		
		student.add(new Student5(1001, "James"));
		student.add(new Student5(1002, "Tomas"));
		student.add(new Student5(1003, "Edward"));
		
		for(Student5 s : student) {
			s.showInfo();
		}
	}
}
