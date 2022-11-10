package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException   {

		// Open/Enter the workbook				
		XSSFWorkbook wb = new XSSFWorkbook("./data11/ReadData.xlsx");			
		
		//Get Sheet			
		XSSFSheet sheet = wb.getSheet("Sheet1");
					
		//Get row
		XSSFRow row = sheet.getRow(4);
					
		//Get column
		  XSSFCell cell = row.getCell(1);
		
		//Action- Read/print particular CellValue
		 String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		
		//Get row
		/*XSSFRow row = sheet.getRow(3);
		//Get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		for (int i = 1; i <= rowCount; i++) {
			
			// Get column
			XSSFCell cell = row.getCell(2); //Column 2
			// Actions -> Read value
			String sValue = cell.getStringCellValue();
			System.out.println(sValue);
		}
		
		/*	for (int i = 0; i < args.length; i++) {
				// Get row
				XSSFRow row = sheet.getRow(4); //Row 4
				for (int j = 0; j < args.length; j++) {
					// Get column
					XSSFCell cell = row.getCell(2); //Column 2
					// Actions -> Read value
					String sValue = cell.getStringCellValue();
					System.out.println(sValue);
				}
			}*/
		}

	}


