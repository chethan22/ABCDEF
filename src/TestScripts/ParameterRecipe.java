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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Parameterpom;
import POM.Recipepom;

public class ParameterRecipe extends loginbase {
	
	public static String recipename;
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
	public static String childsecname;
	public String childistable;
	public String childdesc;
	public String childtype;
	public XSSFWorkbook wb;
	public XSSFSheet sheet2;
	public CharSequence ParLabel;
	public CharSequence ParDescription;
	public String ParInactiveDate;
	public CharSequence ParDataType;
	public CharSequence ParBaseUOM;
	public CharSequence ParStatus;
	public CharSequence ParName;
	public CharSequence ParType;

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
	
	@Test(priority=3)
    public void createParameter()throws Exception  {
		try {
		 File src=new File(loginbase.Filepath);
	        FileInputStream fis=new FileInputStream(src);

	        XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet sheet2=wb.getSheetAt(5);
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
	            
	            //getting Parameter Name 
		           ParName=cell1.getStringCellValue();
		            System.out.println("Parameter Name: "+ParName);
		            //getting Parameter Type
		            ParType=cell2.getStringCellValue();
		            System.out.println("Parameter Type: "+ParType);
		            //getting Parameter Status 
		            ParStatus=cell3.getStringCellValue();
		            System.out.println("Target Obj Name: "+ParStatus);
		            //getting Parameter Base UOM
		            ParBaseUOM=cell4.getStringCellValue();
		            System.out.println("Parameter Base UOM: "+ParBaseUOM);
		            //getting Parameter Effective Date
		            EffectiveDate=cell5.getStringCellValue();
		            System.out.println("Effective Date: "+EffectiveDate);
		            //getting Parameter Inactive Date 
		            ParInactiveDate=cell6.getStringCellValue();
		            System.out.println("Inactive Date: "+ParInactiveDate);
		            //getting Parameter Data type
		            ParDataType=cell7.getStringCellValue();
		            System.out.println("Data type: "+ParDataType);
		            //getting Parameter description
		            ParDescription=cell8.getStringCellValue();
	                System.out.println("Description: "+ParDescription);
	                //getting  Parameter Label
	                ParLabel=cell9.getStringCellValue();
	                System.out.println("Parameter Label: "+ParLabel);
	                
		
		 //Click on Parameter in the side bar
        Parameterpom.Parameterclick(driver).click();
        
        
      //Click on '+' button in the Parameter
        Parameterpom.Parameterplusclick(driver).click();
        
        //Entering value into Name field
        Parameterpom.Parametername(driver).sendKeys(ParName);
        
      //Entering and selecting  value into Type dropdown
        Parameterpom.Parametertype(driver).sendKeys(ParType);
        Parameterpom.Parametertypeselect(driver).click();
        
      //Entering and selecting the value from Status dropdown
        Parameterpom.Parameterstatus(driver).sendKeys(ParStatus);
        Parameterpom.Parameterstatusselect(driver).click();
        
      //Entering and selecting the value from Base UOM dropdown
        Parameterpom.ParameterBaseUOM(driver).sendKeys(ParBaseUOM);
        Parameterpom.ParameterBaseUOMselect(driver).click();
        
       //Entering value in the Effective date field
        WebElement effective = Parameterpom.Parametereffectivedate(driver);
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        effective.clear();
        effective.sendKeys(EffectiveDate);
        
        
        //inctive.sendKeys(ParInactiveDate);
        
      //Entering and selecting the value from Data Type dropdown
        Parameterpom.Parameterdatatype(driver).sendKeys(ParDataType);
        Parameterpom.Parameterdatatypeselect(driver).click();
        
      //Entering value in the Inctive date field
        WebElement inctive = Parameterpom.Parameterinctivedate(driver);
        List<WebElement> inputs1 = driver.findElements(By.tagName("input"));

        for (WebElement input1 : inputs1) {
            ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].removeAttribute('readonly','readonly')",input1);
        }
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='"+ParInactiveDate+"';", inctive);
     
        
      //Entering value in Description field
        Parameterpom.Parameterdescription(driver).sendKeys(ParDescription);

      //Entering value in Lable field
        Parameterpom.Parameterlabel(driver).sendKeys(ParLabel);
        Thread.sleep(3000);
        
        //Click on Save button
        Parameterpom.ParameterSave(driver).click();
        System.out.println("Parameter Saved Successfully");
        Thread.sleep(3000);
        
     
	        }
		}
			 catch(Exception e)
	      {
	      	System.out.println(e.getMessage());
	      }

	}
	@Test(priority=4)
    public void createParametersections()throws Exception  {
//		try {
		
		WebDriverWait wait = new WebDriverWait(driver, 500);
		

			
			//Scroll to Parameter sections 
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    WebElement Element = Parameterpom.Parameterversionsection(driver);
		    js.executeScript("arguments[0].scrollIntoView();",Element);
            Thread.sleep(3000);
            
            
           //Clicking on sections tab in parameter 
            Parameterpom.Parametersections(driver).click();
            
          //Clicking on Parameter Sections  Add button 
            Parameterpom.ParametersectionsAddbutton(driver).click();
           
          //Entering value in Recipe section field 
            Parameterpom.ParametersectionsRecipe(driver).sendKeys(recipename);
            
          //Selecting Recipe 
            Parameterpom.ParametersectionsRecipeselect(driver).click();
            Thread.sleep(3000);
            
            driver.findElement(By.id("sectionParameterEditForm")).click();
            WebElement Element1 = Parameterpom.ParametersectionsRecipesection(driver);
            
            wait.until(ExpectedConditions.elementToBeClickable(Element1)); 
            
            //Entering value in Sections field
          Parameterpom.ParametersectionsRecipesection(driver).sendKeys(childsecname);
            
          
          //Selecting Recipe 
            Parameterpom.ParametersectionsRecipesectionselect(driver).click();
             Thread.sleep(3000);
		    
//		    WebElement Element1 = Parameterpom.ParametersectionsRecipesectionselect(driver);
//     	    js.executeScript("arguments[0].click();",Element1);
		    
		    
          //Entering version number
          Parameterpom.Parametersectionsversionstart(driver).sendKeys("1");
 		   Thread.sleep(3000);
 		   
           //Clicking on 'Save' button
             Parameterpom.ParametersectionsSavebutton(driver).click();
            
//		}
//		 catch(Exception e)
//     {
//     	System.out.println(e.getMessage());
//     }
  }
}
	


