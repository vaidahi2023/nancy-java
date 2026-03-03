package Basic;

import java.util.Scanner;

// +,-,*,/,%
public class Arithimetic {

	public static void main(String[] args) {
		
		int a,b,sum=0,sub=0,mul=0,div=0,mod=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("Enter the number:");
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum="+sum);
		sub=a-b;
		System.out.println("sub="+sub);
		mul=a*b;
		System.out.println("mul="+mul);
		div=a/b;
		System.out.println("div="+div);
		mod=a%b;
		System.out.println("mod="+mod);
		
	}
}
