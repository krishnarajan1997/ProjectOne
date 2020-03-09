package org.data;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class REad1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File loc=new File("C:\\Users\\Kailash Maruthi\\eclipse-workspace\\Datadriveen\\excel\\krishna.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("sheet1");
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("No of rows"+rows);
		for (int j = 0;j<rows; j++) {
		Row r=s.getRow(j);
		int cells = r.getPhysicalNumberOfCells();
		System.out.println("No of column in "+j+"th"+"\t"+cells);
		for (int i = 0; i <cells; i++) {
			Cell c = r.getCell(i);
			System.out.println(c);
		}

		
		}
		
		}
	}


