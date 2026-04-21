package Array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("maximum number is "+max);
		
	}
}
