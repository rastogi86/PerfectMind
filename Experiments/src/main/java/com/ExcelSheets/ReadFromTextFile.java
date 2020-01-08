package com.ExcelSheets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileReader fr=new FileReader("C:\\Users\\rasto\\eclipse-workspace\\TestFilesCreated\\myfile.txt");
		BufferedReader br=new BufferedReader(fr);
		String i="";
		String j=br.readLine();
		while ((i=j)!=null)
		{
			System.out.println(j);
			j=br.readLine();
		}
		br.close();
		}

}
