package com.ExcelSheets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class CreateAndWriteInExcelSheets {
	
	public static void main(String[] args) throws IOException 
	{
		int counter=(int)(Math.random()*10);
		XSSFWorkbook xb=new XSSFWorkbook();
		XSSFSheet sheet1=xb.createSheet("My sheet 1");
		
		for (int i=0;i<10;i++)
		{
			Row row=sheet1.createRow(i);
			for(int j=0;j<10;j++)
			{
			Cell cell=row.createCell(j);
			
			cell.setCellValue((int)(Math.random()*100));

			}

		}
		String filename="C:\\Users\\rasto\\eclipse-workspace\\TestFilesCreated\\FileCreated"+counter+".xlsx";
		File f=new File(filename);
		FileOutputStream fos=new FileOutputStream(f);
		xb.write(fos);
		
		xb.close();
		
			
	}

}
