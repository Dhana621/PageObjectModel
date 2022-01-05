package com.testng1;

import org.testng.annotations.DataProvider;

public class DataUtil {
@DataProvider
	public String[][] getData(){
		String[][] excelData = ReadExcel.getExcelData();
		return excelData;

	}
}
