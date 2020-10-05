package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Itempom;
import POM.Tagpom;

public class CreateTag extends loginbase{
	
	public static CharSequence Tagname;
	public static String caption;
	public String TargetObjName;
	public String TagType;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public String Taglistname;
	public String   Taglistsort1;
	public String Taglistcaption;

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
	            dropdown1.sendKeys(TargetObjName);
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
	            
	            //Clicking on hide toggle button
	           WebElement Hideclick = Tagpom.HideTogglebutton(driver);
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", Hideclick);
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
    public void VerifyTaggroup()throws Exception  {

	try {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	            
//	          //Click on Tag in the side bar
//	            Tagpom.Tagclick(driver).click();
//	            
//	          //Entering data in SearchBox
//	            Tagpom.searchBox(driver).sendKeys(Tagname);
//	        
//	          //Search Hit 
//	            Tagpom.searchhit(driver).click();
//	            Thread.sleep(3000);	
//	        	
//	        	Tagpom.Taggrouplistclick(driver).click();
	        	
	        	System.out.println("----------------TAG GROUP VERIFICATION--------------");
	         //Get and Comparing Tag group caption
	        	String createdcaption = Tagpom.Caption(driver).getAttribute("value");
	        	System.out.println("craeted value for caption :" +createdcaption );
	        	String errormessage1 = "Caption is not matching";
	        	Assert.assertEquals(caption, createdcaption,errormessage1);
	        	System.out.println("Caption is matching ");
	        
	        //Get and Comparing Tag group Name
	        	String createdName = Tagpom.TagName(driver).getAttribute("value");
	        	System.out.println("craeted value for Name :" +createdName );
	        	String errormessage2 = "Name is not matching";
	        	Assert.assertEquals(Tagname, createdName,errormessage2);
	        	System.out.println("Name is matching ");
	        	
	        //Get and Comparing Tag Group Target Obj name 
	        	String Targetobjnamedropdown = Tagpom.selectedtargetobjdropdown(driver).getText();
	        	System.out.println("Selected value for Target obj name  Dropdown :" +Targetobjnamedropdown);
	        	String errormessage3 = "Target Obj name  is not matching";
	        	Assert.assertEquals(TargetObjName, Targetobjnamedropdown,errormessage3);
	        	System.out.println("Target Obj name  is  matching ");
	        	
	        //Get and Comparing Tag Group Tag Type
	        	String Tagtypedropdown = Tagpom.selectedtagtypedropdown(driver).getText();
	        	System.out.println("Selected value for Tag Type Dropdown :" +Tagtypedropdown);
	        	String errormessage4 = "Tag Type is not matching";
	        	Assert.assertEquals(TagType, Tagtypedropdown,errormessage4);
	        	System.out.println("Tag Type is  matching ");
	        
	       //Get and Comparing Tag Group EffectiveDate
	        	String effectiveDate= Tagpom.EffectiveDate(driver).getAttribute("value");
	        	System.out.println("Selected value for EffectiveDate is::"+ effectiveDate);
	        	String errormessage5 = "effectiveDate  not matching";
	        	Assert.assertEquals(EffectiveDate, effectiveDate,errormessage5);
	        	System.out.println("effectiveDate matching ");
	        	
	        //Get and Comparing Tag Group InactiveDate
	        	String inactiveDate=Tagpom.InactiveDate(driver).getAttribute("value");
	        	System.out.println("Selected value for inactiveDate is::" +inactiveDate);
	        	String errormessage6 = "InctiveDate  not matching";
	        	Assert.assertEquals(InactiveDate, inactiveDate,errormessage6);
	        	System.out.println("InctiveDate matching ");
	}
	 catch(Exception e)
  {
  	System.out.println(e.getMessage());
  }  
  }
	
	
	@Test(priority=3)
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
        Tagpom.TaglistDescription(driver).sendKeys(Description);  
			        
         //Click on Save in Tag List 
         Tagpom.TaglistSave(driver).click();
         Thread.sleep(5000);
         System.out.println("--------Tag List Saved successfully-------------");
		
		
	}
	catch(Exception e)
	  {
	  	System.out.println(e.getMessage());
	  }  
	}
	
	@Test(priority=4)
    public void verifyTaglist()throws Exception  {

	try {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	
    	System.out.println("------------------TAG LIST VERIFICATION----------------");
		
     	JavascriptExecutor js = (JavascriptExecutor) driver;
//         WebElement Element = driver.findElement(By.xpath("//app-add-edit-taggroup//div//div//tabset//ul//li"));
//        js.executeScript("arguments[0].scrollIntoView();",Element );
        
        
    //Entering search text
        Tagpom.taglistsearchbox(driver).sendKeys(Taglistcaption);
        
        //Search Hit 
        Tagpom.taglistsearchhit(driver).click();
        
        //Select taglist caption listed
       WebElement clickcaption = Tagpom.taglistselect(driver);
        Actions act = new Actions(driver);
        act.doubleClick(clickcaption).build().perform();
       // act.moveToElement(driver.findElement(By.xpath("//*[@id=\"Grid_content_table\"]/tbody/tr"))).doubleClick().build().perform();
        
       
        
      //Get and Comparing Tag List Caption 
        String createdlistcaption = Tagpom.TaglistCaption(driver).getAttribute("value");
    	System.out.println("craeted value for caption :" +createdlistcaption );
    	String errormessage1 = "List Caption is not matching";
    	Assert.assertEquals(Taglistcaption, createdlistcaption,errormessage1);
    	System.out.println("List Caption is matching ");
    
     //Get and Comparing Tag List Name
        String createdlistname = Tagpom.TaglistName(driver).getAttribute("value");
    	System.out.println("craeted value for Name :" +createdlistname );
    	String errormessage2 = "List Name is not matching";
    	Assert.assertEquals(Taglistname, createdlistname,errormessage2);
    	System.out.println("List Name is matching ");
      
    //Get and Comparing Tag List Sort 
        String createdlistsort = Tagpom.TaglistSort(driver).getAttribute("value");
    	System.out.println("craeted value for Sort Number  :" +createdlistsort );
    	String errormessage3 = "List sort number is not matching";
    	Assert.assertEquals(Taglistsort1, createdlistsort,errormessage3);
    	System.out.println("List sort number is matching ");
    	
    //Get and Comparing Tag List Effective date
        String createdlistEffectivedate = Tagpom.TaglistEffectivedate(driver).getAttribute("value");
    	System.out.println("craeted value for Effective Date :" +createdlistEffectivedate );
    	String errormessage4 = "List Effective Date is not matching";
    	Assert.assertEquals(EffectiveDate, createdlistEffectivedate,errormessage4);
    	System.out.println("List Effective Date is matching ");
    	
    //Get and Comparing Tag List Inactive date
        String createdlisInactivedate = Tagpom.TaglistInactivedate(driver).getAttribute("value");
    	System.out.println("craeted value for Inactive Date :" +createdlisInactivedate );
    	String errormessage5 = "List Inactive Date is not matching";
    	Assert.assertEquals(InactiveDate, createdlisInactivedate,errormessage5);
    	System.out.println("List Inactive Date is matching ");
    
   //Get and comapre Tag List Description
    	String createdlisDescription = Tagpom.TaglistDescription(driver).getAttribute("value");
    	System.out.println("craeted value for Inactive Date :" +createdlisDescription );
    	String errormessage6 = "List Description is not matching";
    	Assert.assertEquals(Description, createdlisDescription,errormessage6);
    	System.out.println("List Description is matching ");
    	Thread.sleep(3000);	
    	
    	//Click on Attribute list close icon (pop-up)
    	 Tagpom.Taglistclose(driver).click();
	        Thread.sleep(3000);
    	
    	 js.executeScript("scroll(0, -250);");
	        Thread.sleep(3000);
	        
	     //Click on add attribute close
	     WebElement closeadd = Tagpom.Addcross(driver);
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
	 public void deleteTag()throws Exception  {
		
			
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
	            ResultSet rs = st.executeQuery("select * from tag where tagname=" +"'"+Taglistname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
	            }
	         // close the result set
	            rs.close();
	       
	            int rs1=st.executeUpdate("delete from tag where tagname=" +"'"+Taglistname+"'");
	            
	            
	            ResultSet rs2 = st.executeQuery("select * from taggroup where taggroupname=" +"'"+Tagname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs2.next()) {
	                System.out.println(rs2.getString(1) + " | "+rs2.getString(2) );
	            }
	         // close the result set
	            rs2.close();
	       
	            int rs3=st.executeUpdate("delete from taggroup where taggroupname=" +"'"+Tagname+"'");
	            
	            //close the statement
	            st.close();
	            //close the database connection
	            db.close();
	           
				
				
				//Entering data in SearchBox
	            Tagpom.searchBox(driver).sendKeys(Tagname);
	        
	          //Search Hit 
	            Tagpom.searchhit(driver).click();
	            Thread.sleep(3000);	       	
        	
				 
				        	String searchItem1 = Tagpom.Taggroupsearctext(driver).getText();
							System.out.println("searched Tag: " +searchItem1);
							String errormessage1 = "Tag exists";
							Assert.assertNotEquals(Tagname, searchItem1,errormessage1);
							System.out.println(" ------Tag group is  deleted------ "); 
				         
							Tagpom.searchBox(driver).clear();
							Tagpom.searchhit(driver).click(); 
							 
							 wb1.close();
		   }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     }
	}
}
	
