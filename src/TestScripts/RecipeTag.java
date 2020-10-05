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
import POM.Recipepom;
import POM.Tagpom;

public class RecipeTag extends loginbase {
	
	public static CharSequence Tagname;
	public String caption;
	public String TargetObjName;
	public String TagType;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public String Taglistname;
	public String   Taglistsort1;
	public String Taglistcaption;
	public String recipename;
	public String recipetype;
	public String recipestatus;
	public String EffectiveDate1;
	public String InactiveDate1;
	public String Description1;


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
	            
//	            //Clicking on hide toggle button
//	           WebElement Hideclick = Tagpom.HideTogglebutton(driver);
//	            JavascriptExecutor executor = (JavascriptExecutor) driver;
//				executor.executeScript("arguments[0].click();", Hideclick);
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
	
	@Test(priority=3)
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
    public void selectTag() throws Exception  {
		try
		{
			//Scrolling to Recipe section
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Recipepom.RecipeTagsclick(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
            //Clicking on attribute section in recipe
            Recipepom.RecipeTagsclick(driver).click();
            
            //Enter/Select the tag 
           Recipepom.RecipeTagsfielddropdowm(driver).sendKeys(Taglistname);
           Recipepom.RecipeTagsfielddropdowm(driver).sendKeys(Keys.ENTER);            
           Recipepom.RecipeTagsclick(driver).click();
        
            
            //Clicking on 'Save' button
            Recipepom.RecipeTagsSave(driver).click();
            Thread.sleep(3000);
            
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
			String createdlistvalue = Recipepom.RecipeTagsverify(driver).getText();
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
            Recipepom.RecipeTagsclick(driver).click();
            Thread.sleep(5000);
			 
         //Update tag dropdown 
            Recipepom.RecipeTagsdeselect(driver).click();
            Thread.sleep(3000);
             
             //Clicking on 'Save' button
             Recipepom.RecipeTagsSave(driver).click();
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
			String createdlistvalue = Recipepom.RecipeTagsdeselectverify(driver).getText();
			System.out.println("Selected value for Tag group:" +createdlistvalue );
			String errormessage1 = "Tag group not matching";
			Assert.assertNotEquals(Taglistname, createdlistvalue,errormessage1);
			System.out.println("Tag group list matching ");	
		}
		catch(Exception e)
	       {
	   	     System.out.println(e.getMessage());
	       } 
    }
}
