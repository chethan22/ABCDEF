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
import POM.Attributepom;
import POM.Itempom;
import POM.Recipepom;

public class ItemAttribute extends loginbase{
	
	public static CharSequence Attributename;
	public String caption;
	public String TargetObjName;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public String Attricaption;
	public String Attriname;
	public String Attritype;
	public String Attridataformat;
	public String Attrieffectivedate;
	public String Attriinactivedate;
	public static String Typedropdown;
	public static String Description1;
	public static String Effectivedate;
	public static String Inactivedate;
	public static String statusdropdown;
	public static CharSequence ItemName;
	public XSSFWorkbook wb;
	public XSSFSheet sheet2;
	
	@Test(priority=1)
    public void Excel()throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 File src=new File(loginbase.Filepath);
     FileInputStream fis=new FileInputStream(src);

     wb=new XSSFWorkbook(fis);
     sheet2=wb.getSheetAt(4);
     //System.out.println(wb);
     int rowcount=sheet2.getLastRowNum();
     System.out.println("Total Row:  " + rowcount);
     
         //GET CELL
         Cell cell1 = sheet2.getRow(1).getCell(0); 
         Cell cell2 = sheet2.getRow(1).getCell(1); 
         Cell cell3 = sheet2.getRow(1).getCell(2); 
         Cell cell4 = sheet2.getRow(1).getCell(3); 
         Cell cell5 = sheet2.getRow(1).getCell(4); 
         Cell cell6 = sheet2.getRow(1).getCell(5); 
         Cell cell7 = sheet2.getRow(1).getCell(6);
         Cell cell8 = sheet2.getRow(1).getCell(7);
         Cell cell9 = sheet2.getRow(1).getCell(8); 
         Cell cell10 = sheet2.getRow(1).getCell(9); 
         Cell cell11 = sheet2.getRow(1).getCell(10); 
         Cell cell12 = sheet2.getRow(1).getCell(11); 
         
       //getting Caption
         caption=cell1.getStringCellValue();
         System.out.println("Caption: "+caption);
         //getting Name
         Attributename=cell2.getStringCellValue();
         System.out.println("Attribute Name: "+Attributename);
         //getting Target Obj Name
         TargetObjName=cell3.getStringCellValue();
         System.out.println("Target Obj Name: "+TargetObjName);
         //getting Effective Date
         EffectiveDate=cell4.getStringCellValue();
         System.out.println("Effective Date: "+EffectiveDate);
         //getting Inactive Date 
         InactiveDate=cell5.getStringCellValue();
         System.out.println("Inactive Date: "+InactiveDate);
         //getting description
         Description=cell6.getStringCellValue();
         System.out.println("Description: "+Description);
         //getting Attribute list caption
         Attricaption=cell7.getStringCellValue();
         System.out.println("Attribute list caption: "+Attricaption);
         //getting Attribute list name
         Attriname=cell8.getStringCellValue();
         System.out.println("Attribute list name: "+Attriname);
         //getting Attribute list type
         Attritype=cell9.getStringCellValue();
         System.out.println("Attribute list type: "+Attritype);
         //getting Attribute list Data format
         Attridataformat=cell10.getStringCellValue();
         System.out.println("Attribute list Data Format: "+Attridataformat);
         //getting Attribute list Effectivedate
         Attrieffectivedate=cell11.getStringCellValue();
         System.out.println("Attribute list  Effectivedate: "+Attrieffectivedate);
       //getting Attribute list Inctivedate
         Attriinactivedate=cell11.getStringCellValue();
         System.out.println("Attribute list caption: "+Attriinactivedate);
         
         wb.close();
        

}
	
	@Test(priority=2)
	public void createAttributeGroup()throws Exception {
		
		try {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Click on attribute 
		Attributepom.Attributeclick(driver).click();
		
		//Click on "+" button 
		Attributepom.Attributeplusclick(driver).click();
		
		//Enter the value in Attribute Group Caption field
		Attributepom.AttributegroupCaption(driver).sendKeys(caption);
		
		//Enter the value in Attribute Group Name field
		Attributepom.AttributegroupName(driver).sendKeys(Attributename);
		
		//select the value from Attribute Group Target Obj Name dropdown
         WebElement dropdown1 = Attributepom.AttributegroupTargetObjname(driver);
		dropdown1.sendKeys("Item Master");
        dropdown1.sendKeys(Keys.ENTER);
        
		//Entering the value in Effective Date field
        WebElement effective = Attributepom.AttributegroupEffectivedate(driver);
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        effective.clear();
        effective.sendKeys(EffectiveDate);
        
        //Entering value in description field
        Attributepom.Attributegroupdescription(driver).sendKeys(Description);
        
        //Entering the value in Inactive Date field
        WebElement input = Attributepom.Attributegroupinactivedate(driver);
 		  ((JavascriptExecutor) driver).executeScript(
			                         "arguments[0].removeAttribute('readonly','readonly')",input);
 		  
       		         			        
	         WebElement inactive = Attributepom.Attributegroupinactivedate(driver);
	         inactive.sendKeys(InactiveDate);
       
	    //Clicking on save button
	     Attributepom.AttributegroupSave(driver).click();
	     System.out.println("Attribute group is saved successfully");
		}
		 catch(Exception e)
      {
      	System.out.println(e.getMessage());
      }
	   
	}
	
	@Test(priority=3)
	public void createAttributelist()throws Exception {
	
		try {
	//Scrolling to Attribute list
	JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement Element = Attributepom.Attributelistscroll(driver);
    js.executeScript("arguments[0].scrollIntoView();",Element );

    //Clicking on '+' button
     Attributepom.Attributelistadd(driver).click();
     
     //Entering value in Caption 
     Attributepom.Attributelistcaption(driver).sendKeys(Attricaption);
     
   //Entering value in Name
     Attributepom.Attributelistname(driver).sendKeys(Attriname);
     
    //Selecting value from type dropdown
     WebElement dropdown1 = Attributepom.Attributelisttype(driver);
     dropdown1.sendKeys(Attritype);
     dropdown1.sendKeys(Keys.ENTER);
   
   //Enter Effective Date
     WebElement effective = Attributepom.AttributelistEffectiveDate(driver);
      List<WebElement> inputs = driver.findElements(By.tagName("input"));

      for (WebElement input1 : inputs) {
          ((JavascriptExecutor) driver).executeScript(
                      "arguments[0].removeAttribute('readonly','readonly')",input1);
      }
      effective.clear();
      effective.sendKeys(EffectiveDate); 
      
    //Entering the value in the Description field 
      Attributepom.AttributelistDescription(driver).sendKeys(Description);
     
    //Entering inactive date 
      WebElement input = Attributepom.Attributelistinactive(driver);
 	  ((JavascriptExecutor) driver).executeScript(
 	                         "arguments[0].removeAttribute('readonly','readonly')",input);
   
 	// input.sendKeys(InactiveDate);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("arguments[0].value='"+InactiveDate+"';", input);
       
  
    //Selecting value from Date format dropdown
     WebElement dropdown2 = Attributepom.Attributelistdataformat(driver);
     dropdown2.sendKeys(Attridataformat);
     
     WebElement dropselect=Attributepom.AttributelistdataformatClick(driver);
     dropselect.click();
  
    //Click on 'Save' button
   Attributepom.AttributelistSave(driver).click();
   System.out.println("-------------Attribute list is saved successfully----------------- ");
   
	}
	 catch(Exception e)
  {
  	System.out.println(e.getMessage());
  }
}
	
	@Test(priority=4)
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
//		        for(int i=2;i<rowcount+1;i++) 
//		        {
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
	
	@Test(priority=5)
    public void selectAttribute() throws Exception  {
		try
		{
			//Scrolling to Recipe section
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Itempom.Itemattributeclick(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
            //clicking on attribute section in recipe
            Itempom.Itemattributeclick(driver).click();
            
            
            //Clicking on '+' button 
            Itempom.Itemattributeplusclick(driver).click();
            js.executeScript("window.scrollBy(0,200)");
            
            //Entering the value in dropdown feild
            Itempom.Itemattributedropdown(driver).sendKeys(caption);
           
            //Selecting the dropdown value
            Itempom.Itemattributedropdownselect(driver).click();
            
            //Clicking on 'Yes' button
            Itempom.Itemattributeyesclick(driver).click();
            Thread.sleep(3000);
            
            
            //Clicking on the element selected 
            Itempom.Itemattribuetgroupclick(driver).click();
            
            //Entering the value in attributelist field
            Itempom.Itemattribuetvalueenter(driver).sendKeys("jhgdh");
            
            //Clicking on 'Save' button
            System.out.println("clicking on save");
            Itempom.ItemattribuetSave(driver).click();
            Thread.sleep(3000);
            
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
	}
	@Test(priority=6)
    public void VerifyselectAttribute() throws Exception  {
		try
		{
			//Getting and Comparing the value of attribute list field
			String createdlistvalue = Itempom.Itemattribuetvalueenter(driver).getAttribute("value");
			System.out.println("Selected value for Attribute list feild :" +createdlistvalue );
			String errormessage1 = "Attribute feild not matching";
			Assert.assertEquals("jhgdh", createdlistvalue,errormessage1);
			System.out.println("Attribute feild  matching ");	
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
    }
	@Test(priority=7)
	public void UpdateSelectAttribute() throws Exception {
		
		try
		{
			//Entering the value in attributelist field
			Itempom.Itemattribuetvalueenter(driver).clear();
			Itempom.Itemattribuetvalueenter(driver).sendKeys("attribute");
            
            //Clicking on 'Save' button
            
            Itempom.ItemattribuetSave(driver).click();
            Itempom.ItemattribuetSave(driver).click();
            Thread.sleep(3000);
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
	}
	@Test(priority=7)
    public void VerifyupdateselectAttribute() throws Exception  {
		try
		{
			//Getting and Comparing the value of attribute list field
			 Thread.sleep(3000);
	            
	           
	          //clicking on attribute section in recipe
	           // Recipepom.RecipeAttributesectionclick(driver).click();
	            
			String createdlistvalue1 = Itempom.Itemattribuetvalueenter(driver).getAttribute("value");
			System.out.println("Selected value for Attribute list feild :" +createdlistvalue1 );
			String errormessage1 = "Attribute feild not matching";
			Assert.assertEquals("attribute", createdlistvalue1,errormessage1);
			System.out.println("Attribute feild  matching ");	
			
			//Scrolling to Recipe section
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Itempom.Addcross(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
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
	@Test(priority=8) 
	 public void delete()throws Exception  {
		
			
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
	            
	            ResultSet rs2 = st.executeQuery("select * from attributedata where attributeid = (select attributeid from attribute where attributename=" +"'"+Attriname+"')");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs2.next()) {
	                System.out.println(rs2.getString(1) + " | "+rs2.getString(2) );
	            }
	         // close the result set
	            rs2.close();
	       
	            int rs3=st.executeUpdate("delete from attributedata where attributeid = (select attributeid from attribute where attributename="+"'"+Attriname+"')");
	            
	            ResultSet rs4 = st.executeQuery("select * from attribute where attributename= " +"'"+Attriname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs4.next()) {
	                System.out.println(rs4.getString(1) + " | "+rs4.getString(2) );
	            }
	         // close the result set
	            rs4.close();
	       
	            int rs5=st.executeUpdate("delete from attribute where attributename=" +"'"+Attriname+"'");
	            
	            
 
	            
	            ResultSet rs6 = st.executeQuery("select * from attributegroup where attributegroupname= " +"'"+Attributename+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs6.next()) {
	                System.out.println(rs6.getString(1) + " | "+rs6.getString(3) );
	            }
	         // close the result set
	            rs6.close();
	       
	            int rs7=st.executeUpdate("delete from attributegroup where attributegroupname=" +"'"+Attributename+"'");
	            
      
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


