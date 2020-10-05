package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Recipepom;

public class RecipeComment extends loginbase{
	
	public String recipename;
	public String recipetype;
	public String recipestatus;
	public String EffectiveDate;
	public String InactiveDate;
	public String Description;
	public XSSFWorkbook wb;
	public XSSFSheet sheet2;
	
	@Test(priority=1)
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
			Thread.sleep(3000);
			
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
		     WebElement Element = Recipepom.Recipecommentsection(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
			//Clicking on Comment section
            Recipepom.Recipecommentsection(driver).click();
			Thread.sleep(3000);
			
			//Entering data into Comment textfield
			Recipepom.Recipecommenttextfield(driver).sendKeys("Comment sent");
			Thread.sleep(3000);
			
			//Entering data into Comment textfield
			Recipepom.Recipecommentsavebutton(driver).click();
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
          WebElement Element = Recipepom.Recipecommenttextfieldverify(driver);
         js.executeScript("arguments[0].scrollIntoView();",Element);
         Thread.sleep(3000); 
   
			//Getting and Comparing Comment text field value 
	    	String Recipecommenttextfield = Recipepom.Recipecommenttextfieldverify(driver).getText();
	    	System.out.println("Created Recipe Comment Value :" +Recipecommenttextfield );
	    	String errormessage1 = "Recipe Comment Value is not matching";
	    	Assert.assertEquals("Comment sent",Recipecommenttextfield,errormessage1);
	    	System.out.println("Recipe Comment Value is matching "); 
	    	
	    	//Scroll up
		     WebElement Element1 = Recipepom.Recipename(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element1);
			
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
	
	@Test(priority=4) 
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
