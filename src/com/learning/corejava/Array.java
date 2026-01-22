package com.learning.corejava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int month_days[];
		month_days = new int [2];
		month_days[0] = 31 ;
		month_days[1] = 28;
		System.out.println("feb has "+ month_days[1] + " days");
		*/
		
		int[][] m = new int[4][4];
		for(int i = 0; i < 4; i++)
			m[i][i] = 1;
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
