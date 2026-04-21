package Array;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,pos,ele;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Before instering the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the elements u want to insert:");
		ele=s.nextInt();
		System.out.println("enter the position:");
		pos=s.nextInt();
		for(i=size;i>pos;i--)
		{
			a[i]=a[i-1];
		}
		size++;
		a[pos]=ele;
		System.out.println("After instering the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
