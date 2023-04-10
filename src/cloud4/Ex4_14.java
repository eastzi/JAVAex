package cloud4;

public class Ex4_14 {

	public static void main(String[] args) {
		/*
		 * 이번 한 주, 직원들의 요일별 근무 시간이 아래에 정리되어있다.
		 *	#	   일  월  화  수  목  금  토
		 *	직원0	2	4	3	4	5	8	8
		 * 	직원1	7	3	4	3	3	4	4
		 *	직원2	3	3	4	3	3	2	2
		 *	직원3	9	3	4	7	3	4	1
		 *	직원4	3	5	4	3	6	3	8
		 *	직원5	3	4	4	6	3	4	4
		 *	직원6	3	7	4	8	3	8	4
		 *	직원7	6	3	5	9	2	7	9
		 * main() 메소드를 완성하여, 출력 예와 같은 결과를 만드시오.
		 * 직원0 -> 34 시간
		 * 직원1 -> 28 시간
		 * 직원2 -> 20 시간
		 * 직원3 -> 31 시간
		 * 직원4 -> 32 시간
		 * 직원5 -> 28 시간
		 * 직원6 -> 37 시간
		 * 직원7 -> 41 시간
		 */
		
		int[] hours0 = {2, 4, 3, 4, 5, 8, 8};
		int[] hours1 = {7, 3, 4, 3, 3, 4, 4};
		int[] hours2 = {3, 3, 4, 3, 3, 2, 2};
		int[] hours3 = {9, 3, 4, 7, 3, 4, 1};
		int[] hours4 = {3, 5, 4, 3, 6, 3, 8};
		int[] hours5 = {3, 4, 4, 6, 3, 4, 4};
		int[] hours6 = {3, 7, 4, 8, 3, 8, 4};
		int[] hours7 = {6, 3, 5, 9, 2, 7, 9};
		
		Employee em0 = new Employee("직원0", hours0);
		Employee em1 = new Employee("직원1", hours1);
		Employee em2 = new Employee("직원2", hours2);
		Employee em3 = new Employee("직원3", hours3);
		Employee em4 = new Employee("직원4", hours4);
		Employee em5 = new Employee("직원5", hours5);
		Employee em6 = new Employee("직원6", hours6);
		Employee em7 = new Employee("직원7", hours7);
		
		Employee[] employees = {em0, em1, em2, em3, em4, em5, em6, em7};
		
		for(int i = 0; i < employees.length; i++) {
			employees[i].printTotalHours();
		}
	}

}

class Employee {
	String name;
	int[] hours;
	
	public Employee() {
		super();
	}

	public Employee(String name, int[] hours) {
		this.name = name;
		this.hours = hours;
	}
	
	void printTotalHours() {
		System.out.printf("%s -> %d 시간\n", name, totalHours());
	}
	
	int totalHours() {
		int sum = 0;
		for(int i = 0; i < hours.length; i++) {
			sum += hours[i];
		}		
		return sum;
	}
}
