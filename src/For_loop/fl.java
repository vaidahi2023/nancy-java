package For_loop;

import java.util.Scanner;

public class fl {

public static void main(String[] args) {
		
		int num,fd=0,ld=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		ld=num%10;
		for(;num>0;)
		{
			fd=num;
			num=num/10;
		}
		System.out.println("last digit is "+ld);
		System.out.println("first digit is "+fd);
	}
}