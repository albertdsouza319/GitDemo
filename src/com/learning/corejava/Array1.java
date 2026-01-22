package com.learning.corejava;

public class Array1 {

	static String months[] = {
			"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
	static int monthdays[] = { 31,28,31,30,31,30,31,31,30,31,30,31};
	static String spring = "spring";
	static String summer = "summer";
	static String autumn = "autumn";
	static String winter = "winter";
	static String session[]= {
		winter,winter,summer,summer,summer,spring,spring,autumn,autumn,autumn,autumn,winter	};
	

	public void test(){
		System.out.println("develop branch");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int month = 0;month<10;month++)
		{
			System.out.println(months[month] + " is "+ session[month] +" month with "
		+ monthdays[month]+" days ");
			System.out.println("git demo 1");
			System.out.println("git demo 2");
			System.out.println("git demo 3");
			System.out.println("git demo 4");
			System.out.println("test for gitpull");
			// adding from another user for push test
		
		}
	}

}
