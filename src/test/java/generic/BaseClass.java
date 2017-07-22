package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public abstract class BaseClass {
	
	public String setPath(String path){
		
		String currenturl = System.getProperty("user.dir");
		currenturl = currenturl + path;
		return currenturl;
	}

	public void readExcel(String fileName, LinkedHashSet<String> lhs){
		
		File dataFile = new File(this.setPath("\\src\\test\\java\\datasheet\\"+fileName));
		try {
			FileInputStream fis;
			fis = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
	
		int i=0;
		for(String value: lhs){
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			cell.getStringCellValue();
			i++;
			
		}
		
		LinkedHashSet<String> rhs = new LinkedHashSet<String>();
		//rhs = super.getListTextFromWebElementList(value);
		
		
		
	}
	
	public void writeExcel(String fileName, LinkedHashSet<String> lhs){
		
		System.out.println("running writeExcel");
		
		File dataFile = new File(this.setPath("\\src\\test\\java\\datasheet\\"+fileName));
	
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		//create ke badle get karna hai
		
		
		int i=0;
		for(String value: lhs){
		
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(value);
			i++;
		
		}
		try {
			FileOutputStream fos = new FileOutputStream(dataFile);
			workbook.write(fos);
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	
	
	
	}
	
}
