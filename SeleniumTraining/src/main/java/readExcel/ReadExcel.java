package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// Open/Enter the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data1/ExcelSheet.xlsx");
				
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		

		//Get row count
		/*int rowCount = sheet.getLastRowNum();
		//int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		//int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);*/
		
		// Get row
		XSSFRow row = sheet.getRow(4);
		// Get column
		XSSFCell cell = row.getCell(2);		
		
		// Actions -> Read value
		String sValue = cell.getStringCellValue();
			
		System.out.println(sValue);

	}

}
