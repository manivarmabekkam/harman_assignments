package day1;

import java.util.Scanner;

public class Day1_fibonacci {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n =20;
		int a=1;
		int b=1;
		int avg=0;
		int count=0;
		System.out.println("The first 20 Fibonacci numbers are:");
		int total=fibonacci(n, a, b, avg, count);
		System.out.println("\n");
		double average =total/(n);
		System.out.print("The average is:"+average);
			}

		private static int fibonacci(int n, int a, int b, int avg, int count) {
				int c;
				while(count<n) {
					c=a+b;
					avg+=a;
					System.out.print(a+" ");
					a=b;
					b=c;
					count+=1;
				}
				return avg;
}
}
