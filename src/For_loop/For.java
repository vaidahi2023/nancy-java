package For_loop;

import java.util.Scanner;

/*
 * types of loop
 * 
 * 1.entry control loop
 * 		--for,while
 * 2.exit control loop
 * 		--do while 
 */

public class For {

	public static void main(String[] args) {
		
		int n,rem,rev=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		temp=n;
		for(;n>0;)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse number:"+rev);
	}
}