package Array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,pos;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Before deleting the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter the position:");
		pos=s.nextInt();
		for(i=pos;i<size;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		System.out.println("After deleting the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
