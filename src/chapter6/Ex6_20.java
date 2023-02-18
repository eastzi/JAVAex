package chapter6;

public class Ex6_20 {

	//shuffle method
	public static int[] shuffle(int[] arr) {
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random() * arr.length);
			
			//i와 j 값 서로 바꿈. 
			int tmp = arr[i]; 
			arr[i] = arr[j];
			arr[j] = tmp; 
		}
		
		return arr;
	}
	
	public static void main(String[] args) {

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
