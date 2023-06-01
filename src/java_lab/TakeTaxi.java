package java_lab;

public class TakeTaxi {

	public static void main(String[] args) {
		
		Student student = new Student("Edward", 10000);
		Student student2 = new Student("James", 20000);
		
		Taxi taxi = new Taxi();
		student.takeTaxi(taxi);
		student.showInfo();
		
		student2.takeTaxi(taxi);
		student2.showInfo();
		
		taxi.showInfo();
	}

}
