import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\Testdata\\Data1.xlsx"); // return the current folder path
		// now our excel data is in this excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");//with the help of workbook we create sheet object. workbook is predefined class, getSheet is to get the sheet
		
		int totalrows=sheet.getLastRowNum();// method returns the last row number
		int totalcells=sheet.getRow(1).getLastCellNum();//method returns the last row number
		System.out.println("total number of rows "+ totalrows);
		System.out.println("total number of columns  "+ totalcells);
		
		//loop for reading the data 
		for(int r=0;r<=totalrows;r++) {
			XSSFRow currentRow=sheet.getRow(r); // stores the value of r, currentrow object created to access the row
			
			//XSSFCell cell=currentRow.getCell(c);
			//String value=cell.toString();
			for(int c=0;c<totalcells;c++) {
				
			String value=currentRow.getCell(c).toString();
			System.out.println(value+" ");
			}
			
		}
		System.out.println();
		// TODO Auto-generated method stub
		workbook.close();
		file.close();

	}
	

}
