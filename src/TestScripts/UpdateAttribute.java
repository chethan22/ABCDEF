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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Attributepom;
import POM.Tagpom;

public class UpdateAttribute extends loginbase {
	
	public static CharSequence Attributename;
	public String caption;
	public String TargetObjName;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public static String Attricaption;
	public String Attriname;
	public String Attritype;
	public static String Attridataformat;
	public String Attrieffectivedate;
	public String Attriinactivedate;
	private CharSequence updatecaption;
	private CharSequence updateInactiveDate;
	private CharSequence updateEffectiveDate;
	private CharSequence updateTargetObjName;
	private CharSequence updateAttributename;
	private String updateDescription;
	public static String updateAttricaption;
	public String updateAttriname;
	public String updateAttritype;
	public static String updateAttridataformat;
	public String updateAttrieffectivedate;
	public String updateAttriinactivedate;
	
	@Test(priority=1)
    public void AttributeExcel()throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 File src=new File(loginbase.Filepath);
     FileInputStream fis=new FileInputStream(src);

     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sheet2=wb.getSheetAt(4);
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
         Cell cell13 = sheet2.getRow(1).getCell(12); 
         Cell cell14 = sheet2.getRow(1).getCell(13); 
         Cell cell15 = sheet2.getRow(1).getCell(14); 
         Cell cell16 = sheet2.getRow(1).getCell(15); 
         Cell cell17 = sheet2.getRow(1).getCell(16); 
         Cell cell18 = sheet2.getRow(1).getCell(17); 
         Cell cell19 = sheet2.getRow(1).getCell(18);
         Cell cell20 = sheet2.getRow(1).getCell(19);
         Cell cell21 = sheet2.getRow(1).getCell(20);
         Cell cell22 = sheet2.getRow(1).getCell(21);
         Cell cell23 = sheet2.getRow(1).getCell(22);
         Cell cell24 = sheet2.getRow(1).getCell(23);
        
         
         
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
         Attriinactivedate=cell12.getStringCellValue();
         System.out.println("Attribute list caption: "+Attriinactivedate);
       //getting Attribte group updated caption  
         updatecaption=cell13.getStringCellValue();
         System.out.println("Update Caption: "+updatecaption);
         //getting Attribte group updated Name
         updateAttributename=cell14.getStringCellValue();
         System.out.println("Update Attribute Name: "+updateAttributename);
         //getting Attribte group updated Target Obj Name
         updateTargetObjName=cell15.getStringCellValue();
         System.out.println("Update Target Obj Name: "+updateTargetObjName);
         //getting Attribte group updated Effective Date
         updateEffectiveDate=cell16.getStringCellValue();
         System.out.println("Update Effective Date: "+updateEffectiveDate);
         //getting Attribte group updated Inactive Date 
         updateInactiveDate=cell17.getStringCellValue();
         System.out.println("Update Inactive Date: "+updateInactiveDate);
         //getting Attribte group updated description
         updateDescription=cell18.getStringCellValue();
         System.out.println("Description: "+updateDescription);
         //getting Attribte List updated caption
         updateAttricaption=cell19.getStringCellValue();
         System.out.println("Attribute list caption: "+updateAttricaption);
         //getting Attribute list name
         updateAttriname=cell20.getStringCellValue();
         System.out.println("Attribute list name: "+updateAttriname);
         //getting Attribute list type
         updateAttritype=cell21.getStringCellValue();
         System.out.println("Attribute list type: "+updateAttritype);
         //getting Attribute list Data format
         updateAttridataformat=cell22.getStringCellValue();
         System.out.println("Attribute list Data Format: "+updateAttridataformat);
         //getting Attribute list Effectivedate
         updateAttrieffectivedate=cell23.getStringCellValue();
         System.out.println("Attribute list  Effectivedate: "+updateAttrieffectivedate);
       //getting Attribute list Inctivedate
         updateAttriinactivedate=cell24.getStringCellValue();
         System.out.println("Attribute list caption: "+updateAttriinactivedate);
         
//         CreateAttribute ca=new CreateAttribute();
//  		 ca.TagExcel();
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
		dropdown1.sendKeys(TargetObjName);
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
	     System.out.println("----------Attribute group is saved successfully-----------------");
		}
		 catch(Exception e)
      {
      	System.out.println(e.getMessage());
      }
	   
	}
	@Test(priority=3)
	public void UpdateAttributeGroup()throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	        try
	        {
		//Enter the value in Attribute Group Caption field
		Attributepom.Attributegroupupdatecaption(driver).clear();
		Attributepom.Attributegroupupdatecaption(driver).sendKeys(updatecaption);
		
		
		//Enter the value in Attribute Group Name field
		 WebElement Attributegroupname = Attributepom.AttributegroupName(driver);
		 Attributegroupname.clear();
		 Attributegroupname.sendKeys(updateAttributename);
		
		//select the value from Attribute Group Target Obj Name dropdown
         WebElement dropdown1 = Attributepom.AttributegroupTargetObjname(driver);
         dropdown1.clear();
		dropdown1.sendKeys(updateTargetObjName);
        dropdown1.sendKeys(Keys.ENTER);
        
		//Entering the value in Effective Date field
        WebElement effective = Attributepom.AttributegroupEffectivedate(driver);
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        effective.clear();
        effective.sendKeys(updateEffectiveDate);
        
        //Entering value in description field
        
        Attributepom.Attributegroupdescription(driver).clear();
        Attributepom.Attributegroupdescription(driver).sendKeys(updateDescription);
        
        //Entering the value in Inactive Date field
        WebElement input = Attributepom.Attributegroupinactivedate(driver);
 		  ((JavascriptExecutor) driver).executeScript(
			                         "arguments[0].removeAttribute('readonly','readonly')",input);
 		  
       		         			        
	         WebElement inactive = Attributepom.Attributegroupinactivedate(driver);
	         inactive.sendKeys(updateInactiveDate);
	         
	         
	    //Clicking on save button
	     Attributepom.AttributegroupSave(driver).click();
	     System.out.println("--------Attribute group is Updated  successfully------------");
	   
	     }
		 catch(Exception e)
       {
       	System.out.println(e.getMessage());
       } 
}
	@Test(priority=3)
	public void verifyAttributeGroup()throws Exception {		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		try {		
//		//Click on Attribute in the side bar
//		Attributepom.Attributeclick(driver).click();
//        
//      //Entering data in SearchBox
//        Attributepom.Attributegroupsearchbox(driver).sendKeys(updateAttributename);
//    
//      //Search Hit 
//        Attributepom.Attributegroupsearchhit(driver).click();
//        Thread.sleep(3000);	
//    	
//        Attributepom.Attributegrouplistclick(driver).click();
    	
    	System.out.println("--------ATTRIBUTE GROUP VERIFICATION------------");
     //Get and Comparing Attribute group caption
    	String createdcaption = Attributepom.AttributegroupCaption(driver).getAttribute("value");
    	System.out.println("craeted value for caption :" +createdcaption );
    	String errormessage1 = "Caption is not matching";
    	Assert.assertEquals(updatecaption, createdcaption,errormessage1);
    	System.out.println("Caption is matching ");
    
     //Get and Comparing Attribute group  Name
    	String createdname = Attributepom.AttributegroupName(driver).getAttribute("value");
    	System.out.println("craeted value for Name :" +createdname );
    	String errormessage2 = "Name is not matching";
    	Assert.assertEquals(updateAttributename, createdname,errormessage2);
    	System.out.println("Name is matching ");
    	
    //Get and Comparing Attribute group Target Obj Name
    	String createdtargetobjname = Attributepom.Attributegrouptypedropdown(driver).getText();
    	System.out.println("Target Obj Name value for Name :" +createdtargetobjname );
    	String errormessage3 = "Target Obj Name is not matching";
    	Assert.assertEquals(updateTargetObjName, createdtargetobjname,errormessage3);
    	System.out.println("Target Obj Name is matching ");
    
   //Get and Comparing Attribute group Effective Date 
    	String createdEffectivedate = Attributepom.AttributegroupEffectivedate(driver).getAttribute("value");
    	System.out.println("Target Obj Name value for Name :" +createdEffectivedate );
    	String errormessage4 = "Effective Date e is not matching";
    	Assert.assertEquals(updateEffectiveDate, createdEffectivedate,errormessage4);
    	System.out.println("Effective Date  is matching ");
    	
    //Get and Comparing Attribute group Inactive Date 
    	 String createdInctivedate = Attributepom.Attributegroupinactivedate(driver).getAttribute("value");
    	 System.out.println("Target Obj Name value for Name :" +createdInctivedate );
    	 String errormessage5 = "Inactive Date  is not matching";
    	 Assert.assertEquals(updateInactiveDate, createdInctivedate,errormessage5);
    	 System.out.println("Inactive Date  is matching ");
    
    //Get and Comparing Attribute group Description
    	 String createdDescription = Attributepom.Attributegroupdescription(driver).getAttribute("value");
    	 System.out.println("Target Obj Name value for Name :" +createdDescription );
    	 String errormessage6= "Description  is not matching";
    	 Assert.assertEquals(updateDescription,createdDescription,errormessage6);
    	 System.out.println("Description  is matching ");
    	 
		}
		 catch(Exception e)
        {
        	System.out.println(e.getMessage());
        } 
}
	@Test(priority=4)
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
	@Test(priority=5)
	public void UpdateAttributeList()throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    try {
//		//Scrolling to Attribute list
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	     WebElement Element = Attributepom.Attributelistscroll(driver);
//	    js.executeScript("arguments[0].scrollIntoView();",Element );
//	    Thread.sleep(3000);
	    
	  //Attribute search box
	    WebElement attributesearch = Attributepom.Attributelistsearchbox(driver);
	    attributesearch.clear();
	    attributesearch.sendKeys(Attricaption); 
	    attributesearch.sendKeys(Keys.ENTER);
	   
	    //Clicking on caption 
	    WebElement clickcaption = Attributepom.Attributelistclickcaption(driver);
	    Actions act = new Actions(driver);
        act.doubleClick(clickcaption).build().perform();
        Thread.sleep(3000);
	    
      //Updating caption column in AttibuteList 
        WebElement updateAttricaption1 = Attributepom.Attributelistcaption(driver);
        updateAttricaption1.clear();
        updateAttricaption1.sendKeys(updateAttricaption);
   	   
   	  
   	//Updating Entered value in Name of Attibute List
        WebElement updateAttriname1 = Attributepom.Attributelistname(driver);
        updateAttriname1.clear();
        updateAttriname1.sendKeys(updateAttriname);
       
      //Selecting value from type dropdown
       WebElement dropdown1 = Attributepom.Attributelistupdatetype(driver);
       dropdown1.clear();
       dropdown1.sendKeys(updateAttritype);
       
       WebElement dropselect1=Attributepom.Attributelistupdatetypeclick(driver);
       dropselect1.click();

       //Selecting value from Date format dropdown
       WebElement dropdown2 = Attributepom.Attributelistupdatedataformat(driver);
       dropdown2.sendKeys(updateAttridataformat);
       
       WebElement dropselect=Attributepom.AttributelistdataformatClick(driver);
       dropselect.click();
       
     //Enter Effective Date
       WebElement effective = Attributepom.AttributelistEffectiveDate(driver);
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        effective.clear();
        effective.sendKeys(updateEffectiveDate); 
        
      //Entering the value in the Description field 
        WebElement updatedescription = Attributepom.AttributelistDescription(driver);
        updatedescription.clear();
        updatedescription.sendKeys(updateDescription);
       
      //Entering inactive date 
        WebElement input = Attributepom.Attributelistinactive(driver);
   	  ((JavascriptExecutor) driver).executeScript(
   	                         "arguments[0].removeAttribute('readonly','readonly')",input);
     
   	// input.sendKeys(InactiveDate);
         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("arguments[0].value='"+updateInactiveDate+"';", input);
         
    
      //Click on 'Save' button
     Attributepom.AttributelistSave(driver).click();
     System.out.println("-------Attribute list is updated successfully------- ");
   	   
   	   
    }
	 catch(Exception e)
   {
   	System.out.println(e.getMessage());
   } 
    }	
	@Test(priority=6)
	public void verifyAttributeList()throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	try
	{	
//		//Scrolling to Attribute list
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    //js.executeScript("window.scrollBy(0,1000)");
//	     WebElement Element = Attributepom.Attributelistscroll(driver);
//	    js.executeScript("arguments[0].scrollIntoView();",Element );
//	    Thread.sleep(3000);
//	    
	  //Attribute search box
	    WebElement attributesearch = Attributepom.Attributelistsearchbox(driver);
	    attributesearch.clear();
	    attributesearch.sendKeys(updateAttricaption); 
	    attributesearch.sendKeys(Keys.ENTER);
	   
	    //Clicking on caption 
	    WebElement clickcaption = Attributepom.Attributelistclickcaption(driver);
	    Actions act = new Actions(driver);
        act.doubleClick(clickcaption).build().perform();
        Thread.sleep(3000);
	    
    //Get and Comparing Attribute List  Caption
   	    String createdlistcaption = Attributepom.Attributelistcaption(driver).getAttribute("value");
   	    System.out.println("created value for  Caption:" +createdlistcaption );
   	    String errormessage6= "Attribute List  Caption  is not matching";
   	    Assert.assertEquals(updateAttricaption,createdlistcaption,errormessage6);
   	    System.out.println("Attribute List  Caption  is matching ");  
    
   	  //Get and Comparing Attribute List  Name
   	    String createdlistname = Attributepom.Attributelistname(driver).getAttribute("value");
   	    System.out.println("created value for  Name:" +createdlistname );
   	    String errormessage7= "Attribute List  Name  is not matching";
   	    Assert.assertEquals(updateAttriname,createdlistname,errormessage7);
   	    System.out.println("Attribute List  Name  is matching "); 
   	   
   	//Get and Comparing Attribute List  Type
   	    String createdlisttype = Attributepom.Attributelistselectedtype(driver).getText();
   	    System.out.println("created value for Type:" +createdlisttype );
   	    String errormessage8= "Attribute List  Type  is not matching";
   	    Assert.assertEquals(updateAttritype,createdlisttype,errormessage8);
   	    System.out.println("Attribute List Type  is matching "); 
   	    
   	//Get and Comparing Attribute List DataFormat 
   	    String createdlistdataformat= Attributepom.Attributelistselecteddateformat(driver).getText();
   	    System.out.println("created value for DataFormat :" +createdlistdataformat );
   	    String errormessage9= "Attribute List  DataFormat   is not matching";
   	    Assert.assertEquals(updateAttridataformat,createdlistdataformat,errormessage9);
   	    System.out.println("Attribute List DataFormat  is matching "); 
   	   
   	    
   	//Get and Comparing Attribute List Description
   	    String createdlistdescription= Attributepom.AttributelistDescription(driver).getAttribute("value");
	    System.out.println("created value for Description :" +createdlistdescription );
	    String errormessage10= "Attribute List  Description is not matching";
	    Assert.assertEquals(updateDescription,createdlistdescription,errormessage10);
	    System.out.println("Attribute List Description is matching "); 
	    
		//Close the attribute list pop-up
	        Attributepom.Attributelistclose(driver).click();
	        Thread.sleep(3000);
	        
	      //scroll to atrributegroup 
     	   JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("scroll(0, -250);");
	        Thread.sleep(3000);
	   	     //body//app-root//ul//span[2]
	        
	        //Close Attribute add page
	        WebElement closeadd = Attributepom.Addcross(driver);
			 JavascriptExecutor executor = (JavascriptExecutor) driver;
			 executor.executeScript("arguments[0].click();", closeadd);
			 Thread.sleep(1000);
	}
	 catch(Exception e)
   {
   	System.out.println(e.getMessage());
   }  
	     
	}    
	
	@Test(priority=7) 
	 public void deleteAttribute()throws Exception  {
		
			
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
	            ResultSet rs = st.executeQuery("select * from attribute where attributename=" +"'"+updateAttriname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
	            }
	         // close the result set
	            rs.close();
	       
	            int rs1=st.executeUpdate("delete from attribute where attributename=" +"'"+updateAttriname+"'");
	            
	            
	            ResultSet rs2 = st.executeQuery("select * from attributegroup where attributegroupname=" +"'"+updateAttributename+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs2.next()) {
	                System.out.println(rs2.getString(1) + " | "+rs2.getString(2) );
	            }
	         // close the result set
	            rs2.close();
	       
	            int rs3=st.executeUpdate("delete from attributegroup where attributegroupname=" +"'"+updateAttributename+"'");
	            
	            //close the statement
	            st.close();
	            //close the database connection
	            db.close();
	           
				
				
				//Entering data in SearchBox
	            Attributepom.Attributegroupsearchbox(driver).sendKeys(updateAttributename);
	        
	          //Search Hit 
	            Attributepom.Attributegroupsearchhit(driver).click();
	            Thread.sleep(3000);	       	
      	
				 
				        	String searchItem1 = Attributepom.Attributegrouplistclick(driver).getText();
							System.out.println("searched Attribute: " +searchItem1);
							String errormessage1 = "----Attribute exists----";
							Assert.assertNotEquals(updateAttributename, searchItem1,errormessage1);
							System.out.println(" ------Attribute is  deleted------ "); 
				         
							
							 
							 wb1.close();
		   }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     }
	}
	    
}


