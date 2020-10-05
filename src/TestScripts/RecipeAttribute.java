package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Attributepom;
import POM.Recipepom;

public class RecipeAttribute extends loginbase{
	
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
	public String recipename;
	public String recipetype;
	public String recipestatus;
	public String EffectiveDate1;
	public String InactiveDate1;
	public String Description1;
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
		dropdown1.sendKeys("Recipe Master");
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
    public void createRecipe() throws Exception  {
	
		 File src=new File(loginbase.Filepath);
	     FileInputStream fis=new FileInputStream(src);

	 XSSFWorkbook wb1=new XSSFWorkbook(fis);
     XSSFSheet sheet2=wb1.getSheetAt(6);
     //System.out.println(wb);
     int rowcount1=sheet2.getLastRowNum();
     System.out.println("Total Row:  " + rowcount1);
     
         //GET CELL
         Cell cell111 = sheet2.getRow(1).getCell(0); 
         Cell cell222 = sheet2.getRow(1).getCell(1); 
         Cell cell333 = sheet2.getRow(1).getCell(2); 
         Cell cell444 = sheet2.getRow(1).getCell(3); 
         Cell cell555= sheet2.getRow(1).getCell(4); 
         Cell cell666 = sheet2.getRow(1).getCell(5); 
         
         
       //getting Recipe Name
         recipename=cell111.getStringCellValue();
         System.out.println("Recipe Name: "+recipename);
         //getting Recipe Type
         recipetype=cell222.getStringCellValue();
         System.out.println("Recipe Type: "+recipetype);
         //getting Recipe Status
         recipestatus=cell333.getStringCellValue();
         System.out.println("Recipe Status: "+recipestatus);
         //getting Effective Date
         EffectiveDate=cell444.getStringCellValue();
         System.out.println("Effective Date: "+EffectiveDate);
         //getting Inactive Date 
         InactiveDate=cell555.getStringCellValue();
         System.out.println("Inactive Date: "+InactiveDate);
         //getting description
         Description=cell666.getStringCellValue();
         System.out.println("Description: "+Description);
		try
		{
		
			//Clicking  on Recipe in side nav bar
			Recipepom.Recipeclick(driver).click();
			
			//Clicking on '+' button
			Recipepom.Recipeplusclick(driver).click();
			
			//Enter Recipe Name
			Recipepom.Recipename(driver).sendKeys(recipename);
			
			//Enter Recipe Type
			Recipepom.Recipetype(driver).sendKeys(recipetype);
			Recipepom.Recipetypeselect(driver).click();
			
			//Enter Recipe Status 
			Recipepom.Recipestatus(driver).sendKeys(recipestatus);
			Recipepom.Recipestatusselect(driver).click();
			
			// Enter/Select Item name
			Recipepom.RecipeItem(driver).sendKeys("TSTItem");
			Recipepom.RecipeItemselect(driver).click();
			        
		
			//Clicking on Save button
			Recipepom.Recipesave(driver).click();
			System.out.println("----Recipe saved successfully----");
			
			
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
		     WebElement Element = Recipepom.RecipeAttributesectionclick(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
            //clicking on attribute section in recipe
            Recipepom.RecipeAttributesectionclick(driver).click();
            
            
            //Clicking on '+' button 
            Recipepom.RecipeAttributeclickplus(driver).click();
            js.executeScript("window.scrollBy(0,200)");
            
            //Entering the value in dropdown feild
            Recipepom.RecipeAttributedropdown(driver).sendKeys(caption);
           
            //Selecting the dropdown value
            Recipepom.RecipeAttributedropdownselect(driver).click();
            
            //Clicking on 'Yes' button
            Recipepom.RecipeAttributeaddclick(driver).click();
            Thread.sleep(3000);
            
            
            //Clicking on the element selected 
            Recipepom.RecipeAttributeclickElemented(driver).click();
            
            //Entering the value in attributelist field
            Recipepom.RecipeAttributelistfield(driver).sendKeys("jhgdh");
            
            //Clicking on 'Save' button
            System.out.println("clicking on save");
            Recipepom.RecipeAttributeSave(driver).click();
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
			String createdlistvalue = Recipepom.RecipeAttributelistfield(driver).getAttribute("value");
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
			Recipepom.RecipeAttributelistfield(driver).clear();
            Recipepom.RecipeAttributelistfield(driver).sendKeys("attribute");
            
            //Clicking on 'Save' button
            System.out.println("clicking on save/update");
            
            Recipepom.RecipeAttributeSave(driver).click();
            Recipepom.RecipeAttributeSave(driver).click();
            Thread.sleep(3000);
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
	}
	@Test(priority=6)
    public void VerifyupdateselectAttribute() throws Exception  {
		try
		{
			//Getting and Comparing the value of attribute list field
			 Thread.sleep(3000);
			 

	            //Clicking on the element selected 
	            Recipepom.RecipeAttributeclickElemented(driver).click();
	            
	            driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//li[4]//a[1]")).click();
	          //clicking on attribute section in recipe
	            Recipepom.RecipeAttributesectionclick(driver).click();
	            
	            
	            
			String createdlistvalue1 = Recipepom.RecipeAttributelistfield(driver).getAttribute("value");
			System.out.println("Selected value for Attribute list feild :" +createdlistvalue1 );
			String errormessage1 = "Attribute feild not matching";
			Assert.assertEquals("jhgdh", createdlistvalue1,errormessage1);
			System.out.println("Attribute feild  matching ");	
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
    }
	
}