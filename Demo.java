import java.util.Scanner;
class Demo
{
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int rem;
	int p=1;
	int sum=0;
		while(num!=0)
		{
		rem=num%10;
		num=num/10;
			if(rem%2==0)
			{
			
				sum=sum+rem;
			
			}
			else
			{
				p=p*rem;
			}
		}
			int sumAll=sum+p;
			System.out.println(sum);
			System.out.println(p);
			System.out.println(sumAll);
}}