package pyramid;

import java.util.ArrayList;
import java.util.Iterator;

public class Hsarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<String>();
		
		al.add("hi");
		al.add("hiya");
		al.add("hicup");
		al.add("hilo");
		al.add("hifi");
		
		System.out.println("number of strig in the array list are  "+al.size());
		
		al.remove(3);
		
		for(String obj:al)
		{
			System.out.println(obj);
		}
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String ele=itr.next();
				System.out.println(ele+"");
				
		}
	}

}
