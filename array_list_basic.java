package pyramid;
import java .util.*;
public class array_list_basic {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("adi");
		al.add("tya");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String obj:al)
		{
			System.out.println(obj);
		}
	}

}
