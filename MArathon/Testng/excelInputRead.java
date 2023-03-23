package selenium.marathan;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelInputRead {
	
	public static String[][] salesforceData(String excelname) throws IOException {
	
		XSSFWorkbook book1=new XSSFWorkbook("./TestData/"+excelname+".xlsx");
		
		// To open a specific sheet
		XSSFSheet sheet = book1.getSheetAt(0);
		// To get the number of rows of data available
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);
		// To get the number of cols of data available
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: " + colCount);
		
		// Create 2D to store the data read from the excel
		String[][] data1 = new String[rowCount][colCount];
		
		// Iterate over the rows and cols
		for(int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for(int j = 0; j < colCount; j++) {
				XSSFCell cell = eachRow.getCell(j);
				String value = cell.getStringCellValue();
				data1[i-1][j] = value;
			}
			
		}
		
		
		
		book1.close();
		return data1;
		
				
	}

}
