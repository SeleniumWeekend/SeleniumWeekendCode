package com.excel;

public class Run {

	public static void main(String[] args)
	{

		String data = Excel.getData("Sheet1", 3, 2);
		
		System.out.println(data);
		
		Excel.setData("Sheet1", 2, 6, "PASSTESTCASE");
		
		String val  = "seleniumnew02@gmail.com";
		
		String[] s1 = Excel.getAllRowValue("Sheet1", 2);
		for(int i=0; i<=s1.length-1; i++)
		{
			if(s1[i].equals(val))
			{
				System.out.println("Value is present in row");
			}
		}
		
		String[] s2 = Excel.getAllCalValue("Sheet1", 3);
		for(int i=0; i<s2.length; i++)
		{
			if(s2[i].equals("abcde"))
			{
				System.out.println("Value is present in col");
			}
		}
	}

}
