package Week5.Day1.LeafTaps.TestNg.DynamicData.Practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public  static String[][] getdata(String excelfilename) throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook("./TestData/"+excelfilename+".xlsx");
		
		
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		short colCount = sheet.getRow(rowCount).getLastCellNum();
		String[][] data=new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				
			}
		}
		book.close();
		return data;
	}

}
