import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\Testdata\\Data2.xlsx"); 
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		// XSSFRow row1=sheet.createRow(0);
		//row1.createCell(0).setCellValue("welcome");
		//row1.createCell(1).setCellValue("wel");
		//row1.createCell(2).setCellValue("come");
		
		// XSSFRow row2=sheet.createRow(0);
				//row2.createCell(0).setCellValue("welcome");
				//row2.createCell(1).setCellValue("wel");
				//row2.createCell(2).setCellValue("come");
				
		
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<=3;r++) {
			XSSFRow currentRow =sheet.createRow(r);
			for(int c=0;c<2;c++) {
				//currentRow.createCell(c).setCellValue("Welcome");
				System.out.println("enter the value");
				String value=sc.next();
				currentRow.createCell(c).setCellValue(value);
				
			}
			
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("printing is done");
		
		
		
		// TODO Auto-generated method stub
		

	}

}
