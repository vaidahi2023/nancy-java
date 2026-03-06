package Basic;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=s.nextInt();
		if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0))
		{
			System.out.println("it is leap year");
		}
		else 
		{
			System.out.println("it is not leap year");
		}
		
	}
}