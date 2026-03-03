package Basic;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("Enter the number:");
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum="+sum);
	}
}
