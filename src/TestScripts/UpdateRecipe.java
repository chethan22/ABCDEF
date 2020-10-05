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
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Recipepom;

public class UpdateRecipe extends loginbase {
	
	public String recipename;
	public String recipetype;
	public String recipestatus;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public String updaterecipename;
	public String updaterecipetype;
	public String updaterecipestatus;
	public String updateEffectiveDate;
	public String updateInactiveDate;
	public String updateDescription;
	public String Parentsecname;
	public String Parentseqno1;
	public String Parentistable;
	public String Parentdesc;
	public String Parenttype;
	public String childtseqno1;
	public String childsecname;
	public String childistable;
	public String childdesc;
	public String childtype;
	public String Updatechildtype;
	public String Updatechilddesc;
	public String Updatechildistable;
	public String Updatechildtseqno1;
	public String UpdateParentdesc;
	public String Updatechildsecname;
	public String UpdateParenttype;
	public String UpdateParentseqno1;
	public String UpdateParentistable;
	public String UpdateParentsecname;

	@Test(priority=1)
    public void RecipeExcel()throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 File src=new File(loginbase.Filepath);
     FileInputStream fis=new FileInputStream(src);

     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sheet2=wb.getSheetAt(6);
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
         Cell cell11= sheet2.getRow(1).getCell(10);
         Cell cell12 = sheet2.getRow(1).getCell(11);
         Cell cell14 = sheet2.getRow(1).getCell(12); 
         Cell cell15 = sheet2.getRow(1).getCell(13); 
         Cell cell16 = sheet2.getRow(1).getCell(14); 
         Cell cell17 = sheet2.getRow(1).getCell(15); 
         Cell cell18 = sheet2.getRow(1).getCell(16); 
         Cell cell19 = sheet2.getRow(1).getCell(17); 
         Cell cell20 = sheet2.getRow(1).getCell(18); 
         Cell cell21 = sheet2.getRow(1).getCell(19); 
         Cell cell22 = sheet2.getRow(1).getCell(20); 
         Cell cell23 = sheet2.getRow(1).getCell(21); 
        // Cell cell24 = sheet2.getRow(1).getCell(22); 
         Cell cell25 = sheet2.getRow(1).getCell(23);
         Cell cell26 = sheet2.getRow(1).getCell(24);
         Cell cell27 = sheet2.getRow(1).getCell(25);
         Cell cell28 = sheet2.getRow(1).getCell(26);
         Cell cell29 = sheet2.getRow(1).getCell(27);
         Cell cell30 = sheet2.getRow(1).getCell(28);
         Cell cell31 = sheet2.getRow(1).getCell(29);
         Cell cell32 = sheet2.getRow(1).getCell(30);
         Cell cell33 = sheet2.getRow(1).getCell(31);
         Cell cell34 = sheet2.getRow(1).getCell(32);
         
         
         //getting Recipe Name
         recipename=cell1.getStringCellValue();
         System.out.println("Recipe Name: "+recipename);
         //getting Recipe Type
         recipetype=cell2.getStringCellValue();
         System.out.println("Recipe Type: "+recipetype);
         //getting Recipe Status
         recipestatus=cell3.getStringCellValue();
         System.out.println("Recipe Status: "+recipestatus);
         //getting Effective Date
         EffectiveDate=cell4.getStringCellValue();
         System.out.println("Effective Date: "+EffectiveDate);
         //getting Inactive Date 
         InactiveDate=cell5.getStringCellValue();
         System.out.println("Inactive Date: "+InactiveDate);
         //getting description
         Description=cell6.getStringCellValue();
         System.out.println("Description: "+Description);
         //getting Updated recipe name
         updaterecipename=cell7.getStringCellValue();
         System.out.println("update Recipe Name: "+updaterecipename);
         //getting Updated Recipe Type
         updaterecipetype=cell8.getStringCellValue();
         System.out.println("Recipe Type: "+updaterecipetype);
         //getting Updated Recipe Status
         updaterecipestatus=cell9.getStringCellValue();
         System.out.println("Recipe Status: "+updaterecipestatus);
         //getting Updated Effective Date
         updateEffectiveDate=cell10.getStringCellValue();
         System.out.println("Effective Date: "+updateEffectiveDate);
         //getting Updated Inactive Date 
         updateInactiveDate=cell11.getStringCellValue();
         System.out.println("Inactive Date: "+updateInactiveDate);
         //getting Updated description
         updateDescription=cell12.getStringCellValue();
         System.out.println("Description: "+updateDescription);
       //getting Parent section name
         Parentsecname=cell14.getStringCellValue();
         System.out.println("Parent section name:"+Parentsecname);
         //getting Parent seq no
         double  Parentseqno=cell15.getNumericCellValue();
         int Parentseqno01=(int) Parentseqno;
         Parentseqno1 = Integer.toString(Parentseqno01);
         System.out.println("Parent seq no: "+Parentseqno1);
         //getting parent is Table 
         Parentistable=cell16.getStringCellValue();
         System.out.println("Parent isTable:"+Parentistable);
         //getting Parent description
         Parentdesc=cell17.getStringCellValue();
         System.out.println("Parent Description:"+Parentdesc);
         //getting Parent Section Type
         Parenttype=cell18.getStringCellValue();
         System.out.println("ParentType:"+Parenttype);
         //getting child section name
         childsecname=cell19.getStringCellValue();
         System.out.println("child section name:"+childsecname);
         //getting child seq no
         double  childseqno=cell20.getNumericCellValue();
         int childseqno01=(int) childseqno;
         childtseqno1 = Integer.toString(childseqno01);
         System.out.println("child seq no: "+childtseqno1);
         //getting child istable 
         childistable=cell21.getStringCellValue();
         System.out.println("child isTable:"+childistable);
         //getting child description
         childdesc=cell22.getStringCellValue();
         System.out.println("child Description:"+childdesc);
         //getting child Section Type
         childtype=cell23.getStringCellValue();
         System.out.println("child Type:"+childtype);
         
       //getting Updated Parent section name
         UpdateParentsecname=cell25.getStringCellValue();
         System.out.println("Parent section name:"+UpdateParentsecname);
         //getting Updated Parent seq no
         double  UpdateParentseqno=cell26.getNumericCellValue();
         int UpdateParentseqno01=(int) UpdateParentseqno;
         UpdateParentseqno1 = Integer.toString(UpdateParentseqno01);
         System.out.println("Parent seq no: "+UpdateParentseqno1);
         //getting Updated parent is Table 
         UpdateParentistable=cell27.getStringCellValue();
         System.out.println("Parent isTable:"+UpdateParentistable);
         //getting  Updated Parent description
         UpdateParentdesc=cell28.getStringCellValue();
         System.out.println("Parent Description:"+UpdateParentdesc);
         //getting Updated Parent Section Type
         UpdateParenttype=cell29.getStringCellValue();
         System.out.println("ParentType:"+UpdateParenttype);
         //getting Updated child section name
         Updatechildsecname=cell30.getStringCellValue();
         System.out.println("child section name:"+Updatechildsecname);
         //getting Updated child seq no
         double  Updatechildseqno=cell31.getNumericCellValue();
         int Updatechildseqno01=(int) Updatechildseqno;
         Updatechildtseqno1 = Integer.toString(Updatechildseqno01);
         System.out.println("child seq no: "+Updatechildtseqno1);
         //getting Updated child istable 
         Updatechildistable=cell32.getStringCellValue();
         System.out.println("child isTable:"+Updatechildistable);
         //getting Updated child description
         Updatechilddesc=cell33.getStringCellValue();
         System.out.println("child Description:"+Updatechilddesc);
         //getting Updated child Section Type
         Updatechildtype=cell34.getStringCellValue();
         System.out.println("child Type:"+Updatechildtype);
         
         
         
        wb.close();
     }
	@Test(priority=2)
    public void createRecipe() throws Exception  {
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
			
			 //Entering value in the Effective date field
	        WebElement effective = Recipepom.Recipeeffectivedate(driver);
	        List<WebElement> inputs = driver.findElements(By.tagName("input"));

	        for (WebElement input1 : inputs) {
	            ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].removeAttribute('readonly','readonly')",input1);
	        }
	        effective.clear();
	        effective.sendKeys(EffectiveDate);
			
			
			//Entering value in Description
			Recipepom.RecipeDescription(driver).sendKeys(Description);
			
			//Enter inactive date
			WebElement inactive = Recipepom.Recipeinctivedate(driver);
			List<WebElement> inputs1 = driver.findElements(By.tagName("input"));

	        for (WebElement input1 : inputs1) {
	            ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].removeAttribute('readonly','readonly')",input1);
	        }
			inactive.sendKeys(InactiveDate);
			inactive.click();
			Thread.sleep(3000);
		
			//Clicking on Save button
			Recipepom.Recipesave(driver).click();
			System.out.println("----Recipe saved successfully----");
			
			
		}
	    catch(Exception e)
       {
   	     System.out.println(e.getMessage());
       } 
	}
	
	@Test(priority=3)
    public void updateRecipe() throws Exception  {
		try
		{			
			//Enter Recipe Name
			WebElement Recipename = Recipepom.Recipename(driver);
			Recipename.clear();
			Recipename.sendKeys(updaterecipename);
			
			//Enter Recipe Type
			Recipepom.Recipetype(driver).sendKeys(updaterecipetype);
			Recipepom.Recipetypeselect(driver).click();
			
			//Enter Recipe Status 
			Recipepom.Recipestatus(driver).sendKeys(updaterecipestatus);
			Recipepom.Recipestatusselect(driver).click();
			
			
			
			 //Entering value in the Effective date field
	        WebElement effective = Recipepom.Recipeeffectivedate(driver);
	        List<WebElement> inputs = driver.findElements(By.tagName("input"));

	        for (WebElement input1 : inputs) {
	            ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].removeAttribute('readonly','readonly')",input1);
	        }
	        effective.clear();
	        effective.sendKeys(updateEffectiveDate);
			
			
			//Entering value in Description
	        WebElement updateDescription1 = Recipepom.RecipeDescription(driver);
	        updateDescription1.clear();
	        updateDescription1.sendKeys(updateDescription);
			
			//Enter inactive date
			WebElement inactive = Recipepom.Recipeinctivedate(driver);
			List<WebElement> inputs1 = driver.findElements(By.tagName("input"));

	        for (WebElement input1 : inputs1) {
	            ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].removeAttribute('readonly','readonly')",input1);
	        }
			inactive.sendKeys(updateInactiveDate);
			inactive.click();
			Thread.sleep(3000);
		
			//Clicking on Save button
			Recipepom.Recipesave(driver).click();
			System.out.println("----Recipe updated successfully----");
			
			
		}
	    catch(Exception e)
       {
   	     System.out.println(e.getMessage());
       } 
	}
	@Test(priority=4)
    public void VerifyRecipe()throws Exception  {
		
		try
		{
			
		//Comparing Recipe name
		String createdRecipename = Recipepom.Recipename(driver).getAttribute("value");
		System.out.println("Selected value for Recipe name:" +createdRecipename );
		String errormessage1 = "RecipeName not matching";
		Assert.assertEquals(updaterecipename, createdRecipename,errormessage1);
		System.out.println("RecipeName  matching ");
		
		//Comparing TypeDropdown		
		String selectedTypedropdown1 = Recipepom.Recipetypeselected(driver).getText();
		System.out.println("Selected value for Type Dropdown is::" +selectedTypedropdown1);
		String errormessage2 = "Type not matching";
		Assert.assertEquals(updaterecipetype, selectedTypedropdown1,errormessage2);
		System.out.println("Type matching ");
		
		//Comparing StatusDropdown  
		String SelectedStatusdropdown1=Recipepom.RecipeStatusselected(driver).getText();
		System.out.println("Selected value for Status Dropdown is::" +SelectedStatusdropdown1 );
		String errormessage3 = "Status  not matching";
		Assert.assertEquals(updaterecipestatus, SelectedStatusdropdown1,errormessage3);
		System.out.println("Status matching ");
		
//		//Comparing EffectiveDate
//		String effectiveDate= Recipepom.Recipeeffectivedate(driver).getAttribute("value");
//		System.out.println("Selected value for EffectiveDate is::"+ effectiveDate);
//		String errormessage4 = "effectiveDate  not matching";
//		Assert.assertEquals(updateEffectiveDate, effectiveDate,errormessage4);
//		System.out.println("effectiveDate matching ");
//		
//		//Comparing InactiveDate
//		String inactiveDate=Recipepom.Recipeinctivedateselected(driver).getAttribute("value");
//		System.out.println("Selected value for inactiveDate is::" +inactiveDate);
//		String errormessage5 = "inctiveDate  not matching";
//		Assert.assertEquals(updateInactiveDate, inactiveDate,errormessage5);
//		System.out.println("inctiveDate matching ");
		
		//Comparing Description
		String description1=Recipepom.RecipeDescription(driver).getAttribute("value");
		System.out.println("Selected value for description is::" +description1);
		String errormessage6 = " description not matching";
		Assert.assertEquals(updateDescription, description1,errormessage6);
		Reporter.log("description  matching ");
		System.out.println("Description matching ");
		
		
		
	  }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 		
	}
	@Test(priority=5)
	public void CreateRecipeparentsection() throws Exception {
		try
		{

			//Scrolling to Recipe section
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Recipepom.RecipeparentAddclick(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(1000);
            
		    
		    //Click on Parent '+ ADD ' button
            Recipepom.RecipeparentAddclick(driver).click();
          
		    
		    //Enter Recipe section name
		    Recipepom.Recipeparentsectionname(driver).sendKeys(Parentsecname);
		    
		    //Enter Recipe Seq no.
		    Recipepom.Recipeparentseqno(driver).sendKeys(Parentseqno1);
		    
		    //Enter Recipe Is Table 
		    Recipepom.Recipeparentistable(driver).sendKeys(Parentistable);
		    
		    //Enter Recipe Description
		    Recipepom.Recipeparentdescription(driver).sendKeys(Parentdesc);
		    
		    //Enter section type
		    Recipepom.Recipeparentsectiontype(driver).sendKeys(Parenttype);
		   
		    //Click on update button
		    Recipepom.SectionUpdate(driver).click();
		    System.out.println("---- Recipe Parent section saved successfully----");
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	@Test(priority=6)
	public void UpdateRecipeparentsection() throws Exception {
		try
		{

//			//Scrolling to Recipe section
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		     WebElement Element = Recipepom.RecipeparentAddclick(driver);
//		    js.executeScript("arguments[0].scrollIntoView();",Element);
//            Thread.sleep(1000);
            
		    //Seraching for existing Recipe Parent
			Recipepom.Recipesearchbox(driver).sendKeys(Parentsecname);
			Recipepom.Recipesearchbox(driver).sendKeys(Keys.ENTER);
			
			//Clicking on Existing recipe parent 
			WebElement clickrecipe = Recipepom.Recipeparentclick(driver);
			Actions act = new Actions(driver);
		    act.doubleClick(clickrecipe).build().perform();
		    Thread.sleep(3000);
          
		    
		    //Enter Recipe section name
		    Recipepom.Recipeparentsectionname(driver).clear();
		    Recipepom.Recipeparentsectionname(driver).sendKeys(UpdateParentsecname);
		    
		    //Enter Recipe Seq no.
		    Recipepom.Recipeparentseqno(driver).clear();
		    Recipepom.Recipeparentseqno(driver).sendKeys(UpdateParentseqno1);
		    
		    //Enter Recipe Is Table 
		    Recipepom.Recipeparentistable(driver).sendKeys(UpdateParentistable);
		    
		    //Enter Recipe Description
		    Recipepom.Recipeparentdescription(driver).clear();
		    Recipepom.Recipeparentdescription(driver).sendKeys(UpdateParentdesc);
		    
		    //Enter section type
		    Recipepom.Recipeparentsectiontype(driver).clear();
		    Recipepom.Recipeparentsectiontype(driver).sendKeys(UpdateParenttype);
		   
		    //Click on update button
		    Recipepom.SectionUpdate(driver).click();
		    System.out.println("---- Recipe Parent section Updated successfully----");
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	
	@Test(priority=7)
	public void verifyupdateparentsection()
	{
		try
		{
			Recipepom.Recipesearchbox(driver).clear();
			Recipepom.Recipesearchbox(driver).sendKeys(UpdateParentsecname);
			Recipepom.Recipesearchbox(driver).sendKeys(Keys.ENTER);
			
			WebElement clickrecipe = Recipepom.Recipeparentclick(driver);
			Actions act = new Actions(driver);
		    act.doubleClick(clickrecipe).build().perform();
		    Thread.sleep(3000);
		    
		    
			//Getting and Comapring the value of Parent section name
			String createdRecipesecname = Recipepom.Recipeparentsectionname(driver).getAttribute("value");
			System.out.println("Selected value for Parent section name:" +createdRecipesecname );
			String errormessage1 = "Update Parent Section Name not matching";
			Assert.assertEquals(UpdateParentsecname, createdRecipesecname,errormessage1);
			System.out.println("Update Parent Section Name  matching ");	
			
			//Gettimg and Comparing the value of Parent seq no
			String createdparentsepno = Recipepom.Recipeparentseqno(driver).getAttribute("value");
			System.out.println("Selected value for Parent section name:" +createdparentsepno );
			String errormessage2 = "Update Parent Sequnce number is not matching";
			Assert.assertEquals(UpdateParentseqno1, createdparentsepno,errormessage2);
			System.out.println("Update Parent Sequnce number  matching ");
			
			
//			//Gettimg and Comparing the value of Parent Is Table
//			String createdparentistable = Recipepom.Recipeparentistableget(driver).getText();
//			System.out.println("Selected value for Parent Is Table:" +createdparentistable );
//			String errormessage3 = "Parent Is table is not matching";
//			Assert.assertEquals(Parentistable, createdparentistable,errormessage3);
//			System.out.println("Parent Is table  matching ");
			

			//Gettimg and Comparing the value of Parent Description
			String createdparentdesc = Recipepom.Recipeparentdescription(driver).getAttribute("value");
			System.out.println("Selected value for Parent Description:" +createdparentdesc );
			String errormessage4 = "Update Parent Description is not matching";
			Assert.assertEquals(UpdateParentdesc, createdparentdesc,errormessage4);
			System.out.println("Update Parent Description  matching ");
			
			//Gettimg and Comparing the value of Parent Section Type
			String createdparentsectiontype = Recipepom.Recipeparentsectiontype(driver).getAttribute("value");
			System.out.println("Selected value for Parent Section Type:" +createdparentsectiontype );
			String errormessage5 = "Update Parent Section Type is not matching";
			Assert.assertEquals(UpdateParenttype, createdparentsectiontype,errormessage5);
			System.out.println("Update Parent Section Type  matching ");
			
			//Clicking on parent section Cancel button
			Recipepom.Recipecancelclick(driver).click();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	@Test(priority=8)
	public void CreateRecipechildsection() throws Exception {
		try
		{
			
			//Clicking on the child section tab
			Recipepom.Recipechildsectionclick(driver).click();
			
			//Clicking on child section "+Add" button
			Recipepom.RecipechildAdd(driver).click();
			
			 //Enter Recipe child section name
		    Recipepom.Recipechildsectionname(driver).sendKeys(childsecname);
		    
		    //Enter Recipe child Seq no.
		    Recipepom.Recipechildseqno(driver).sendKeys(childtseqno1);
		    
		    //Enter Recipe child Is Table 
		    Recipepom.Recipechildistable(driver).sendKeys(childistable);
		  
		    
		    //Enter Recipe child Description
		    Recipepom.Recipechilddescription(driver).sendKeys(childdesc);
		    
//		    //Enter Recipe child section type
//		    Recipepom.Recipeparentsectiontype(driver).sendKeys(childtype);
		    Thread.sleep(3000);
		    
		    //Enter section type
		    Recipepom.Recipechildparentdropdown(driver).sendKeys(Parentsecname);
		    Thread.sleep(3000);
		   
		    //Click on update button
		    Recipepom.SectionUpdate(driver).click();
		    System.out.println("---- Recipe Child section saved successfully----");
			
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	
	@Test(priority=9)
	public void  UpdateRecipechildsection() throws Exception {
		try
		{
			
//			//Clicking on the child section tab
//			Recipepom.Recipechildsectionclick(driver).click();
//			
//			//Clicking on child section "+Add" button
//			Recipepom.RecipechildAdd(driver).click();
			
			Recipepom.Recipechildsearchbox(driver).sendKeys(childsecname);
			Recipepom.Recipechildsearchbox(driver).sendKeys(Keys.ENTER);
			
			WebElement clickrecipe = Recipepom.Recipechildclick(driver);
			Actions act = new Actions(driver);
		    act.doubleClick(clickrecipe).build().perform();
		    Thread.sleep(3000);
			
			 //Enter Recipe child section name
		    Recipepom.Recipechildsectionname(driver).clear();
		    Recipepom.Recipechildsectionname(driver).sendKeys(Updatechildsecname);
		    
		    //Enter Recipe child Seq no.
		    Recipepom.Recipechildseqno(driver).clear();
		    Recipepom.Recipechildseqno(driver).sendKeys(Updatechildtseqno1);
		    
		    //Enter Recipe child Is Table 
		    Recipepom.Recipechildistable(driver).sendKeys(Updatechildistable);
		  
		    
		    //Enter Recipe child Description
		    Recipepom.Recipechilddescription(driver).clear();
		    Recipepom.Recipechilddescription(driver).sendKeys(Updatechilddesc);
		    
//		    //Enter Recipe child section type
//		    Recipepom.Recipeparentsectiontype(driver).sendKeys(Updatechildtype);
		    Thread.sleep(3000);
		    
		    //Enter section type
		    Recipepom.Recipechildparentdropdown(driver).sendKeys(UpdateParentsecname);
		    
		   
		    //Click on update button
		    Recipepom.SectionUpdate(driver).click();
		    System.out.println("---- Recipe Child section Updated successfully----");
		    Thread.sleep(3000);
		    Recipepom.Recipechildsearchbox(driver).clear();
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	@Test(priority=10)
	public void verifyupdatedchildsection()
	{
		try
		{
			
			Thread.sleep(3000);
			Recipepom.Recipechildsearchbox(driver).sendKeys(Updatechildsecname);
			Recipepom.Recipechildsearchbox(driver).sendKeys(Keys.ENTER);
			
			WebElement clickrecipe = Recipepom.Recipechildclick(driver);
			Actions act = new Actions(driver);
		    act.doubleClick(clickrecipe).build().perform();
		    Thread.sleep(3000);
		    
		    
			//Getting and Comapring the value of child section name
			String createdRecipesecname = Recipepom.Recipechildsectionname(driver).getAttribute("value");
			System.out.println("Selected value for child section name:" +createdRecipesecname );
			String errormessage1 = "child Section Name not matching";
			Assert.assertEquals(Updatechildsecname, createdRecipesecname,errormessage1);
			System.out.println("child Section Name  matching ");	
			
			//Gettimg and Comparing the value of child seq no
			String createdchildsepno = Recipepom.Recipechildseqno(driver).getAttribute("value");
			System.out.println("Selected value for child section name:" +createdchildsepno );
			String errormessage2 = "child Sequnce number is not matching";
			Assert.assertEquals(Updatechildtseqno1, createdchildsepno,errormessage2);
			System.out.println("child Sequnce number  matching ");
			
			//Gettimg and Comparing the value of Child Description
			String createdChilddesc = Recipepom.Recipechilddescription(driver).getAttribute("value");
			System.out.println("Selected value for Parent Description:" +createdChilddesc );
			String errormessage4 = "Child Description is not matching";
			Assert.assertEquals(Updatechilddesc, createdChilddesc,errormessage4);
			System.out.println("Child Description  matching ");
			
//			//Gettimg and Comparing the value of Child Section Type
//			String createdchildsectiontype = Recipepom.Recipeparentsectiontype(driver).getAttribute("value");
//			System.out.println("Selected value for Parent Section Type:" +createdchildsectiontype );
//			String errormessage5 = "Child Section Type is not matching";
//			Assert.assertEquals(childtype, createdchildsectiontype,errormessage5);
//			System.out.println("Child Section Type  matching ");
			
			
			//Getting and Comparing the value of Child section Parent dropdown
			String createdchildparentdropdown= Recipepom.Recipechildsectionselected(driver).getAttribute("value");
			System.out.println("Selected value for Parent Section Type:" +createdchildparentdropdown );
			String errormessage6 = "Child Section Parent is not matching";
			Assert.assertEquals(UpdateParentsecname, createdchildparentdropdown,errormessage6);
			System.out.println("Child Section Parent  matching ");
			
			//Clicking on Child section Cancel button
			Recipepom.Recipechildcancelclick(driver).click();
			Thread.sleep(3000);
			
			//Scroll up
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     WebElement Element = Recipepom.Recipename(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
			
			//Close the Recipe 
			WebElement closeadd = Recipepom.Addcross(driver);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", closeadd);
			Thread.sleep(1000);
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	
	
	
	@Test(priority=12) 
	 public void deleterecipe()throws Exception  {
		
			
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
	            // execute the query on database recipesection
	            
	            ResultSet rs4 = st.executeQuery("select * from recipesection where recipesectionname=" +"'"+Updatechildsecname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs4.next()) {
	                System.out.println(rs4.getString(1) + " | "+rs4.getString(2) );
	            }
	         // close the result set
	            rs4.close();
	       
	            int rs7=st.executeUpdate("delete from recipesection where recipesectionname=" +"'"+Updatechildsecname+"'");
	            
	            
	            ResultSet rs1 = st.executeQuery("select * from recipesection where recipesectionname=" +"'"+UpdateParentsecname+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs1.next()) {
	                System.out.println(rs1.getString(1) + " | "+rs1.getString(2) );
	            }
	         // close the result set
	            rs1.close();
	       
	            int rs2=st.executeUpdate("delete from recipesection where recipesectionname=" +"'"+UpdateParentsecname+"'");
	            
	            
	            ResultSet rs = st.executeQuery("select * from recipe where recipename=" +"'"+updaterecipename+"'");
	            System.out.println("Data retrieved from the PostgreSQL database ");
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + " | "+rs.getString(3) );
	            }
	         // close the result set
	            rs.close();
	       
	            int rs3=st.executeUpdate("delete from recipe where recipename=" +"'"+updaterecipename+"'");
	            
	            //close the statement
	            st.close();
	            //close the database connection
	            db.close();
	           
	            Recipepom.searchBox(driver).clear();
	            Recipepom.searchHit(driver).click();
	            Recipepom.searchBox(driver).sendKeys(updaterecipename);
				Recipepom.searchHit(driver).click();
				Thread.sleep(3000);
				
				        	String searchrecipe1 = Recipepom.getrecipename(driver).getText();
							System.out.println("searched recipe: " +searchrecipe1);
							String errormessage1 = "Recipe exists";
							Assert.assertNotEquals(updaterecipename, searchrecipe1,errormessage1);
							System.out.println("-----Recipe deleted------ "); 								
							 
							 wb1.close();
		   }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     }
	}

	
}
