package Basic;

import java.util.Scanner;

// +=,-=,*=,/=,%=
public class Assignment {

	public static void main(String[] args) {
		
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the number:");
		a=s.nextInt();
		System.out.println("a="+a);
		System.out.println("a="+(a+=1));
		System.out.println("a="+(a-=1));
		System.out.println("a="+(a*=1));
		System.out.println("a="+(a/=2));
		System.out.println("a="+(a%=2));
	}
}
