package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public ArrayList<String> GetTestData(String testCaseName) throws Throwable
	{
		//String tc="tc1";
		ArrayList<String> data=new ArrayList<String>();
		String filePath=System.getProperty("user.dir")+"\\excel\\TestData.xlsx";	
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
		XSSFSheet sheet=workbook.getSheetAt(0);
		//Identify test case column by scanning first row
		//Once  column is identified and then scan the entire test case column to identify the test case 	
		//Once the test case row is identified then scan the entire Test case row 
		Iterator<Row> rows=sheet.iterator();
		Row firstrow=rows.next();
		Iterator<Cell> cells=firstrow.cellIterator();
		int k=0;
		int tccolumn=0;
		while(cells.hasNext())
		{
			Cell value=cells.next();
			if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
			{
			    tccolumn=k;
			  
		    }
			k++;

	     }
		//System.out.println(tccolumn);
		while(rows.hasNext())
		{
			Row r=rows.next();
			if(r.getCell(tccolumn).getStringCellValue().equalsIgnoreCase(testCaseName))
					{
				      Iterator<Cell> testdata=r.cellIterator();
				      while(testdata.hasNext())
				      {
				    	  //System.out.println(testdata.next().getStringCellValue().toString());
				    	  data.add(testdata.next().getStringCellValue().toString());
				      }
				      
				       
					}
			
		}
		workbook.close();
		return data;
        
	 }
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
       }
}
