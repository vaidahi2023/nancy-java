package Array;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int b[]=new int[10];
		int size,i,j,k=0;
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
			d=false;
			for(j=0;j<k;j++)
			{
				if(a[i]==a[j])
				{
					d=true;
					break;
				}
			}
			if(!d)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(i=0;i<k;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
