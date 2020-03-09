package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readcelltype {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File loc=new File("C:\\Users\\Kailash Maruthi\\eclipse-workspace\\Datadriveen\\excel\\krishna.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("sheet1");
		Cell cell = s.getRow(2).getCell(2);
		int type = cell.getCellType();
		if(type==1)
		{
			String svalue = cell.getStringCellValue();
			System.out.println(svalue);	
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
				Date dcell = cell.getDateCellValue();
				System.out.println(dcell);
				SimpleDateFormat s1=new SimpleDateFormat("dd/MM/yyyy");
				String format = s1.format(dcell);
				System.out.println(format);
			}
			else
			{
				double ncellV = cell.getNumericCellValue();
				System.out.println(ncellV);
				long l=(long) ncellV;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
		}
		
	}

}
