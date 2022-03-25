package day1;

import java.util.Scanner;

public class Day1_pascaltriangle {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n,x,y,a[][];
		System.out.print("Enter number of steps:");
		n=scanner.nextInt();
		a=new int[n][n];
		for(x=0;x<n;x++) {
			for(y=0;y<=x;y++) {
				int c=y;
				a[x][y]=++c;	
			}
		}
		for(x=0;x<n;x++) {
			for(y=0;y<=x;y++) {
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}

	}
}
