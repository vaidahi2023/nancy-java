package Basic;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		int a;
		float f;
		double d;
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
	}
}
