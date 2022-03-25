package q3;

import java.util.Arrays;

public class ArrayOp {
	public static int[] copyOf(int[] array) {
	
		int arr[]=new int[array.length];
		for(int i=0;i<array.length;i++)
			arr[i]=array[i];
		return arr;
	}
	
}
public class AssignQ3{

	public static void main(String[] args) {

		int arr[]= {4,5,6,7,67};
		
		int copyOfArr[]=ArrayOp.copyOf(arr);
		System.out.println(Arrays.toString(copyOfArr));
	}
}







