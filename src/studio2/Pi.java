package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many darts do you want to throw");
		int N = in.nextInt();
		int circle=0;
		
		for (int i=0;i<N;i++)
		{
			double x = Math.random();
			double y = Math.random();
			double distance = Math.sqrt(Math.pow(x-0.5,2)+Math.pow(y-0.5,2));
			if (distance<0.5)
			{
				circle++;
			}
		}
		double pi = (double)circle/N;//记得给右边附上double
		System.out.println(pi*4);
		
		
	}

}
