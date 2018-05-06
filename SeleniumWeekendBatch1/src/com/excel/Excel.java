package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static String getData(String sheetName, int rowNum, int cellNum)
	{
		String data = null;
		try
		{
			FileInputStream file = new FileInputStream("C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumWeekendBatch1\\TestSuite\\data.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			XSSFRow row = sheet.getRow(rowNum);
			
			XSSFCell cell = row.getCell(cellNum);
			
			data = cell.getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public static void setData(String sheetName, int rowNum, int colNum, String data)
	{
		try
		{
			String filePath= "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumWeekendBatch1\\TestSuite\\data.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			XSSFRow row = sheet.getRow(rowNum);
			
			XSSFCell cel = row.createCell(colNum);
			cel.setCellType(CellType.STRING);
			cel.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(filePath);
			
			workbook.write(fos);
			
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
	}
	}
	
	public static String[] getAllRowValue(String sheetName, int rowNum)
	{
		String[] data = null;
		try
		{
			String filePath= "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumWeekendBatch1\\TestSuite\\data.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			XSSFRow row = sheet.getRow(rowNum);
			
			int len = row.getLastCellNum();
			data = new String[len];
			
			for(int i=0; i<=len-1; i++)
			{
				XSSFCell cell = row.getCell(i);
				data[i] = cell.getStringCellValue();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public static String[] getAllCalValue(String sheetName, int cellnum)
	{
		String[] data = null;
		try
		{
			String filePath= "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumWeekendBatch1\\TestSuite\\data.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			int rowlen = sheet.getLastRowNum();
			
			data = new String[rowlen];
			
			for(int i=0; i<=rowlen-1; i++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(cellnum);
				data[i] = cell.getStringCellValue();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	
}

	
