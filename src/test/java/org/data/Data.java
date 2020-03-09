package org.data;

import java.io.File;
import java.io.*;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File loc=new File("C:\\Users\\Kailash Maruthi\\eclipse-workspace\\Datadriveen\\excel\\Book1.xlsx");
FileOutputStream f=new FileOutputStream(loc);
	Workbook w=new XSSFWorkbook();
Sheet s=w.createSheet("krish");
		
				
for (int i = 0; i < 5; i++) {
	
	Row r=s.createRow(i);
	for (int j = 0; j <6; j++) {
		
	
		Cell c = r.createCell(j);
		c.setCellValue("KRISHNA");}}
	w.write(f);
	System.out.println("done");
	}

}
