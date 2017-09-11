package pyramid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class HighestNumberOfZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		int arr[]=new int[10];
		ArrayList<Integer> al=new ArrayList<Integer>();
		int i = 0;
		int ar[]=new int[10];
		while(x>0)
		{
			if(x%2==0)
			{
				al.add(0);
				x=x/2;
			}
			else
			{
				al.add(1);
				x=x/2;
			}
		}
		Collections.reverse(al);
		for(int a:al)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			arr[i]=(int) itr.next();
			i++;
		}
		
		int flag=0;
		int j=i+1;
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(i=0;i<al.size()-1;i++)
		{
			if(j>al.size()-1)
			{break;}
			while(ar[i]==1&&ar[j]==0)
			{
				flag++;
				j++;
			}
			al2.add(flag);
			flag=0;
		}
		for(int a:al2)
		{
			System.out.println(a);
		}
	}
}