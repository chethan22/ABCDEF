package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.Itempom;
import TestScripts.CreateItem;


public class EditWriteExcel  extends loginbase{

	
	 @Test(priority=2)
	 public void writeItemExcel() throws Exception {
		 try
		 {
			 
	 
		 File src=new File(loginbase.Filepath);
		    FileInputStream fis=new FileInputStream(src);

		    XSSFWorkbook wb=new XSSFWorkbook(fis);
		    XSSFSheet sheet2=wb.getSheetAt(1);
		    int rowcount=sheet2.getLastRowNum();
		    System.out.println("Total Row:  " + rowcount);
		    
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    Itempom.searchBoxEdit(driver).sendKeys(CreateItem.ItemName);//TSTItemauto
	        
		Itempom.searchHit(driver).click();
		Thread.sleep(3000);	
		
		Itempom.ItemnameClick(driver).click();
		Thread.sleep(3000);	
		    
		    //getting type dropdown value 
		    String selectedTypedropdown1 = Itempom.selectedTypedropdown(driver).getText();
			System.out.println("Selected value for Type Dropdown is::" +selectedTypedropdown1);
			
			//getting status dropdown value 
			String SelectedStatusdropdown1=Itempom.SelectedStatusdropdown(driver).getText();
			System.out.println("Selected value for Status Dropdown is::" +SelectedStatusdropdown1 );
			
			//getting value from Effective date 
			String effectiveDate= Itempom.updateeffectiveactiveDate(driver).getAttribute("value");
			System.out.println("Selected value for EffectiveDate is::"+ effectiveDate);
			
			//getting value from Inactive date
			String inactiveDate=Itempom.updateinactiveDate(driver).getAttribute("value");
			System.out.println("Selected value for inactiveDate is::" +inactiveDate);
			
			//getting value from description
			String description1=Itempom.description(driver).getAttribute("value");
			System.out.println("Selected value for description is::" +description1);
			
			FileInputStream fis2= new FileInputStream(loginbase.Filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis2);

			XSSFSheet sheet = workbook.getSheet("Item");

			 for(int i=2;i<rowcount+1;i++) 
		        {
            //Writing into typedropdown 
		    Row row1 = sheet.getRow(i);
			Cell cell1 = row1.getCell(6);
			cell1.setCellValue(selectedTypedropdown1);
			
			//Writing into status dropdown
			Row row2 = sheet.getRow(i);
			Cell cell2 = row2.getCell(7);
			cell2.setCellValue(SelectedStatusdropdown1);
			
			//Writing into effective Date 
			Row row3 = sheet.getRow(i);
			Cell cell3 = row3.getCell(8);
			cell3.setCellValue(effectiveDate);
			
			//writing into inactive date 
			Row row4 = sheet.getRow(i);
			Cell cell4 = row4.getCell(9);
			cell4.setCellValue(inactiveDate);
			
			//Writing into Description
			Row row5 = sheet.getRow(i);
			Cell cell5 = row5.getCell(10);
			cell5.setCellValue(description1);
		        }    
			FileOutputStream fos = new FileOutputStream(loginbase.Filepath);
			workbook.write(fos);
			workbook.close();
			fos.close();
			System.out.println("END OF WRITING DATA IN EXCEL");
		     
		        
		     
		    wb.close();   
	 }
	 
	     catch(Exception e)
   	   {
   	   	System.out.println(e.getMessage());
   	   }
	 
	 }  
}
