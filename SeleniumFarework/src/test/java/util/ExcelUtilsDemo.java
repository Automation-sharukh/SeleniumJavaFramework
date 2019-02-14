package util;

public class ExcelUtilsDemo 
{
   public static void main(String[] args)
   {
	   String ProjectPath = System.getProperty("user.dir");
	 ExcelUtils excel = new ExcelUtils(ProjectPath+"/excel/data.xlsx","sheet1");
	 excel.getRowCount();
	 excel.getCellDataString(0, 0);
	 excel.getCallDataNumber(1, 1);
}
}
