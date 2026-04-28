package Array;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,ele;
		boolean find=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the element:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the elements:");
		ele=s.nextInt();
		for(i=0;i<size;i++)
		{
			if(a[i]==ele)
			{
				find=true;
			}
		}
		if(find)
		{
			System.out.println("element is present");
		}
		else 
		{
			System.out.println("element is not present");
		}
	}
}
