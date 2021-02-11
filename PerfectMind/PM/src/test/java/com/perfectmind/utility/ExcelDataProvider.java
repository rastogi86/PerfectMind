package com.perfectmind.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelDataProvider()
	{
		try
		{
		FileInputStream fis=new FileInputStream(new File("./TestData/testdata.xlsx"));
		workbook=new XSSFWorkbook(fis);
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to read the excel sheet"+e.getMessage());
		}
	}
	
	
	public String getData(int sheetno, int rownum,int colnum)
	{
		sheet=workbook.getSheetAt(0);
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	}
	

}
