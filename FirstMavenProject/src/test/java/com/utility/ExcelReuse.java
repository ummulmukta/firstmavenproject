package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReuse {
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet a;

	public static String dataRead(String excelpath, String sh,int col) {

		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a = wb.getSheet(sh);

		 int totalrow=a.getLastRowNum();

		 for(int i=0;i<=totalrow;i++) {
		String result=a.getRow(i).getCell(col).getStringCellValue();
		
		 System.out.println(result);
		// double resultnumeric=a.getRow(i).getCell(2).getNumericCellValue();
		// System.out.println(resultnumeric);
		 }
		return sh;

	}

}
