package com.learning.corejava;

public class sumofoddno
{
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum = 0,initialcount;
		for(initialcount=0;initialcount<=100;initialcount++)
		{
			if(initialcount % 2 != 0)//odd
			{
				sum = sum + initialcount;
			}
		}
		System.out.println("the sum of odd numbers is :"+ sum);
	}

}
