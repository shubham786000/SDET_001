package com.crm.autoDesk.genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelFileUtility {
	/*this method will read the data from excel sheet to write row number and cell number
	 * @throws throwable
	 * 
	 */
	public String getExcelData(String sheetName, int rownum, int cellnum) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstant.excelSheetPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) workbook.getSheet(sheetName);
		DataFormatter format = new DataFormatter();
		
		String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
		
	}
	

}


