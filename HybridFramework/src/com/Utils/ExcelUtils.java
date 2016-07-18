package com.Utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public XSSFSheet getSheet(String fName,String sheetName)
	{
		XSSFSheet sht=null;
		
		try
		{
			FileInputStream fis=new FileInputStream(fName);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			sht=wb.getSheet(sheetName);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sht;
	}
	
	public String getASIN(XSSFSheet sht,int rownum,int cellnum)
	{
		String str=null;
		try
		{
			str=sht.getRow(rownum).getCell(cellnum).getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return str;
	}

	
	
}

