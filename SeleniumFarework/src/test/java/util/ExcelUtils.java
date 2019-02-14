package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{  
	static String ProjectPath;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet ;

	public ExcelUtils(String excelPath,String sheetname)
	{ try{
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetname);       		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCallDataNumber(1,1);
	}
	public static int getRowCount()
	{  
		int rowCount=0;
		try
		{
			 rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Row Count : "+rowCount);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.fillInStackTrace();
		}return rowCount;
	}
	
	public static int getColCount()
	{  int colCount=0;
		try
		{
			 colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Column Count : "+colCount);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.fillInStackTrace();
		}
	return colCount;
	}
	public static String getCellDataString(int rownum,int colnum)
	{  String cellData=null;
		try{

		    cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println(cellData);

		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.fillInStackTrace();

		}return cellData;
	}
	public static void getCallDataNumber(int rowNum , int colNum)
	{
		try{

            ProjectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(ProjectPath+"/excel/data.xlsx");
			sheet = workbook.getSheet("sheet1");
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.fillInStackTrace();

		}
	}

}