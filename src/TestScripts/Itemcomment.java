package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Itempom;
import POM.Parameterpom;

public class Itemcomment extends loginbase {
	
	public static String Typedropdown;
	public static String Description1;
	public static String Effectivedate;
	public static String Inactivedate;
	public static String statusdropdown;
	public static CharSequence ItemName;
	public XSSFWorkbook wb;
	public XSSFSheet sheet2;
	
	@Test(priority=1)
	 public void createItem()throws Exception  {
			
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			 
			  try {	
			        File src=new File(loginbase.Filepath);
			        FileInputStream fis=new FileInputStream(src);

			        XSSFWorkbook wb=new XSSFWorkbook(fis);
			        XSSFSheet sheet2=wb.getSheetAt(1);
			        int rowcount=sheet2.getLastRowNum();
			        System.out.println("Total Row:  " + rowcount);
			        int i=2;
//			        for(int i=2;i<rowcount+1;i++) 
//			        {
			            //GET CELL
			            Cell cell1 = sheet2.getRow(i).getCell(0); 
			            Cell cell2 = sheet2.getRow(i).getCell(1); 
			            Cell cell3 = sheet2.getRow(i).getCell(2); 
			            Cell cell4 = sheet2.getRow(i).getCell(3); 
			            Cell cell8 = sheet2.getRow(i).getCell(4); 
			            Cell cell9 = sheet2.getRow(i).getCell(5); 
			            
			     
			            //getting ItemName
			            ItemName= cell1.getStringCellValue();
			            System.out.println("ItemName: "+ItemName);
			            //getting Description
			            Description1= cell2.getStringCellValue();
			            System.out.println("Description : "+Description1);
			            //getting Effective Date 
			            Effectivedate= cell3.getStringCellValue();
			            System.out.println("Effectivedate : "+Effectivedate);
			            //getting Inactive Date 
			            Inactivedate= cell4.getStringCellValue();
			            System.out.println("Inactivedate : "+Inactivedate);
			            //get Typedropdown value
			            Typedropdown= cell8.getStringCellValue();
			            System.out.println("Type : "+Typedropdown);
			            //get statusdropdown
			            statusdropdown= cell9.getStringCellValue();
			            System.out.println("stauts : "+statusdropdown);
			            
			            //Clicking in Item
			            Itempom.itemClick(driver).click();
		
			            //Clicking on '+' button in Item
						Itempom.itemClickplus(driver).click();
						Thread.sleep(1000);
						
					    //Enter name 
						Itempom.itemName(driver).sendKeys(ItemName);
						Thread.sleep(1000);
						
					    //Entering EffectiveDate 
						WebElement effective = Itempom.effectiveactiveDate(driver);
				        List<WebElement> inputs = driver.findElements(By.tagName("input"));

				        for (WebElement input1 : inputs) {
				             ((JavascriptExecutor) driver).executeScript(
				                         "arguments[0].removeAttribute('readonly','readonly')",input1);
				        }
				        effective.clear();
				        effective.sendKeys(Effectivedate);
						
					    //Click on  Type dropdown 
						WebElement dropdown1 = Itempom.typeDropdown(driver);
						dropdown1.click();
						dropdown1.sendKeys(Typedropdown);
						dropdown1.sendKeys(Keys.ENTER);
					    
						//Click on Status dropdown
					    WebElement dropdown2 = Itempom.statusDropdown(driver);
					    dropdown2.click();
						dropdown2.sendKeys(statusdropdown);
						dropdown2.sendKeys(Keys.ENTER);
						
						WebElement input = Itempom.inactiveDate(driver);
		         		  ((JavascriptExecutor) driver).executeScript(
		     			                         "arguments[0].removeAttribute('readonly','readonly')",input);
		         		  
			         		 // }	         			        
				        WebElement inactive = Itempom.inactiveDate(driver);
				        inactive.sendKeys(Inactivedate);
				         
				       
				        WebElement description = Itempom.description(driver);		         
				        description.sendKeys(Description1);
				        
						Itempom.saveClick(driver).click();
						System.out.println("Saved successfully");
						Reporter.log("Item saved successfully");
						Thread.sleep(4000);
						
					wb.close();					
			        //}		 
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
		     WebElement Element = Itempom.Itemcommentsection(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
			//Clicking on Comment section
            Itempom.Itemcommentsection(driver).click();
			Thread.sleep(3000);
			
			//Entering data into Comment textfield
			Itempom.Itemcommenttextfield(driver).sendKeys("Comment sent");
			Thread.sleep(3000);
			
			//Entering data into Comment textfield
			Itempom.Itemcommentsavebutton(driver).click();
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
          WebElement Element = Itempom.Itemcommenttextfieldverify(driver);
         js.executeScript("arguments[0].scrollIntoView();",Element);
         Thread.sleep(3000); 
   
			//Getting and Comparing Comment text field value 
	    	String Itemcommenttextfield = Itempom.Itemcommenttextfieldverify(driver).getText();
	    	System.out.println("Created Item Comment Value :" +Itemcommenttextfield );
	    	String errormessage1 = "Item Comment Value is not matching";
	    	Assert.assertEquals("Comment sent", Itemcommenttextfield,errormessage1);
	    	System.out.println("Item Comment Value is matching "); 
	    	
	    	//Scrolling to Recipe section
		     WebElement Element1 = Itempom.Addcross(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element1);
            Thread.sleep(3000);
			
			//Close the Item 
			WebElement closeadd = Itempom.Addcross(driver);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", closeadd);
			Thread.sleep(1000);

		}
		 catch(Exception e)
     {
     	System.out.println(e.getMessage());
     }

   }
	@Test(priority=4) 
	 public void deleteItem()throws Exception  {
		
			
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
	            ResultSet rs = st.executeQuery("select * from item where itemname=" +"'"+ItemName+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
	            }
	         // close the result set
	            rs.close();
	       
	            int rs1=st.executeUpdate("delete from item where itemname=" +"'"+ItemName+"'");
	            
	            //close the statement
	            st.close();
	            //close the database connection
	            db.close();
	            Itempom.searchBox(driver).clear();
	            Itempom.searchBox(driver).sendKeys(ItemName);
				Thread.sleep(1000);
				Itempom.searchHit(driver).click();
				Thread.sleep(3000);	
				
			
				        	String searchItem1 = Itempom.getItemname(driver).getText();
							System.out.println("searched Item: " +searchItem1);
							String errormessage1 = "Item exists";
							Assert.assertNotEquals(ItemName, searchItem1,errormessage1);
							System.out.println(" Item deleted "); 
				         
							 Itempom.searchBox(driver).clear();
							 Itempom.searchHit(driver).click(); 
							 
							 wb1.close();
		   }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     }
	}
}
