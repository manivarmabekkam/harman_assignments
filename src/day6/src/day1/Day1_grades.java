package day1;

import java.util.Scanner;

public class Day1_grades {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int number=sc.nextInt();
		int count=1;
		int total=0;
		while(count<=number) {
			System.out.print("Enter the grade for student"+count+":");
			int a=sc.nextInt();
			if((a<=100)&&(a>=0)) {
				total+=a;
			}
			else {
				System.out.println("Invalid grade, try again...");
				continue;
			}
			count+=1;
		}
		double average=total/number;
		System.out.println("The average is:"+average);
		}
}
