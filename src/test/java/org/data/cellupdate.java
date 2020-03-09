package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cellupdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File loc=new File("C:\\Users\\Kailash Maruthi\\eclipse-workspace\\Datadriveen\\excel\\krishna.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("sheet1");
		Cell cell = s.getRow(0).getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
	if(value.equals("Employee id"))
	{
		cell.setCellValue("id");
	}
	FileOutputStream ff=new FileOutputStream(loc);
	
	w.write(ff);
	String valuee = cell.getStringCellValue();
	System.out.println(valuee);
	System.out.println("done");
	}

}
