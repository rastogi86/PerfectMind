package com.ExcelSheets;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelSheets 
{

	public static void main(String[] args) throws IOException 
	{
		
		XSSFWorkbook xs=new XSSFWorkbook("C:\\Users\\rasto\\eclipse-workspace\\TestFilesCreated\\FileCreated0.xlsx");
		XSSFSheet ws=xs.getSheetAt(0);
		
		int RowCount=ws.getLastRowNum();
		XSSFRow ActiveRow;
		
		for (int i=0;i<=RowCount;i++)
		{
			ActiveRow=ws.getRow(i);
			for (int j=0;j<ActiveRow.getLastCellNum();j++)
			{
				System.out.print(ActiveRow.getCell(j)+"\t");
			}
			System.out.println();
		}
		
		xs.close();
		
		
	}
}
