package pyramid;

import java.util.Scanner;

public class UniqueTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number of triangles");
		int x=sc1.nextInt();
		int a[][]=new int[x][3];
		int flag=0,count=0;
		int j=0;
		int i=0;
		int k=0;
		for(i=0;i<x;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc1.nextInt();
			}
		}
		for(i=0;i<x;i++)
		{
			
		}
		sc1.close();
	}

}
