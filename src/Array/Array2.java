package Array;

import java.util.Scanner;

public class Array2 {

public static void main(String[] args) {
		
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[20];
		int size,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			b[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			c[i]=a[i];
		}
		for(i=0;i<size;i++)
		{
			c[size+i]=b[i];
		}
		System.out.println("Elements of a");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Elements of b");
		for(i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Elements of c");
		for(i=0;i<size*2;i++)
		{
			System.out.println(c[i]);
		}
	}
}
