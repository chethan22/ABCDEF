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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Attributepom;
import POM.Itempom;
import POM.Parameterpom;
import POM.Recipepom;

public class CreateRecipe extends loginbase {
	
	public String recipename;
	public String recipetype;
	public String recipestatus;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
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
         Cell cell24 = sheet2.getRow(1).getCell(22); 
         
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
    public void VerifyRecipe()throws Exception  {
		
		try
		{
			
		//Comparing Recipe name
		String createdRecipename = Recipepom.Recipename(driver).getAttribute("value");
		System.out.println("Selected value for Recipe name:" +createdRecipename );
		String errormessage1 = "RecipeName not matching";
		Assert.assertEquals(recipename, createdRecipename,errormessage1);
		System.out.println("RecipeName  matching ");
		
		//Comparing TypeDropdown
		String selectedTypedropdown1 = Recipepom.Recipetypeselected(driver).getText();
		System.out.println("Selected value for Type Dropdown is::" +selectedTypedropdown1);
		String errormessage2 = "Type not matching";
		Assert.assertEquals(recipetype, selectedTypedropdown1,errormessage2);
		System.out.println("Type matching ");
		
		//Comparing StatusDropdown  
		String SelectedStatusdropdown1=Recipepom.RecipeStatusselected(driver).getText();
		System.out.println("Selected value for Status Dropdown is::" +SelectedStatusdropdown1 );
		String errormessage3 = "Status  not matching";
		Assert.assertEquals(recipestatus, SelectedStatusdropdown1,errormessage3);
		System.out.println("Status matching ");
		
		
		//Comparing EffectiveDate
		String effectiveDate= Recipepom.Recipeeffectivedate(driver).getAttribute("value");
		System.out.println("Selected value for EffectiveDate is::"+ effectiveDate);
		String errormessage4 = "effectiveDate  not matching";
		Assert.assertEquals(EffectiveDate, effectiveDate,errormessage4);
		System.out.println("effectiveDate matching ");
		
		//Comparing InactiveDate
		String inactiveDate=Recipepom.Recipeinctivedateselected(driver).getAttribute("value");
		System.out.println("Selected value for inactiveDate is::" +inactiveDate);
		String errormessage5 = "inctiveDate  not matching";
		Assert.assertEquals(InactiveDate, inactiveDate,errormessage5);
		System.out.println("inctiveDate matching ");
		
		//Comparing Description
		String description1=Recipepom.RecipeDescription(driver).getAttribute("value");
		System.out.println("Selected value for description is::" +description1);
		String errormessage6 = " description not matching";
		Assert.assertEquals(Description, description1,errormessage6);
		Reporter.log("description  matching ");
		System.out.println("Description matching ");
		
//		//Close the Item 
//		WebElement closeadd = Recipepom.Addcross(driver);
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", closeadd);
//		Thread.sleep(1000);

        Thread.sleep(3000);
	  }	                
	    catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
		
		
	}
	
	@Test(priority=4)
	public void Recipeparentsection() throws Exception {
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
	@Test(priority=5)
	public void verifyparentsection()
	{
		try
		{
			
			
			Recipepom.Recipesearchbox(driver).sendKeys(Parentsecname);
			Recipepom.Recipesearchbox(driver).sendKeys(Keys.ENTER);
			
			WebElement clickrecipe = Recipepom.Recipeparentclick(driver);
			Actions act = new Actions(driver);
		    act.doubleClick(clickrecipe).build().perform();
		    Thread.sleep(3000);
		    
		    
			//Getting and Comapring the value of Parent section name
			String createdRecipesecname = Recipepom.Recipeparentsectionname(driver).getAttribute("value");
			System.out.println("Selected value for Parent section name:" +createdRecipesecname );
			String errormessage1 = "Parent Section Name not matching";
			Assert.assertEquals(Parentsecname, createdRecipesecname,errormessage1);
			System.out.println("Parent Section Name  matching ");	
			
			//Gettimg and Comparing the value of Parent seq no
			String createdparentsepno = Recipepom.Recipeparentseqno(driver).getAttribute("value");
			System.out.println("Selected value for Parent section name:" +createdparentsepno );
			String errormessage2 = "Parent Sequnce number is not matching";
			Assert.assertEquals(Parentseqno1, createdparentsepno,errormessage2);
			System.out.println("Parent Sequnce number  matching ");
			
			
//			//Gettimg and Comparing the value of Parent Is Table
//			String createdparentistable = Recipepom.Recipeparentistableget(driver).getText();
//			System.out.println("Selected value for Parent Is Table:" +createdparentistable );
//			String errormessage3 = "Parent Is table is not matching";
//			Assert.assertEquals(Parentistable, createdparentistable,errormessage3);
//			System.out.println("Parent Is table  matching ");
			

			//Gettimg and Comparing the value of Parent Description
			String createdparentdesc = Recipepom.Recipeparentdescription(driver).getAttribute("value");
			System.out.println("Selected value for Parent Description:" +createdparentdesc );
			String errormessage4 = "Parent Description is not matching";
			Assert.assertEquals(Parentdesc, createdparentdesc,errormessage4);
			System.out.println("Parent Description  matching ");
			
			//Gettimg and Comparing the value of Parent Section Type
			String createdparentsectiontype = Recipepom.Recipeparentsectiontype(driver).getAttribute("value");
			System.out.println("Selected value for Parent Section Type:" +createdparentsectiontype );
			String errormessage5 = "Parent Section Type is not matching";
			Assert.assertEquals(Parenttype, createdparentsectiontype,errormessage5);
			System.out.println("Parent Section Type  matching ");
			
			//Clicking on parent section Cancel button
			Recipepom.Recipecancelclick(driver).click();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
	     {
	       System.out.println(e.getMessage());
	     } 
	}
	
	@Test(priority=6)
	public void Recipechildsection() throws Exception {
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
	
	@Test(priority=7)
	public void verifychildsection()
	{
		try
		{
			
			
			Recipepom.Recipechildsearchbox(driver).sendKeys(childsecname);
			Recipepom.Recipechildsearchbox(driver).sendKeys(Keys.ENTER);
			
			WebElement clickrecipe = Recipepom.Recipechildclick(driver);
			Actions act = new Actions(driver);
		    act.doubleClick(clickrecipe).build().perform();
		    Thread.sleep(3000);
		    
		    
			//Getting and Comapring the value of child section name
			String createdRecipesecname = Recipepom.Recipechildsectionname(driver).getAttribute("value");
			System.out.println("Selected value for child section name:" +createdRecipesecname );
			String errormessage1 = "child Section Name not matching";
			Assert.assertEquals(childsecname, createdRecipesecname,errormessage1);
			System.out.println("child Section Name  matching ");	
			
			//Gettimg and Comparing the value of child seq no
			String createdchildsepno = Recipepom.Recipechildseqno(driver).getAttribute("value");
			System.out.println("Selected value for child section name:" +createdchildsepno );
			String errormessage2 = "child Sequnce number is not matching";
			Assert.assertEquals(childtseqno1, createdchildsepno,errormessage2);
			System.out.println("child Sequnce number  matching ");
			
			//Gettimg and Comparing the value of Child Description
			String createdChilddesc = Recipepom.Recipechilddescription(driver).getAttribute("value");
			System.out.println("Selected value for Parent Description:" +createdChilddesc );
			String errormessage4 = "Child Description is not matching";
			Assert.assertEquals(childdesc, createdChilddesc,errormessage4);
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
			Assert.assertEquals(Parentsecname, createdchildparentdropdown,errormessage6);
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
	
	
		@Test(priority=10) 
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
		            // create object for the Statement class  delete  from recipesection where recipesectionname='TST-Parent'
		            Statement st = db.createStatement();
		            // execute the query on database recipesection
		            
		            ResultSet rs4 = st.executeQuery("select * from recipesection where recipesectionname=" +"'"+childsecname+"'");
		            System.out.println("Data retrieved from the PostgreSQL database ");
		            while (rs4.next()) {
		                System.out.println(rs4.getString(1) + " | "+rs4.getString(2) );
		            }
		         // close the result set
		            rs4.close();
		       
		            int rs7=st.executeUpdate("delete from recipesection where recipesectionname=" +"'"+childsecname+"'");
		            
		            
		            ResultSet rs1 = st.executeQuery("select * from recipesection where recipesectionname=" +"'"+Parentsecname+"'");
		            System.out.println("Data retrieved from the PostgreSQL database ");
		            while (rs1.next()) {
		                System.out.println(rs1.getString(1) + " | "+rs1.getString(2) );
		            }
		         // close the result set
		            rs1.close();
		       
		            int rs2=st.executeUpdate("delete from recipesection where recipesectionname=" +"'"+Parentsecname+"'");
		            
		            
		            ResultSet rs = st.executeQuery("select * from recipe where recipename=" +"'"+recipename+"'");
		            System.out.println("Data retrieved from the PostgreSQL database ");
		            while (rs.next()) {
		                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
		            }
		         // close the result set
		            rs.close();
		       
		            int rs3=st.executeUpdate("delete from recipe where recipename=" +"'"+recipename+"'");
		            
		            //close the statement
		            st.close();
		            //close the database connection
		            db.close();
		           
		            Recipepom.searchBox(driver).clear();
		            Recipepom.searchHit(driver).click();
		            Recipepom.searchBox(driver).sendKeys(recipename);
					Recipepom.searchHit(driver).click();
					Thread.sleep(3000);
					
					        	String searchrecipe1 = Recipepom.getrecipename(driver).getText();
								System.out.println("searched recipe: " +searchrecipe1);
								String errormessage1 = "Recipe exists";
								Assert.assertNotEquals(recipename, searchrecipe1,errormessage1);
								System.out.println("-----Recipe deleted------ "); 								
								 
								 wb1.close();
			   }	                
		    catch(Exception e)
		     {
		       System.out.println(e.getMessage());
		     }
		}
  
}
