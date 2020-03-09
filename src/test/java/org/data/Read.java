package org.data;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
public static void main(String[] args) throws Exception {
	File loc=new File("C:\\Users\\Kailash Maruthi\\eclipse-workspace\\Datadriveen\\excel\\krishna.xlsx");
	FileInputStream f=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(f);
	Sheet s=w.getSheet("sheet1");
	Row r=s.getRow(0);
	Cell c=r.getCell(0);
	System.out.println(c);
	for (int i = 0; i <3; i++) {
		for (int j = 0; j <3; j++) {
			
		
	
	Cell cell = w.getSheet("sheet1").getRow(i).getCell(j);
	
	System.out.println(cell);
	}}
	
}
}
