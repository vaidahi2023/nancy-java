package Array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,j,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("before sorting the elements");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("after sorting the elements");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
