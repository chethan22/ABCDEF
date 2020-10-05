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
import POM.Batchespom;
import POM.Itempom;
import POM.Parameterpom;
import POM.Recipepom;

public class Batchcreation extends loginbase{
	
	public static String Typedropdown;
	public static String Description1;
	public static String Effectivedate;
	public static String Inactivedate;
	public static String statusdropdown;
	public static CharSequence ItemName;
	public XSSFWorkbook wb;
	public XSSFSheet sheet2;
	
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
	public String childsecname;
	public String childistable;
	public String childdesc;
	public String childtype;
	
	public CharSequence ParName;
	public String ParType;
	public String ParStatus;
	public String ParBaseUOM;
	public String EffectiveDate1;
	public String ParInactiveDate;
	public String ParDescription;
	public String ParDataType;
	public String ParLabel;
	public String versioncaption;
	public String versiondatafromat;
	public String versionstepnolabel;
	public String Paraneterstepno;
	public String Paranetersortno;
	public String versionDataentry;
	public String versionDefaultuom;
	public String Paraneterversionstart;
	public String Paraneterversionend;
	private String Batchno;
	private String parentBatchno;
	private String Batchversionno;
	private String Batchtemplate;
	private String Batchtype;
	private String assignedto;
	
	@Test(priority=1)
	 public void createItem()throws Exception  {
			
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			 
			  try {	
			        File src=new File(loginbase.Filepath);
			        FileInputStream fis=new FileInputStream(src);

			         wb=new XSSFWorkbook(fis);
			        sheet2=wb.getSheetAt(1);
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
				        
						Itempom.saveClick(driver).click();
						System.out.println("Saved successfully");
						Reporter.log("Item saved successfully");
						Thread.sleep(4000);
						
						//Close the Item 
						WebElement closeadd = Itempom.Addcross(driver);
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						executor.executeScript("arguments[0].click();", closeadd);
						Thread.sleep(1000);

						
					wb.close();					
			        }		 
			    	                    
			    catch(Exception e)
			            {
			            	System.out.println(e.getMessage());
			            } 
				
		}
	@Test(priority=2)
    public void createRecipe() throws Exception  {
		try
		{
			
			 sheet2=wb.getSheetAt(6);
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
			Recipepom.RecipeItem(driver).sendKeys(ItemName);
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
		    
//		    //Enter Recipe child section type
//		    Recipepom.Recipeparentsectiontype(driver).sendKeys(childtype);
		    Thread.sleep(3000);
		    
		    //Enter section type
		    Recipepom.Recipechildparentdropdown(driver).sendKeys(Parentsecname);
		    Thread.sleep(3000);
		   
		    //Click on update button
		    Recipepom.SectionUpdate(driver).click();
		    System.out.println("---- Recipe Child section saved successfully----");
		    
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
	
	@Test(priority=3)
    public void createParameter()throws Exception  {
		   WebDriverWait wait = new WebDriverWait(driver, 500);
		   
		   sheet2=wb.getSheetAt(5);
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
            
            Cell cell19 = sheet2.getRow(i).getCell(18);
            Cell cell20 = sheet2.getRow(i).getCell(19);
            Cell cell21 = sheet2.getRow(i).getCell(20);
            Cell cell22 = sheet2.getRow(i).getCell(21);
            Cell cell23 = sheet2.getRow(i).getCell(22);
            Cell cell24 = sheet2.getRow(i).getCell(23);
            Cell cell25 = sheet2.getRow(i).getCell(24);
            Cell cell26 = sheet2.getRow(i).getCell(25);
            Cell cell27 = sheet2.getRow(i).getCell(26);
            
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
            //getting update Parameter Name 
	          
            //getting Parameter Version Caption
            versioncaption=cell19.getStringCellValue();
            System.out.println("Parameter Version Caption: "+versioncaption);
            //getting Parameter Version Data Format
            versiondatafromat=cell20.getStringCellValue();
            System.out.println("Parameter Version Data Format: "+versiondatafromat);
            //getting Parameter Version  Stepno Label
            versionstepnolabel=cell21.getStringCellValue();
            System.out.println("Parameter Version Stepno Label: "+versionstepnolabel);
            //getting Parameter Version Sort no
            double  Paraneterstepno1=cell22.getNumericCellValue();
            int Paraneterstepno01=(int) Paraneterstepno1;
            Paraneterstepno = Integer.toString(Paraneterstepno01);
            System.out.println("Parameter Version Stepno: "+Paraneterstepno);
            //getting Parameter Version Sortnumber
            double  Paranetersortno1=cell23.getNumericCellValue();
            int Paranetersortno01=(int) Paranetersortno1;
            Paranetersortno = Integer.toString(Paranetersortno01);
            System.out.println("Parameter Version Sortnumber: "+Paranetersortno);
            //getting Parameter Version Dataentry Instructions
            versionDataentry=cell24.getStringCellValue();
            System.out.println("Parameter Version Dataentry Instructions: "+versionDataentry);
            //getting Parameter Version Default Uom
            versionDefaultuom=cell25.getStringCellValue();
            System.out.println("Parameter Version Default Uom: "+versionDefaultuom);
            //getting Parameter Version Start 
            double  Paraneterversionstart01=cell26.getNumericCellValue();
            int Paraneterversionstart1=(int) Paraneterversionstart01;
            Paraneterversionstart = Integer.toString(Paraneterversionstart1);
            System.out.println("Parameter Version Start: "+Paraneterversionstart);
            //Getting Parameter Version End 
            double  Paraneterend1=cell27.getNumericCellValue();
            int Paraneterend01=(int) Paraneterend1;
            Paraneterversionend = Integer.toString(Paraneterend01);
            System.out.println("Parameter Version End: "+Paraneterversionend);
   
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
        System.out.println("---------------Parameter Saved Successfully------------------");
        Thread.sleep(3000);
        
      //Scroll to Parameter sections 
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = Parameterpom.Parameterversionsection(driver);
	    js.executeScript("arguments[0].scrollIntoView();",Element);
        Thread.sleep(3000);
		
        //Click on Versions
        Parameterpom.Parameterversionsection(driver).click();
        
        //Clicking on versions ADD button
        Parameterpom.Parameterversionaddbutton(driver).click();
        
        //Clicking on  ExpandAll
        Parameterpom.ParameterversionExpandalllink(driver).click();
        Thread.sleep(3000);
        
        //Entering value in Caption 
        Parameterpom.ParameterversionCaption(driver).sendKeys(versioncaption);
        
        //Entering value in DataFormat 
        Parameterpom.ParameterversionDateformat(driver).sendKeys(versiondatafromat);
        
        //Selecting value in DataFormat
        Parameterpom.ParameterversionDateformatselect(driver).click();
        
        //Entering value in Stepno Label
        Parameterpom.ParameterversionStepnolabel(driver).sendKeys(versionstepnolabel);
        
        //Entering value in Step No
        Parameterpom.ParameterversionStepno(driver).sendKeys(Paraneterstepno);
        
        //Entering value in Sort No
        Parameterpom.ParameterversionSortno(driver).sendKeys(Paranetersortno);
        
         //Entering value in Dataentry Instructions
        Parameterpom.ParameterversiondataentryInstructions(driver).sendKeys(versionDataentry);
        
        //Entering value in Default Uom
        Parameterpom.ParameterversionBaseUOM(driver).sendKeys(versionDefaultuom);
        
        //Selecting value in Default Uom
        Parameterpom.ParameterversionSelectBaseUOM(driver).click();
        
      //Scroll to Parameter sections 
		
	    WebElement Element1 = Parameterpom.Parameterversionstart(driver);
	    js.executeScript("arguments[0].scrollIntoView();",Element1);
       
        
        //Entering value in Version Start
        Parameterpom.Parameterversionstart(driver).sendKeys(Paraneterversionstart);
        
        //Entering value in Version End 
        Parameterpom.Parameterversionend(driver).sendKeys(Paraneterversionend);
        Thread.sleep(3000);
        
        //Enter parameter effective date
      //  WebElement effective = Parameterpom.Parametereffectivedate(driver);
        
      
        
        //Clicking on Save Version button
        Parameterpom.ParameterSaveversionbutton(driver).click();
        Thread.sleep(3000);
        System.out.println("-------------Parameter Version created ----------");
     
        
        
       //Clicking on sections tab in parameter 
        Parameterpom.Parametersections(driver).click();
        
      //Clicking on Parameter Sections  Add button 
        Parameterpom.ParametersectionsAddbutton(driver).click();
       
      //Entering value in Recipe section field 
        Parameterpom.ParametersectionsRecipe(driver).sendKeys(recipename);
        Parameterpom.ParametersectionsRecipe(driver).sendKeys(Keys.ENTER);
      //Selecting Recipe 
        //Parameterpom.ParametersectionsRecipeselect(driver).click();
        Thread.sleep(3000);
        
        driver.findElement(By.id("sectionParameterEditForm")).click();
        WebElement Element2 = Parameterpom.ParametersectionsRecipesection(driver);
        
        wait.until(ExpectedConditions.elementToBeClickable(Element2)); 
        
        //Entering value in Sections field
      Parameterpom.ParametersectionsRecipesection(driver).sendKeys(childsecname);
      Parameterpom.ParametersectionsRecipesection(driver).sendKeys(Keys.ENTER); 
      
      //Selecting Recipe 
       // Parameterpom.ParametersectionsRecipesectionselect(driver).click();
         Thread.sleep(3000);
	    
         WebElement effective1 = Parameterpom.Parametereffectivedate(driver);
         List<WebElement> inputs11 = driver.findElements(By.tagName("input"));

         for (WebElement input1 : inputs11) {
             ((JavascriptExecutor) driver).executeScript(
                         "arguments[0].removeAttribute('readonly','readonly')",input1);
         }
         effective.clear();
         
      //Entering version number
      Parameterpom.Parametersectionsversionstart(driver).sendKeys("1");
		   Thread.sleep(3000);
		   
       //Clicking on 'Save' button
         Parameterpom.ParametersectionsSavebutton(driver).click();
         Thread.sleep(3000);
         
         
       //Clicking on attribute section in recipe
         Parameterpom.ParameterTagsclick(driver).click();
         
         // Enter/Select the tag 
         Parameterpom.ParameterTagsfielddropdowm(driver).sendKeys("MFG");
         Parameterpom.ParameterTagsfielddropdowm(driver).sendKeys(Keys.ENTER);  
         
         Parameterpom.Parametersections(driver).click();
         Parameterpom.ParameterTagsclick(driver).click();
         
         //Clicking on 'Save' button
         WebElement button = Parameterpom.ParameterTagsSave(driver);
         js.executeScript("arguments[0].click();", button);
         Thread.sleep(3000);
        }
    
    }
	@Test(priority=4)
    public void createbatch()throws Exception  {
		WebDriverWait wait = new WebDriverWait(driver,300);
		   
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		   sheet2=wb.getSheetAt(7);
        int rowcount=sheet2.getLastRowNum();
        System.out.println("Total Row:  " + rowcount);
        
        for(int i=1;i<rowcount+1;i++) 
        {
        	
      // GET CELL
        Cell cell1 = sheet2.getRow(i).getCell(0); 
        Cell cell2 = sheet2.getRow(i).getCell(1); 
        Cell cell3 = sheet2.getRow(i).getCell(2); 
        Cell cell4 = sheet2.getRow(i).getCell(3); 
        Cell cell5 = sheet2.getRow(i).getCell(4); 
        Cell cell6 = sheet2.getRow(i).getCell(5); 
        
 
        //getting Batch#
        Batchno= cell1.getStringCellValue();
        System.out.println("Batchno: "+Batchno);
        //Getting Parent batch 
        parentBatchno= cell2.getStringCellValue();
        System.out.println("Parent Batch number: "+parentBatchno);
        //Getting Version Number
        double  versionno=cell3.getNumericCellValue();
        int versionno01=(int) versionno;
        Batchversionno = Integer.toString(versionno01);
        System.out.println("Batch Version number: "+Batchversionno);
        //Getting Templates
        Batchtemplate= cell4.getStringCellValue();
        System.out.println("Batch Template : "+Batchtemplate);
        //Getting Batch Type
        Batchtype= cell5.getStringCellValue();
        System.out.println("Batch Type: "+Batchtype);
        //Getting Assigned To
        assignedto= cell6.getStringCellValue();
        System.out.println("Assigned To: "+assignedto);
        	
        	//Clicking on Batches
        	Batchespom.Batchesclick(driver).click();
        	
        	//Clicking on Batches plus button
        	Batchespom.Batchesplusbutton(driver).click();
        	
          	//Selecting recipe
            Batchespom.Batchesselectrecipe(driver).click();
        	
        	//Clicking on select Recipe 
        	Batchespom.Batchesselectrecipevalue(driver).click();
        	
        	
		    //Entering Batch number
		    Batchespom.Batchesbatchnumber(driver).sendKeys(Batchno);
		    
		    //Entering Parent batch
		    Batchespom.Batchesparentbatch(driver).sendKeys(parentBatchno);
		    
		    //Entering Version number
		    Batchespom.Batchesversionno(driver).sendKeys(Batchversionno);
		    
		    //Entering templates 
		    Batchespom.Batchestemplates(driver).click();
		    driver.findElement(By.xpath("//li[contains(text(),'"+Batchtemplate+"')]")).click();
		    
		    Thread.sleep(3000);
		   // Batchespom.Batchestemplates(driver).sendKeys(Keys.ENTER);
		    
		    //Entering type 
		   Batchespom.Batchestype(driver).click();
		    driver.findElement(By.xpath("//li[contains(text(),'"+Batchtype+"')]")).click();
		    Thread.sleep(3000);

		    
		    //Entering assigned to
		    Batchespom.Batchesassignedto(driver).click();
		    driver.findElement(By.xpath("//li[contains(text(),'"+assignedto+"')]")).click();
		    Thread.sleep(3000);

		    
		    //Clicking on Save button
		    Batchespom.Batchcreationsave(driver).click();
		    
		    //Clicking on Release batch
		    Batchespom.Batchcreationreleasebatchbutton(driver).click();
		    
		    //Clicking on cross 
		    WebElement closeadd = Batchespom.Batchesaddcross(driver);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", closeadd);
			Thread.sleep(1000);
		    
		    //Entering value in search
		   Batchespom.BatchesSearch(driver).sendKeys(Batchno); 
		    Batchespom.BatchesSearch(driver).sendKeys(Keys.ENTER);
		    
		    //Clicking on Batch for Data Entery mode
		    Batchespom.Batchesdataentry(driver).click();
		    Thread.sleep(6000);
		    
		  //  driver.switchTo().alert().accept();
  
		    
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
	            
	            //Deleting batch section
	            //int rs1=
	            		st.executeUpdate("delete from batchdatasection where batchid=(select batchid from batch where batchno="+"'"+Batchno+"')");
	            
	            //Deleteing Batch data
	            //int rs2=
	            		st.executeUpdate("delete from batchdata where parameterid=(select parameterid from parameter where parametername="+"'"+ParName+"')");
	  
	            //Deleting Batch
	            //int rs3=
	            		st.executeUpdate("delete  from batch where recipeid=(select recipeid from recipe where recipename="+"'"+recipename+"')");
	            
	            //Deleting parameter section
	  			//int rs4=
	            		st.executeUpdate("delete from parametersection where parameterid= ( select parameterid from parameter where parametername= " +"'"+ParName+"')");

	  		    //Deleting parameter Version
	  			//int rs5=
	  					st.executeUpdate("delete from parameterversion where parameterid = ( select parameterid from parameter where parametername= " +"'"+ParName+"')");
	  			
	  			//Deleting parameter 
	  			 //int rs6=
	  					st.executeUpdate("delete from parameter where parametername=" +"'"+ParName+"'");

	  			//Delete Recipe section
	  					st.executeUpdate("delete from recipesection where recipeid=(select recipeid from recipe where recipename='TSTRecipe01')");
		            
		        //Delete Recipe 
	  					st.executeUpdate("delete from recipe where recipename=" +"'"+recipename+"'");
		           
		       //Delete Item 
	  					st.executeUpdate("delete from item where itemname=" +"'"+ItemName+"'");
		        
   
		            //close the statement
		            st.close();
		            //close the database connection
		            db.close();
		            
		          //Clicking on Batches
		        	Batchespom.Batchesclick(driver).click();
		        	
		        	//Seraching deleted batch and Verify
		        	Batchespom.BatchesSearch(driver).sendKeys(Batchno); 
				    Batchespom.BatchesSearch(driver).sendKeys(Keys.ENTER);

				    String Batchdata = Batchespom.getBatch(driver).getText();
					System.out.println("Batch data: " +Batchdata);
					String errormessage1 = "Batch exists";
					Assert.assertNotEquals(Batchno, Batchdata,errormessage1);
					System.out.println("----Batch deleted------ "); 								
					
					 wb1.close();
		            
	            
		   }
	    catch(Exception e)
       {
   	     System.out.println(e.getMessage());
       } 
	}
}
