import java.util.Arrays;
class LeadersInArray
{
	public static void main(String[] args)
	{
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
 
       		findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
 
        	findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
 
        	findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
	}
	static void findTheLeaders(int[] arr)
	{
		System.out.println("The leaders in "+Arrays.toString(arr)+" are :");
 
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]);
			}
		}
	}
}