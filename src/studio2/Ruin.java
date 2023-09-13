package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// TODO Auto-generated method stub
		System.out.println("What's the amount of money that you start with");
		int startAmount = in.nextInt();
		System.out.println("What's the the probability that you win a single play");
		double winChance = in.nextDouble();
		System.out.println("If you reach this amount of money you had a successful day and leave");
		double winLimit = in.nextDouble();
		System.out.println("The number of day’s you’ll simulate");
		double totalSimulations = in.nextDouble();
		
		int m=0;
		for (int j=0; j<=totalSimulations;j++)
		{
		int k=0;
		int i=startAmount;
		while (0<i&&i<=winLimit)
		{
			double number = (double) (Math.random());
			if (number>winChance)
			{
				i--;
			}
			else
			{
				i++;
			}
			k++;		
		}
		
		
		if (i==0)
		{	
		    m++;
			System.out.println("Simulation "+j+" "+k+" LOSE");
		}
		else
		{
			System.out.println("Simulation "+j+" "+k+" WIN");
		}
		
		
		}
		System.out.println("Losses: "+m+" Simulations: "+totalSimulations);
		
		
		double n=m/totalSimulations;
		if (winChance==0.5)
		{
		double expectedruin = 1-startAmount/winLimit;
		System.out.println("Ruin Rate from Simulation: "+n+" Expected Ruin Rate: "+expectedruin);
		}
	    else
	    {
		double expectedruin = (Math.pow(((1-winChance)/winChance),startAmount)-Math.pow(((1-winChance)/winChance), winLimit))/(1-Math.pow(((1-winChance)/winChance), winLimit));
		System.out.println("Ruin Rate from Simulation: "+n+" Expected Ruin Rate: "+expectedruin);
	    }	

	}
}