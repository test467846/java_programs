class MissingNumberInArray
{
	public static void main(String[] args)
	{
		int[] a={1,4,2,5,7,6,8};
		int n=8;
		int missingNumber=sumOfNumbers(n)-sumOfArrayElements(a);
		System.out.println("The Missing element is: "+ missingNumber);
		
	}
	
	//Method to calculate sum of n numbers
	static int sumOfNumbers(int n)
	{
		int sum=sum=(n*(n+1))/2;
		return sum;
	}

	//Method to calculate the sum of array's elements
	static int sumOfArrayElements(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}