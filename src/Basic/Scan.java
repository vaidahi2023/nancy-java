package Basic;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		int a;
		float f;
		double d;
		boolean b;
		char c='g';
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("a="+a);
		System.out.println("Enter the number:");
		f=s.nextFloat();
		System.out.println("f="+f);
		System.out.println("Enter the number:");
		d=s.nextDouble();
		System.out.println("d="+d);
		System.out.println("Enter the number:");
		b=s.nextBoolean();
		System.out.println("b="+b);
		System.out.println("Enter the string:");
		s1=s.next();
		System.out.println("s1="+s1);
		s.nextLine();
		System.out.println("Enter the string:");
		s1=s.nextLine();
		System.out.println("s1="+s1);
		
	}
}
