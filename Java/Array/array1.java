package Array;

public class array1 {
	public static void main(String[] args) {
		// new is a keyword 
	int[] arr = new int[4];

	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	
	int sum = 0;
	// for loop to calculate the sum 
	for(int i=0; i<arr.length; i++) {
		sum+=arr[i];
		
		}
	System.out.println(sum);
	// for each loop 
	for(int num : arr) {
		System.out.println(num);
	}
	// for loop to travel through all element of array and print index and value 
	for(int i=0; i<arr.length;i++) {
		System.out.println("index "+i+" Value "+arr[i]);
	}
  }
}
