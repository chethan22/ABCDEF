package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Parameterpom;

public class ParameterComment extends loginbase {
	
	public XSSFWorkbook wb;
	public XSSFSheet sheet2;
	public CharSequence ParLabel;
	public CharSequence ParDescription;
	public String ParInactiveDate;
	public CharSequence ParDataType;
	public CharSequence ParBaseUOM;
	public CharSequence ParStatus;
	public CharSequence ParName;
	public CharSequence ParType;
	public String ParEffectiveDate;

	
	@Test(priority=1)
    public void createParameter()throws Exception  {
		try {
		 File src=new File(loginbase.Filepath);
	        FileInputStream fis=new FileInputStream(src);

	        XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet sheet2=wb.getSheetAt(5);
	        int rowcount=sheet2.getLastRowNum();
	        System.out.println("Total Row:  " + rowcount);
	        for(int i=1;i<rowcount+1;i++) 
	        {
	            //GET CELL
	            Cell cell1 = sheet2.getRow(i).getCell(0); 
	            Cell cell2 = sheet2.getRow(i).getCell(1); 
	            Cell cell3 = sheet2.getRow(i).getCell(2); 
	            Cell cell4 = sheet2.getRow(i).getCell(3); 
	            Cell cell5 = sheet2.getRow(i).getCell(4); 
	            Cell cell6 = sheet2.getRow(i).getCell(5); 
	            Cell cell7 = sheet2.getRow(i).getCell(6); 
	            Cell cell8 = sheet2.getRow(i).getCell(7); 
	            Cell cell9 = sheet2.getRow(i).getCell(8); 
	            
	            //getting Parameter Name 
		           ParName=cell1.getStringCellValue();
		            System.out.println("Parameter Name: "+ParName);
		            //getting Parameter Type
		            ParType=cell2.getStringCellValue();
		            System.out.println("Parameter Type: "+ParType);
		            //getting Parameter Status 
		            ParStatus=cell3.getStringCellValue();
		            System.out.println("Target Obj Name: "+ParStatus);
		            //getting Parameter Base UOM
		            ParBaseUOM=cell4.getStringCellValue();
		            System.out.println("Parameter Base UOM: "+ParBaseUOM);
		            //getting Parameter Effective Date
		            ParEffectiveDate=cell5.getStringCellValue();
		            System.out.println("Effective Date: "+ParEffectiveDate);
		            //getting Parameter Inactive Date 
		            ParInactiveDate=cell6.getStringCellValue();
		            System.out.println("Inactive Date: "+ParInactiveDate);
		            //getting Parameter Data type
		            ParDataType=cell7.getStringCellValue();
		            System.out.println("Data type: "+ParDataType);
		            //getting Parameter description
		            ParDescription=cell8.getStringCellValue();
	                System.out.println("Description: "+ParDescription);
	                //getting  Parameter Label
	                ParLabel=cell9.getStringCellValue();
	                System.out.println("Parameter Label: "+ParLabel);
	                
		
		 //Click on Parameter in the side bar
        Parameterpom.Parameterclick(driver).click();
        
        
      //Click on '+' button in the Parameter
        Parameterpom.Parameterplusclick(driver).click();
        
        //Entering value into Name field
        Parameterpom.Parametername(driver).sendKeys(ParName);
        
      //Entering and selecting  value into Type dropdown
        Parameterpom.Parametertype(driver).sendKeys(ParType);
        Parameterpom.Parametertypeselect(driver).click();
        
      //Entering and selecting the value from Status dropdown
        Parameterpom.Parameterstatus(driver).sendKeys(ParStatus);
        Parameterpom.Parameterstatusselect(driver).click();
        
      //Entering and selecting the value from Base UOM dropdown
        Parameterpom.ParameterBaseUOM(driver).sendKeys(ParBaseUOM);
        Parameterpom.ParameterBaseUOMselect(driver).click();
        
       //Entering value in the Effective date field
        WebElement effective = Parameterpom.Parametereffectivedate(driver);
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        effective.clear();
        effective.sendKeys(ParEffectiveDate);
        
        
        //inctive.sendKeys(ParInactiveDate);
        
      //Entering and selecting the value from Data Type dropdown
        Parameterpom.Parameterdatatype(driver).sendKeys(ParDataType);
        Parameterpom.Parameterdatatypeselect(driver).click();
        
      //Entering value in the Inctive date field
        WebElement inctive = Parameterpom.Parameterinctivedate(driver);
        List<WebElement> inputs1 = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs1) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='"+ParInactiveDate+"';", inctive);
     
        
      //Entering value in Description field
        Parameterpom.Parameterdescription(driver).sendKeys(ParDescription);

      //Entering value in Lable field
        Parameterpom.Parameterlabel(driver).sendKeys(ParLabel);
        Thread.sleep(3000);
        
        //Click on Save button
        Parameterpom.ParameterSave(driver).click();
        System.out.println("Parameter Saved Successfully");
        Thread.sleep(3000);
        
	        }
		}
			 catch(Exception e)
	      {
	      	System.out.println(e.getMessage());
	      }

		}
	
	@Test(priority=2)
    public void enterComment()throws Exception  {
		try {
			
			//Scrolling to Recipe section
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Parameterpom.Parametercommentsection(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
			//Clicking on Comment section
			Parameterpom.Parametercommentsection(driver).click();
			Thread.sleep(3000);
			
			//Entering data into Comment textfield
			Parameterpom.Parametercommenttextfield(driver).sendKeys("Comment sent");
			Thread.sleep(3000);
			
			//Entering data into Comment textfield
			Parameterpom.Parametercommentsavebutton(driver).click();
			Thread.sleep(3000);

		}
		 catch(Exception e)
     {
     	System.out.println(e.getMessage());
     }

	}
	
	@Test(priority=3)
    public void verifyenterComment()throws Exception  {
		try {
			//Scrolling to comment
	     JavascriptExecutor js = (JavascriptExecutor) driver;
          WebElement Element = Parameterpom.Parametercommenttextfieldverify(driver);
         js.executeScript("arguments[0].scrollIntoView();",Element);
         Thread.sleep(3000); 
   
			//Getting and Comparing Comment text field value 
	    	String Parametercommenttextfield = Parameterpom.Parametercommenttextfieldverify(driver).getText();
	    	System.out.println("Created Parameter Comment Value :" +Parametercommenttextfield );
	    	String errormessage1 = "Parameter Comment Value is not matching";
	    	Assert.assertEquals("Comment sent", Parametercommenttextfield,errormessage1);
	    	System.out.println("Parameter Comment Value is matching "); 

		}
		 catch(Exception e)
     {
     	System.out.println(e.getMessage());
     }

}
	
	@Test(priority=4) 
	 public void deleteParameter()throws Exception  {
		
			
		try
		   {
			WebDriverWait wait = new WebDriverWait(driver,30);
			File src=new File(loginbase.Filepath);
	        FileInputStream fis=new FileInputStream(src);

	        XSSFWorkbook wb1=new XSSFWorkbook(fis);
			XSSFSheet sheet3=wb1.getSheetAt(2);
	        int rowcount1=sheet3.getLastRowNum();
	        System.out.println("Total Row:  " + rowcount1);

	            //GET CELL
	            Cell cell5 = sheet3.getRow(1).getCell(3); 
	            Cell cell6 = sheet3.getRow(1).getCell(4); 
	            Cell cell7 = sheet3.getRow(1).getCell(5); 
	            //getting database url
	            String DB_url= cell5.getStringCellValue();
	            System.out.println("Database URL "+DB_url);
	            
	            //getting database Username
	            String DB_Username= cell6.getStringCellValue();
	            System.out.println("Database Username "+DB_Username);
	            
	            //getting database Password
	            String DB_Password= cell7.getStringCellValue();
	            System.out.println("Database Username "+DB_Password);
	    
	            Connection db = DriverManager.getConnection(DB_url,DB_Username,DB_Password );
	            // create object for the Statement class
	            Statement st = db.createStatement();
	
	      		// execute the query on database
	            ResultSet rs = st.executeQuery("select * from parameter where parametername=" +"'"+ParName+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
	            }
	         // close the result set
	            rs.close();
	       
	            int rs1=st.executeUpdate("delete from parameter where parametername=" +"'"+ParName+"'");
	            
	            //close the statement
	            st.close();
	            //close the database connection
	            db.close();
	       	 
				 wb1.close();
       }	                
      catch(Exception e)
      {
        System.out.println(e.getMessage());
     }
}
}
