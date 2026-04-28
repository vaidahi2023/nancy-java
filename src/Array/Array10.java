package Array;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,j,count=0;
		boolean d=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<size;i++)
		{
			count=1;
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+" occurs "+count+" times ");
		}
		
		
	}
}
