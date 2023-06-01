package java_lab;

public class Student4 {
	int studentID;
	String name;

	public Student4(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
}
