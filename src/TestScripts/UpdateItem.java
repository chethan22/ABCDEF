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

public class UpdateItem extends loginbase {

	public static String Typedropdown;
	public static String Description;
	public static String Effectivedate;
	public static String Inactivedate;
	public static String statusdropdown;
	public static CharSequence ItemName;
	String xpath = "//div [@class= \"e-content\"]/table/tbody/tr[1]/td[1]";
	private String upDescription;
	private String upEffectivedate;
	private String upInactivedate;
	private String upTypedropdown;
	private String upstatusdropdown;
	
	
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
		        //for(int i=2;i<rowcount+1;i++) 
		      // {
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
		            Description= cell2.getStringCellValue();
		            System.out.println("Description : "+Description);
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
					
					WebElement input = driver.findElement(By.xpath("//input[@id='ej2-datepicker_45_input']"));
	         		  ((JavascriptExecutor) driver).executeScript(
	     			                         "arguments[0].removeAttribute('readonly','readonly')",input);
	         		  
		         		 // }	         			        
			        WebElement inactive = Itempom.inactiveDate(driver);
			        inactive.sendKeys(Inactivedate);
			         
			       
			        WebElement description = Itempom.description(driver);		         
			        description.sendKeys(Description);
			        
			        //Clicking on Save
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
	public void updateItem()throws Exception  {
		try 
		{		
		File src=new File(loginbase.Filepath);
        FileInputStream fis=new FileInputStream(src);

        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet2=wb.getSheetAt(1);
        int rowcount=sheet2.getLastRowNum();
        System.out.println("Total Row:  " + rowcount);
        for(int i=3;i<rowcount+1;i++) 
        {
            //GET CELL
           // Cell cell1 = sheet2.getRow(i).getCell(0); 
            Cell cell2 = sheet2.getRow(i).getCell(1); 
            Cell cell3 = sheet2.getRow(i).getCell(2); 
            Cell cell4 = sheet2.getRow(i).getCell(3); 
            Cell cell8 = sheet2.getRow(i).getCell(4); 
            Cell cell9 = sheet2.getRow(i).getCell(5); 
            
     
            
            //getting Description
            upDescription= cell2.getStringCellValue();
            System.out.println("Description : "+upDescription);
            //getting Effective Date 
            upEffectivedate= cell3.getStringCellValue();
            System.out.println("Effectivedate : "+upEffectivedate);
            //getting Inactive Date 
            upInactivedate= cell4.getStringCellValue();
            System.out.println("Inactivedate : "+upInactivedate);
            //get Typedropdown value
            upTypedropdown= cell8.getStringCellValue();
            System.out.println("Type : "+upTypedropdown);
            //get statusdropdown
            upstatusdropdown= cell9.getStringCellValue();
            System.out.println("stauts : "+upstatusdropdown);
            
            
          //Editing Type dropdown 
        	WebElement ele = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//div//input"));
        	JavascriptExecutor executor = (JavascriptExecutor)driver;
        	executor.executeScript("arguments[0].click();", ele);
        	ele.sendKeys(upTypedropdown);
        	ele.sendKeys(Keys.ENTER);

        	
        	//Editing Status dropdown 
        	  WebElement dropdown2 = Itempom.statusDropdown(driver);
        	  dropdown2.sendKeys(upstatusdropdown);
        	  Itempom.statusselectDropdown(driver).click();
        	  Thread.sleep(3000);
        	//dropdown2.sendKeys(Keys.ENTER);

        	
        	  //Editing Effective date   	  
        	   WebElement effective = Itempom.updateeffectiveactiveDate(driver);
        	   List<WebElement> inputs = driver.findElements(By.tagName("input"));

        	   for (WebElement input1 : inputs) {
        	       ((JavascriptExecutor) driver).executeScript(
        	                   "arguments[0].removeAttribute('readonly','readonly')",input1);
        	   }
        	   effective.clear();
        	   effective.sendKeys(upEffectivedate);
           
           //Editing description
           WebElement description = Itempom.description(driver);
           description.clear();
           description.sendKeys(upDescription);
           
           
         //Editing inactive date 
         	WebElement input =Itempom.updateinactiveDate(driver);
         	  ((JavascriptExecutor) driver).executeScript(
         	                         "arguments[0].removeAttribute('readonly','readonly')",input);
         	  
         		 	         			        
            WebElement inactive = Itempom.updateinactiveDate(driver);
            inactive.clear();
            inactive.sendKeys(upInactivedate);
           
            //Click on save in update mode 
        	Itempom.saveClick(driver).click();
        	System.out.println("Updated successfully");
        	Thread.sleep(3000);
        	
        	wb.close();
         }
	   }	                    
       catch(Exception e)
            {
            	System.out.println(e.getMessage());
            } 
	}
	
	@Test(priority=3)
	public void verifyupdateItem()throws Exception  {
	try {
		
		//Comparing Itemname
		String createdItemname = Itempom.itemName(driver).getAttribute("value");
		System.out.println("Selected value for Itemname :" +createdItemname );
		String errormessage1 = "ItemName not matching";
		Assert.assertEquals(ItemName, createdItemname,errormessage1);
		System.out.println("Item name matching ");
		
		//Comparing TypeDropdown
		
		String selectedTypedropdown1 = Itempom.selectedTypedropdown(driver).getText();
		System.out.println("Selected value for Type Dropdown is::" +selectedTypedropdown1);
		String errormessage2 = "Type not matching";
		Assert.assertEquals(upTypedropdown, selectedTypedropdown1,errormessage2);
		Reporter.log("Itemname  matching");
		System.out.println("Type matching ");
		
		//Comparing StatusDropdown  
		
		String SelectedStatusdropdown1=Itempom.SelectedStatusdropdown(driver).getText();
		System.out.println("Selected value for Status Dropdown is::" +SelectedStatusdropdown1 );
		String errormessage3 = "Status  not matching";
		Assert.assertEquals(upstatusdropdown, SelectedStatusdropdown1,errormessage3);
		Reporter.log("Status  matching");
		System.out.println("Status matching ");
	
		//Comparing EffectiveDate
		String effectiveDate= Itempom.updateeffectiveactiveDate(driver).getAttribute("value");
		System.out.println("Selected value for EffectiveDate is::"+ effectiveDate);
		String errormessage4 = "effectiveDate  not matching";
		Assert.assertEquals(upEffectivedate, effectiveDate,errormessage4);
		Reporter.log("effectiveDate  matching");
		System.out.println("effectiveDate matching ");
		
		//Comparing InactiveDate
		String inactiveDate=Itempom.updateinactiveDate(driver).getAttribute("value");
		System.out.println("Selected value for inactiveDate is::" +inactiveDate);
		String errormessage5 = "inctiveDate  not matching";
		Assert.assertEquals(upInactivedate, inactiveDate,errormessage5);
		Reporter.log("inctiveDate matching ");
		System.out.println("inctiveDate matching ");
		
		//Comparing Description
		String description1=Itempom.description(driver).getAttribute("value");
		System.out.println("Selected value for description is::" +description1);
		String errormessage6 = " description not matching";
		Assert.assertEquals(upDescription, description1,errormessage6);
		Reporter.log("description  matching ");
		System.out.println("Description matching ");
		
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

	@Test(priority=5) 
	 public void deleteupdatedItem()throws Exception  {
		
			
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
	            Itempom.searchBox(driver).click();
	            Itempom.searchBox(driver).sendKeys(ItemName);
				Thread.sleep(1000);
				Itempom.searchHit(driver).click();
				Thread.sleep(3000);	
				
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
				        	String searchItem1 = Itempom.getItemname(driver).getText();
							System.out.println("searched Item: " +searchItem1);
							String errormessage1 = "Item exists";
							Assert.assertNotEquals(ItemName, searchItem1,errormessage1);
							System.out.println(" Item deleted "); 
				         
							 wb1.close();
		   }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     }
	}
	
	
}
