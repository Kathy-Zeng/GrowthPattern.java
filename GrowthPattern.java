// Kathy Zeng
// 1/12/21
// GrowthPattern.java
// Description: 

import java.util.Scanner;

public class GrowthPattern
{
	private int[] height;
	
	public GrowthPattern()
	{
		height = new int[]{-1, -3, 1, 2, 3, 4, 3, 4, 4, 6, 8, 6, 6, 7, 10};
	}
	
	public static void main(String[] args)
	{
		GrowthPattern gp = new GrowthPattern();
		gp.growIt();
	}
	
	//
	public void growIt()
	{
		decideSymbols('?');
		printSymbols(1);
		printRate();
	}

	//
	public void decideSymbols(char sign)
	{
		if(height[] < 0)
			sign = '-';
		else if(height[] == 1)
			sign = 'o';
		else
			sign = '+';
	}
	
	//
	public void printSymbols(int time)
	{
		System.out.println("\n\n\n");
		for(int i = 0; i < height[]; i++)
		{
			System.out.printf("t%5d%s", time);
	    }
	}
	
	//
	public void printRate()
	{
		int rate = 0;
		int cHeight = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Welcome to GrowthPatterm.java. Please enter a height: ");
		height = s.nextInt();
		System.out.println();
		System.out.printf("This is the growth rate " + rate + "mm/unit time.");
		cHeight = height[height.length - 1] - height[0];
		rate = cHeight/height.length - 1;
		System.out.println("\n\n\n");
	}
}
