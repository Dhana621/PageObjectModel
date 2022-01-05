package com.testng1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcel {

	@DataProvider(name="login_pana_poren")
	public static String[][] getExcelData() {
		String location = "D:\\java\\dataprovider.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(location);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("inclusive of header :"+physicalNumberOfRows);
		System.out.println("number of rows :"+lastRowNum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("numbr of cells :"+lastCellNum);
		String [][] data =new String [5][2];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(i);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				System.out.println(value);
		data[i-1][j]=value;
			}
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return data;
	}

	
}
