package java_lab;

public class StudentArray {

	public static void main(String[] args) {
		Student4[] student4 = new Student4[3];
		student4[0] = new Student4(1001, "James");
		student4[1] = new Student4(1002, "Tomas");
		student4[2] = new Student4(1003, "Edward");
		
		for(int i = 0; i < student4.length; i++) {
			student4[i].showStudentInfo();
		}
		
		for(Student4 s : student4) {
			s.showStudentInfo();
		}
	}

}
