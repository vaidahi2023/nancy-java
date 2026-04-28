package Array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]=new int[10];
		int size,i,pos;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Before reverse the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<size;i++)
		{
			b[i]=a[size-i-1];
		}
		System.out.println("after reverse the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
	}
}
