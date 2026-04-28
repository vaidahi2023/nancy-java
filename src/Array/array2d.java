package Array;

import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		int i,j;
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter the elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
