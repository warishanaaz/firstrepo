package test;

public class Test1 {
	
	public static void main (String[] args)
	{
		int finalresult = summation(4);
		System.out.print(finalresult);
		
	}
	
	
	public static int summation(int n)
	{
		int result= (n*(n+1))/2;
		
		return(result);
		
	}

}
