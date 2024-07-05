import java.util.Scanner;
class EvenOddCheck
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=s.nextInt();

		if(num%2==0)
		{
			System.out.println(num+" is Even Number");
		}
		else
		{
			System.out.println(num+" is Odd Number");
		}


	}

}