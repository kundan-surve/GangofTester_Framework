package com.Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch15_Framework\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
			
	}
	
	public String getStringData_Excel(String SheetName,int row,int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	
	
}
