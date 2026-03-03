package Basic;

import java.util.Scanner;

//&& --and,||-- OR ,!--NOT
public class Logicaloperators {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("Enter the number:");
		b=s.nextInt();
		System.out.println("a>b && a==10 ="+((a>b)&& (a==10)));
		System.out.println("a>b || a==10 ="+((a>b)|| (a==10)));
		System.out.println("!a>b"+(!(a>b)));
	}
}
