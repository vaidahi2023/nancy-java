package Basic;

import java.util.Scanner;

//>,<,==,<=,>=,!=
public class Comparsionoperator {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("Enter the number:");
		b=s.nextInt();
		System.out.println("a>b="+(a>b));
		System.out.println("a<b="+(a<b));
		System.out.println("a<=b="+(a<=b));
		System.out.println("a>=b="+(a>=b));
		System.out.println("a==b="+(a==b));
		System.out.println("a!=b="+(a!=b));
	}
}