package day1;

import java.util.Scanner;

public class Day1_datetime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the date:");
		int date=s.nextInt();
		System.out.println("enter the month");
		int month=s.nextInt();
		System.out.println("enter the year");
		int year=s.nextInt();
		boolean t=checkleap(year);
		boolean m=checkeven(month);
	    if((month>=1)&&(month<=7)) {
	    	if(m==false) {
	    		if(date==31) {
	    			System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    			month+=1;
	    			date=1;
	    			System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    		     }
	    		else {
	    			System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    			date+=1;
	    			System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    		     }
	    	    }
	    	else {
	    		if(date==30) { 
				 System.out.println("currentdate:"+date+"/"+month+"/"+year);
				 month+=1;
				 date=1;
				 System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    		}
	    		else if((date==28)&&(month==2)) {
	    			if(t==false) {
	    				System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    				month+=1;
	    				date=1;
	    				System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    			}
	    			else {
	    				System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    				date=date+1;
	    				System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    				}
	    		}
	    		else if((date==29)&&(month==2)){
	    			System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    			date=1;
	    			month=month+1;
	    			System.out.println("nextdate:"+date+"/"+month+"/"+year);	
	    		}
	    		else {
	    			System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    			date+=1;
	    			System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    		}
	    	}
	    	
	    	
	    }
	    else {
	    	if(m==false) {
	    		if(date==30) {
	    		System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    		date=1;
	    		month+=1;
	    		System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    		}
	    		else {
	    			System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    			date+=1;
	    			System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    		}
	    	}
	    	else {
	    		if(month!=12) {
	    			if(date==31) {
	    			System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    			date=1;
	    			month=month+1;
	    			System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    			}
	    			else {
	    				System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    				date+=1;
	    				System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    				
	    			}
	    			
	    		}
	    		else {
	    			if(date==31) {
	    				System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    				date=1;
	    				month=1;
	    				year=year+1;
	    				System.out.println("nextdate:"+date+"/"+month+"/"+year);
	    			}
	    			else {
	    				System.out.println("currentdate:"+date+"/"+month+"/"+year);
	    				date+=1;
	    				System.out.println("nexttdate:"+date+"/"+month+"/"+year);
	    			}
	    		}
	    	}

}
}

private static boolean checkeven(int month) {
	boolean eve=false;
	if(month%2==0) {
		eve=true;
	}
	return eve;
}

private static boolean checkleap(int year) {
	boolean leap=false;
	if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
		leap=true;
	}
	else {
		leap=false;
	}
	return leap;
}
}
