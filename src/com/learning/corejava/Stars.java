package com.learning.corejava;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int outercount,innercount;
		//4,5 stars
		for(outercount=1;outercount<=4;outercount++)
		{
			for(innercount=1;innercount<=5;innercount++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// rightangtri
		for(outercount=1;outercount<=4;outercount++)
		{
			for(innercount=1;innercount<=4;innercount++)
			{
				if(outercount >=innercount)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		//leftsiderittri
		
	}

}
