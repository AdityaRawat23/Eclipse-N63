package pyramid;

public class MonkeyWallJumpCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of walls");

		int arr[]= {10,20,35,55};
		int wall=arr.length;
		int arrsy[]=new int[wall];
		int jump=4;
		int slide=1;
		int start=0;
		int flag=0;
		for(int i=0;i<wall;i++)
		{

			while(start<arr[i])
			{
				start=start+jump;
				if(start<arr[i]+1)
				{
					flag=flag+1;
					start=start-slide;
				}
				//System.out.println(start+"  "+i+" value");
			}
			arrsy[i]=flag+1;
			flag=0;
			start=0;
		}
		System.out.println("\nthe answer is\n");
		for(int a:arrsy)
		{
			System.out.print(a+" ");
		}
		/*int max=arrsy[0];
		for(int k=0;k<wall;k++)
		{

		}
		 */
	}

}
