package com.GenericLib.Amazon;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelib extends BrowserObjects{

	static{
	System.out.println("Reading test data .. .. ..");
}
	
	static  File xmlFile2 = new File ("Excel_Utils/TestData.xlsx");
	public static String Testdata_Excel_filepath=xmlFile2.getAbsolutePath();
	 
	public static String getData(String Sheetname,int rowIndex,int cellIndex)
	{
		
	
		
	//	String Testdata_Excel_filepath="/home/bob/Data/Automation/Workspace eAuction/eAuction/Excel_Utils/TestData.xlsx";
		
		
		

		String data=null;
		File f=new File(Testdata_Excel_filepath);
		
		try
		{
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
		
			Sheet st = wb.getSheet(Sheetname);
			Row r = st.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);
			switch (c.getCellType())
			{
			case Cell.CELL_TYPE_STRING:
				data=c.getStringCellValue();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				long d=(long)c.getNumericCellValue();
				Long dd=new Long(d);
				data=dd.toString();
				break;
			default:break;

			}
			//    data=c.getStringCellValue();
			wb.close();
			
		}

		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Check");
		}
		return data;
	}
	public static List<String> FirstQuotePrice(String Sheetname,int rowNo,int rowNoupto,int cellIndexNo)
	{
		String data=null;
		 List<String> FirstQuotePricelist = new ArrayList<String>();
		File f=new File(Testdata_Excel_filepath);
		try
		{
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(Sheetname);

			for(int rowIndex=rowNo;rowIndex<rowNoupto;rowIndex++ ){
			int cellIndex=cellIndexNo;
			Row r = st.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);

			switch (c.getCellType())
			{
			case Cell.CELL_TYPE_STRING:
				data=c.getStringCellValue();
				FirstQuotePricelist.add(data);
				break;
			case Cell.CELL_TYPE_NUMERIC:
				long d=(long)c.getNumericCellValue();
				Long dd=new Long(d);
				data=dd.toString();
				FirstQuotePricelist.add(data);
				break;
			default:break;

			}
			//data=c.getStringCellValue();
			wb.close();
		}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Test data is Empty....Please check Test data in Excel sheet");
		}
		System.out.println(rowNo+FirstQuotePricelist.size()+"Data is :"+FirstQuotePricelist);
		return FirstQuotePricelist;
	
		
	}

	public static void setData(String filepath,String Sheetname,int rowIndex,int cellIndex,String data) throws FileNotFoundException
	{
		try
		{
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(Sheetname);
			Row r = st.createRow(rowIndex);
			Cell c = r.createCell(cellIndex);
			FileOutputStream fos= new FileOutputStream(filepath);
			c.setCellValue(data);
			wb.write(fos);
			wb.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}


}

