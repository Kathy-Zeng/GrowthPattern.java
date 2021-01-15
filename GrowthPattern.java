// Kathy Zeng
// 1/12/21
// GrowthPattern.java
// Description: The program calculates a plant's rate.

public class GrowthPattern
{
	private int[] height; // Determines a set of numbers for heights. 
	
	public GrowthPattern()
	{
		height = new int[]{-1, -3, 1, 2, 3, 4, 3, 4, 4, 6, 8, 6, 6, 7, 10};
	}
	
	public static void main(String[] args)
	{
		GrowthPattern gp = new GrowthPattern();
		gp.growIt();
	}
	
	// In growIt method, prints a welcome message and call other methods. 
	// decideSymbols and printSymbols method call in a for loop and printRate
	// calls outside of the loop. 
	public void growIt()
	{
		System.out.println("\n\n\n");
		System.out.print("Welcome to GrowthPattern.java.");
		char[] sign = decideSymbols();
		printSymbols(sign);
		printRate();
	}

	// In decideSymbols method, '-' is use for when height < 0/result in negative change.
	// 'o' is use for when rate is not changing. '+' is use when rate result in positive 
	// change. 
	public char[] decideSymbols()
	{
		char[] sign = new char[height.length];
		sign[0] = 'o';
		for(int c = 1; c < height.length; c++)
		{
			if(height[c] < height[c - 1])
				sign[c] = '-';
			else if(height[c] == height[c - 1])
				sign[c] = 'o';
			else
				sign[c] = '+';
		}
		return sign; 
	}
	
	// Pass in parameters for time and signs. Nested loop is use for printing
	// time vertically and height horizontally.
	public void printSymbols(char[] sign)
	{
		System.out.println();
		for(int j = 0; j < height.length; j++)
		{
			System.out.printf("%nt%-5d", j);
			int symbolNum = height[j] + 5;
	        for(int k = 0; k < symbolNum; k++)
		{
			System.out.printf("%c", sign[j]);
	        }
	  }
    }
	// Prints a result for rate.
	public void printRate()
	{
		double rate = 0.0;
		double cHeight = 0.0;
		cHeight = height[height.length - 1] - height[0];
		rate = cHeight/height.length; 
		System.out.println("\n");
		System.out.printf("This is the growth rate is %.2f mm per unit time.", rate);
		System.out.println("\n\n\n");
	}
}
