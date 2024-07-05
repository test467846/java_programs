class MaxLengthOfString
{
	public static void main(String[] args)
	{
		String[] str={"yasir","ashu","ram"};
		int max=searchMaxLength(str);
		System.out.println("The maximum length of string is: "+max);

	}
	

	static int searchMaxLength(String[] str)
	{
		int max=str[0].length();
		int length= str.length;
		System.out.println("Length of given String array is: "+length);
		for(int i=1;i<length;i++)
		{
			if(str[i].length()>max)
			{
				max= str[i].length();
			}
		}
		return max;
	}

}