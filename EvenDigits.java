class EvenDigits
{

	public static void main(String[] args)
	{
		int[] arr={12,134,1764,3,18,9,-1245,1000};
		int nums=findNumbersOfEvenDigits(arr);
		System.out.println(nums);

	}


	static int findNumbersOfEvenDigits(int[] arr)
	{
		int count=0;
		for(int num:arr)
		{
			if(even(num))
			{
				count++;
			}
		}
		return count;
	}


	static boolean even(int num)
	{
		int noOfDigits=digits(num);

		if(noOfDigits%2==0)
		{
			return true;
		}
		return false;
	}


	static int digits(int num)
	{
		if(num<0)
		{
			num=num*-1;
		}
		
		if(num==0)
		{
			return 1;
		}

		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}







}