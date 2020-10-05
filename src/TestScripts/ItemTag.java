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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Itempom;
import POM.Recipepom;
import POM.Tagpom;

public class ItemTag extends loginbase {
	
	public static CharSequence Tagname;
	public String caption;
	public String TargetObjName;
	public String TagType;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public String Taglistname;
	public String Taglistsort1;
	public String Taglistcaption;
	public String recipename;
	public String recipetype;
	public String recipestatus;
	public String EffectiveDate1;
	public String InactiveDate1;
	public String Description12;
	public static String Typedropdown;
	public static String Description1;
	public static String Effectivedate;
	public static String Inactivedate;
	public static String statusdropdown;
	public static CharSequence ItemName;


	@Test(priority=1)
    public void createTaggroup()throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		try {	
	        File src=new File(loginbase.Filepath);
	        FileInputStream fis=new FileInputStream(src);

	        XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet sheet2=wb.getSheetAt(3);
	        //System.out.println(wb);
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
	            Cell cell10 = sheet2.getRow(i).getCell(9); 
	            //getting Caption
	            caption=cell1.getStringCellValue();
	            System.out.println("Caption: "+caption);
	            //getting Name
	            Tagname=cell2.getStringCellValue();
	            System.out.println("Tagname: "+Tagname);
	            //getting Target Obj Name
	            TargetObjName=cell3.getStringCellValue();
	            System.out.println("Target Obj Name: "+TargetObjName);
	            //getting Tag Type 
	            TagType=cell4.getStringCellValue();
	            System.out.println("Tag Type: "+TagType);
	            //getting Effective Date
	            EffectiveDate=cell5.getStringCellValue();
	            System.out.println("Effective Date: "+EffectiveDate);
	            //getting Inactive Date 
	            InactiveDate=cell6.getStringCellValue();
	            System.out.println("Inactive Date: "+InactiveDate);
	            //getting description
	            Description=cell7.getStringCellValue();
                System.out.println("Description: "+Description);
	            //getting Taglist caption
                Taglistcaption=cell8.getStringCellValue();
                System.out.println("Tag list caption: "+Taglistcaption);
                //getting Tag List Name
                Taglistname=cell9.getStringCellValue();
                System.out.println("Tag List Name: "+Taglistname);
              //getting Tag List Sort number
                double  Taglistsort=cell10.getNumericCellValue();
	            int Taglistsort01=(int) Taglistsort;
	            Taglistsort1 = Integer.toString(Taglistsort01);
	            System.out.println("Tag list Sort Number: "+Taglistsort1);
	            
	            //Click on Tag in the side bar
	            Tagpom.Tagclick(driver).click();
	          
	            
	            //Click on '+' button in the tag list 
	            Tagpom.TagPlus(driver).click();
	            
	            //Entering the value in caption textfield 
	            Tagpom.Caption(driver).sendKeys(caption);
	            
	            
	            //Entering the value in the name textfield
	            Tagpom.TagName(driver).sendKeys(Tagname);
	         
	            //Enter Effective Date
	            WebElement effective = Tagpom.EffectiveDate(driver);
		         List<WebElement> inputs = driver.findElements(By.tagName("input"));

		         for (WebElement input1 : inputs) {
		             ((JavascriptExecutor) driver).executeScript(
		                         "arguments[0].removeAttribute('readonly','readonly')",input1);
		         }
		         effective.clear();
		         effective.sendKeys(EffectiveDate);
	            
	            //Selecting the values from Target Obj Dropdown 
	            WebElement dropdown1 =Tagpom.TargetObjName(driver);
	            dropdown1.sendKeys("Item Master");
	            dropdown1.sendKeys(Keys.ENTER);
	          
	            //Selecting the value from Tag type dropdown 
	            WebElement dropdown2 =Tagpom.Tagtype(driver);
	            dropdown2.sendKeys(TagType);
	            dropdown2.sendKeys(Keys.ENTER);
	            
	            //Entering inactive date 
	            WebElement input = Tagpom.InactiveDate(driver);
       		  ((JavascriptExecutor) driver).executeScript(
   			                         "arguments[0].removeAttribute('readonly','readonly')",input);
       		  
	         		         			        
		         WebElement inactive = Tagpom.InactiveDate(driver);
		         inactive.sendKeys(InactiveDate);
		         
	            //Entering the value in the Description field 
	            Tagpom.Description(driver).sendKeys(Description);
	            
	            //Click on Save 
	            Tagpom.TagSave(driver).click();
	            Thread.sleep(3000);
	            System.out.println("-------------Tag Group Saved successfully--------------");	            
	        }   
		}
		 catch(Exception e)
        {
        	System.out.println(e.getMessage());
        } 	
    }
	@Test(priority=2)
    public void CreateTaglist()throws Exception  {

	try {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
          WebElement Element = driver.findElement(By.xpath("//app-add-edit-taggroup//div//div//tabset//ul//li"));
         js.executeScript("arguments[0].scrollIntoView();",Element );	
     
         //Click on "+ ADD" button in the tag list 
         Tagpom.TaglistAdd(driver).click();
       
         //Entering the TagList Caption 
         Tagpom.TaglistCaption(driver).sendKeys(Taglistcaption);
       
         
         //Entering value in TagList Name 
         Tagpom.TaglistName(driver).sendKeys(Taglistname);
         
       //Enter Effective Date
         WebElement effective1 = Tagpom.TaglistEffectivedate(driver);
	         List<WebElement> inputs1 = driver.findElements(By.tagName("input"));

	         for (WebElement input1 : inputs1) {
	             ((JavascriptExecutor) driver).executeScript(
	                         "arguments[0].removeAttribute('readonly','readonly')",input1);
	         }
	         effective1.clear();
	         effective1.sendKeys(EffectiveDate);
	         Thread.sleep(5000); 
	         
         //Entering value in Tag List Sort number field 
         Tagpom.TaglistSort(driver).sendKeys(Taglistsort1);
         Thread.sleep(3000);
      
       
	         
	         ////Entering inactive date 
	            WebElement input3 = Tagpom.TaglistInactivedate(driver);
	       		  ((JavascriptExecutor) driver).executeScript(
	   			                         "arguments[0].removeAttribute('readonly','readonly')",input3);
	       		  
		         		         			        
			         WebElement inactive2 = Tagpom.TaglistInactivedate(driver);
			         inactive2.sendKeys(InactiveDate);
	        
			  //Entering Description 
       //Tagpom.TaglistDescription(driver).sendKeys(Description12);  
			        
         //Click on Save in Tag List
			         Tagpom.TaglistSave(driver).click();
//        WebElement Element1 = Tagpom.TaglistSave(driver);
//        js.executeScript("arguments[0]..click();",Element1 );	
      
         Thread.sleep(5000);
         System.out.println("--------Tag List Saved successfully-------------");
		
		
	}
	catch(Exception e)
	  {
	  	System.out.println(e.getMessage());
	  }  
	}
	@Test(priority=3)
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
				        
				        //Clicking on Save
						Itempom.saveClick(driver).click();
						System.out.println("------------Item Saved successfully------------");
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
    public void selectTag() throws Exception  {
		try
		{
			//Scrolling to Recipe section
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Itempom.ItemTagsclick(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
            //Clicking on attribute section in recipe
            Itempom.ItemTagsclick(driver).click();
            
            //Enter/Select the tag 
            Itempom.ItemTagsfielddropdowm(driver).sendKeys(Taglistname);
            Itempom.ItemTagsfielddropdowm(driver).sendKeys(Keys.ENTER);            
          // Itempom.ItemTagsclick(driver).click();
        
            
            //Clicking on 'Save' button
           Itempom.ItemTagsSave(driver).click();
//           WebElement Element1 = Itempom.ItemTagsSave(driver);
//           js.executeScript("arguments[0]..click();",Element1 );	
            Thread.sleep(5000);
            
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
	}
	@Test(priority=6)
    public void VerifyselectTag() throws Exception  {
		try
		{
			//Getting and Comparing the value of attribute list field
			String createdlistvalue = Itempom.ItemTagsfieldverify(driver).getText();
			System.out.println("Selected value for Tag group:" +createdlistvalue );
			String errormessage1 = "Tag group not matching";
			Assert.assertEquals(Taglistname, createdlistvalue,errormessage1);
			System.out.println("Tag group list matching ");	
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
    }
	@Test(priority=7)
    public void deselectTag() throws Exception  {
		try
		{
			 //Clicking on attribute section in recipe
			Itempom.ItemTagsclick(driver).click();
            Thread.sleep(5000);
			 
         //Update tag dropdown 
            Itempom.ItemTagsdeselect(driver).click();
            Thread.sleep(3000);
             
             //Clicking on 'Save' button
            Itempom.ItemTagsSave(driver).click();
             Thread.sleep(3000);
				
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
      }
	@Test(priority=8)
    public void VerifydeselectTag() throws Exception  {
		try
		{
			//Getting and Comparing the value of attribute list field
			String createdlistvalue = Itempom.ItemTagsfieldselectverify(driver).getText();
			System.out.println("Selected value for Tag group:" +createdlistvalue );
			String errormessage1 = "Tag group not matching";
			Assert.assertNotEquals(Taglistname, createdlistvalue,errormessage1);
			System.out.println("Tag group list matching ");	
			
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
	
	@Test(priority=9) 
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
	            
	            ResultSet rs2 = st.executeQuery("select * from tagdata where tagid = (select tagid from tag where tagname=" +"'"+Taglistname+"')");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs2.next()) {
	                System.out.println(rs2.getString(1) + " | "+rs2.getString(2) );
	            }
	         // close the result set
	            rs2.close();
	       
	            int rs3=st.executeUpdate("delete from tagdata where tagid = (select tagid from tag where tagname="+"'"+Taglistname+"')");
	            
	            ResultSet rs4 = st.executeQuery("select * from tag where tagname= " +"'"+Taglistname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs4.next()) {
	                System.out.println(rs4.getString(1) + " | "+rs4.getString(2) );
	            }
	         // close the result set
	            rs4.close();
	       
	            int rs5=st.executeUpdate("delete from tag where tagname=" +"'"+Taglistname+"'");
	            
	            

	            
	            ResultSet rs6 = st.executeQuery("select * from taggroup where taggroupname= " +"'"+Tagname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs6.next()) {
	                System.out.println(rs6.getString(1) + " | "+rs6.getString(3) );
	            }
	         // close the result set
	            rs6.close();
	       
	            int rs7=st.executeUpdate("delete from taggroup where taggroupname=" +"'"+Tagname+"'");
	            
     
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
