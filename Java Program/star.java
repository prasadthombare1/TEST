
class Star
{
public static void main(String args[])
{
   for(int i=1;i<=5;i++)
	{
	for(int j=1,N1=5,N2=6;j<=10;j++,N1--,N1++)
		{
                        if(j>=N1 && j<=N2 && i>=2 )
			{
			System.out.print(" ");
			}
			else
			{
			System.out.print("*");
			}
		}
	System.out.println();
	}
}

}