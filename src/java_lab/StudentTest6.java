package java_lab;

public class StudentTest6 {

	public static void main(String[] args) {
		
		Student3 studentKim = new Student3();
		System.out.println("학번: " + studentKim.studentID + ", 카드번호 : " + studentKim.cardNumber);
		studentKim.setStudentName("김땡땡");
		studentKim.setSerialNum(1020);
		System.out.println(studentKim.getStudentName());
		System.out.println(studentKim.getSerialNum());
	}

}
