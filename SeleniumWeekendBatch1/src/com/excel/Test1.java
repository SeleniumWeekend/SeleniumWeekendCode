package com.excel;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class EComm
{
	void addProductToBag()
	{
		System.out.println("addProductToBag");
	}
}

class jdw extends EComm
{
	void addProductToBag()
	{
		System.out.println("addProductToBag in jdw");
	}
}

class SBUS extends EComm
{
	void addProductToBag()
	{
		System.out.println("addProductToBag in SBUS");
	}
}
