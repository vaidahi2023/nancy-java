package Basic;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("Enter the number:");
		b=s.nextInt();
		System.out.println("Before swaping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swaping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}