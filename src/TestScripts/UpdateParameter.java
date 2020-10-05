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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.loginbase;
import POM.Attributepom;
import POM.Parameterpom;

public class UpdateParameter extends loginbase{
	
	
	public static CharSequence ParName;
	public String ParType;
	public String ParStatus;
	public String ParBaseUOM;
	public String EffectiveDate;
	public String ParInactiveDate;
	public String ParDescription;
	public String ParDataType;
	public String ParLabel;
	
	public CharSequence updateParName;
	public String updateParType;
	public String updateParStatus;
	public String updateParBaseUOM;
	public String updateEffectiveDate;
	public String updateParInactiveDate;
	public String updateParDataType;
	public String updateParDescription;
	public String updateParLabel;
	
	public String versioncaption;
	public String versiondatafromat;
	public String versionstepnolabel;
	public String Paraneterstepno;
	public String Paranetersortno;
	public String versionDataentry;
	public String versionDefaultuom;
	public String Paraneterversionstart;
	public String Paraneterversionend;
	
	public CharSequence updateversioncaption;
	private String updateversionstepnolabel;
	private String updateversiondatafromat;
	private String updateParaneterstepno;
	private String updateParanetersortno;
	private String updateversionDataentry;
	private String updateversionDefaultuom;
	private String updateParaneterversionstart;
	private String updateParaneterversionend;
	
	@Test(priority=1)
    public void ExcelParameter()throws Exception  {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
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
	            Cell cell10 = sheet2.getRow(i).getCell(9); 
	            Cell cell11 = sheet2.getRow(i).getCell(10); 
	            Cell cell12 = sheet2.getRow(i).getCell(11); 
	            Cell cell13 = sheet2.getRow(i).getCell(12); 
	            Cell cell14 = sheet2.getRow(i).getCell(13); 
	            Cell cell15 = sheet2.getRow(i).getCell(14); 
	            Cell cell16 = sheet2.getRow(i).getCell(15); 
	            Cell cell17 = sheet2.getRow(i).getCell(16); 
	            Cell cell18 = sheet2.getRow(i).getCell(17); 
	            
	            Cell cell19 = sheet2.getRow(i).getCell(18);
	            Cell cell20 = sheet2.getRow(i).getCell(19);
	            Cell cell21 = sheet2.getRow(i).getCell(20);
	            Cell cell22 = sheet2.getRow(i).getCell(21);
	            Cell cell23 = sheet2.getRow(i).getCell(22);
	            Cell cell24 = sheet2.getRow(i).getCell(23);
	            Cell cell25 = sheet2.getRow(i).getCell(24);
	            Cell cell26 = sheet2.getRow(i).getCell(25);
	            Cell cell27 = sheet2.getRow(i).getCell(26);
	            
	            Cell cell28 = sheet2.getRow(i).getCell(29);
	            Cell cell29 = sheet2.getRow(i).getCell(30);
	            Cell cell30 = sheet2.getRow(i).getCell(31);
	            Cell cell31 = sheet2.getRow(i).getCell(32);
	            Cell cell32 = sheet2.getRow(i).getCell(33);
	            Cell cell33 = sheet2.getRow(i).getCell(34);
	            Cell cell34 = sheet2.getRow(i).getCell(35);
	            Cell cell35 = sheet2.getRow(i).getCell(36);
	            Cell cell36 = sheet2.getRow(i).getCell(37);
	            
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
 	           updateParName=cell10.getStringCellValue();
 	            System.out.println("Parameter Name: "+updateParName);
 	            //getting update Parameter Type
 	            updateParType=cell11.getStringCellValue();
 	            System.out.println("Parameter Type: "+updateParType);
 	            //getting update Parameter Status 
 	           updateParStatus=cell12.getStringCellValue();
 	            System.out.println("Target Obj Name: "+updateParStatus);
 	            //getting update Parameter Base UOM
 	           updateParBaseUOM=cell13.getStringCellValue();
 	            System.out.println("Parameter Base UOM: "+updateParBaseUOM);
 	            //getting update Parameter Effective Date
 	           updateEffectiveDate=cell14.getStringCellValue();
 	            System.out.println("Effective Date: "+updateEffectiveDate);
 	            //getting update Parameter Inactive Date 
 	           updateParInactiveDate=cell15.getStringCellValue();
 	            System.out.println("Inactive Date: "+updateParInactiveDate);
 	            //getting update Parameter Data type
 	           updateParDataType=cell16.getStringCellValue();
 	            System.out.println("Data type: "+updateParDataType);
 	            //getting update Parameter description
 	           updateParDescription=cell17.getStringCellValue();
                 System.out.println("Description: "+updateParDescription);
                 //getting  update Parameter Label
                 updateParLabel=cell18.getStringCellValue();
                 System.out.println("Parameter Label: "+updateParLabel);
                 
                 
                 
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
                 
               //getting Parameter Update Version Caption
                 updateversioncaption=cell28.getStringCellValue();
                 System.out.println("Parameter Update Version Caption: "+updateversioncaption);
                 //getting Parameter  Update Version Data Format
                 updateversiondatafromat = cell29.getStringCellValue();
                 System.out.println("Parameter Update Version Data Format: "+updateversiondatafromat);
                 //getting Parameter Update Version  Stepno Label
                 updateversionstepnolabel=cell30.getStringCellValue();
                 System.out.println("Parameter Update Version Stepno Label: "+updateversionstepnolabel);
                 //getting Parameter Update Version Sort no
                 double  Paraneterstepno12=cell31.getNumericCellValue();
                 int Paraneterstepno012=(int) Paraneterstepno12;
                 updateParaneterstepno = Integer.toString(Paraneterstepno012);
                 System.out.println("Parameter Update Version Stepno: "+updateParaneterstepno);
                 //getting Parameter Update Version Sortnumber
                 double  Paranetersortno12=cell32.getNumericCellValue();
                 int Paranetersortno012=(int) Paranetersortno12;
                 updateParanetersortno = Integer.toString(Paranetersortno012);
                 System.out.println("Parameter Update Version Sortnumber: "+updateParanetersortno);
                 //getting Parameter Update Version Dataentry Instructions
                 updateversionDataentry=cell33.getStringCellValue();
                 System.out.println("Parameter Update Version Dataentry Instructions: "+updateversionDataentry);
                 //getting Parameter Update Version Default Uom
                 updateversionDefaultuom=cell34.getStringCellValue();
                 System.out.println("Parameter Update Version Default Uom: "+updateversionDefaultuom);
                 //getting Parameter Update Version Start 
                 double  Paraneterversionstart02=cell35.getNumericCellValue();
                 int Paraneterversionstart12=(int) Paraneterversionstart02;
                 updateParaneterversionstart = Integer.toString(Paraneterversionstart12);
                 System.out.println("Parameter Update Version Start: "+updateParaneterversionstart);
                 //Getting Parameter Update Version End 
                 double  Paraneterend12=cell36.getNumericCellValue();
                 int Paraneterend012=(int) Paraneterend12;
                 updateParaneterversionend = Integer.toString(Paraneterend012);
                 System.out.println("Parameter Update Version End: "+updateParaneterversionend);
	        }
	
		}
		catch(Exception e)
        {
        	System.out.println(e.getMessage());
        } 
	}
	@Test(priority=2)
    public void createParameter()throws Exception  {
		
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
        
        
        //Click on Save button
        Parameterpom.ParameterSave(driver).click();
        System.out.println("-----Parameter Saved Successfully------");
        
    
}
	@Test(priority=3)
	public void updateParameter()throws Exception {
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		try {
			
			 //Entering value into Name field
	       WebElement parametername = Parameterpom.Parametername(driver);
	       parametername.clear();
	       parametername.sendKeys(updateParName);
	        
	      //Entering and selecting  value into Type dropdown
	       WebElement parametertype = Parameterpom.Parametertype(driver);
	       parametertype.clear();
	       parametertype.sendKeys(updateParType);
	        Parameterpom.Parametertypeselect(driver).click();
	        
	      //Entering and selecting the value from Status dropdown
	        WebElement parameterstatus = Parameterpom.Parameterstatus(driver);
	        parameterstatus.clear();
	        parameterstatus.sendKeys(updateParStatus);
	        Parameterpom.Parameterstatusselect(driver).click();
	        
	      //Entering and selecting the value from Base UOM dropdown
	        WebElement parameterbaseuom =Parameterpom.ParameterBaseUOM(driver);
	        parameterbaseuom.clear();
	        parameterbaseuom.sendKeys(updateParBaseUOM);
	        Parameterpom.ParameterBaseUOMselect(driver).click();
	        
	       //Entering value in the Effective date field
	        WebElement effective = Parameterpom.Parametereffectivedate(driver);
	        List<WebElement> inputs = driver.findElements(By.tagName("input"));

	        for (WebElement input1 : inputs) {
	            ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].removeAttribute('readonly','readonly')",input1);
	        }
	        effective.clear();
	        effective.sendKeys(updateEffectiveDate);
	        
	        
	        
	        
	      //Entering and selecting the value from Data Type dropdown
	        WebElement parameterdatatype =Parameterpom.Parameterdatatype(driver);
	        parameterdatatype.clear();
	        parameterdatatype.sendKeys(updateParDataType);
	        Parameterpom.Parameterdatatypeselect(driver).click();
	        
	      //Entering value in the Inctive date field
	        WebElement inactive = Parameterpom.Parameterinctivedate(driver);
	        List<WebElement> inputs1 = driver.findElements(By.tagName("input"));

	        for (WebElement input1 : inputs1) {
	            ((JavascriptExecutor) driver).executeScript(
	                        "arguments[0].removeAttribute('readonly','readonly')",input1);
	        }
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        inactive.clear();
	        jse.executeScript("arguments[0].value='"+updateParInactiveDate+"';", inactive);
	     
	        
	      //Entering value in Description field
	        WebElement Description = Parameterpom.Parameterdescription(driver);
	        Description.clear();
	        Description.sendKeys(updateParDescription);

	      //Entering value in Lable field
	        WebElement label =  Parameterpom.Parameterlabel(driver);
	        label.clear();
	        label.sendKeys(updateParLabel);
	        Thread.sleep(3000);
	        
	        //Click on Save button
	        Parameterpom.ParameterSave(driver).click();
	        System.out.println("-------Parameter Updated Successfully-------");
		}
		 catch(Exception e)
        {
        	System.out.println(e.getMessage());
        } 
		
	}
	
		@Test(priority=4)
		public void validateParameter()throws Exception {
			
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			try {
	          	
           System.out.println("------Parameter Verification----------");
	     //Get and Comparing Parameter Name
	    	String createdParname = Parameterpom.Parametername(driver).getAttribute("value");
	    	System.out.println("craeted value for Parameter Name  :" +createdParname );
	    	String errormessage1 = "Parameter Name is not matching";
	    	Assert.assertEquals(updateParName, createdParname,errormessage1);
	    	System.out.println("Parameter Name is matching ");
	    
	     //Get and Comparing Parameter type dropdown
	    	String createdPartype = Parameterpom.Parameterselectedtype(driver).getText();
	    	System.out.println("craeted value for Parameter type :" +createdPartype );
	    	String errormessage2 = "Parameter type is not matching";
	    	Assert.assertEquals(updateParType, createdPartype,errormessage2);
	    	System.out.println("Parameter type is matching ");
	    	
	    //Get and Comparing Parameter Status dropdown
	    	String createdparstatus = Parameterpom.Parameterselectedstatus(driver).getText();
	    	System.out.println("created Parameter Status:" +createdparstatus );
	    	String errormessage3 = "Parameter Status is not matching";
	    	Assert.assertEquals(updateParStatus, createdparstatus,errormessage3);
	    	System.out.println("Parameter Status is matching ");
	    
	   //Get and Comparing Parameter Base UOM dropdown
	    	String createdparbaseuom = Parameterpom.Parameterselectedbaseuom(driver).getText();
	    	System.out.println("created Parameter Base UOM:" +createdparbaseuom );
	    	String errormessage4 = "Parameter Base UOM is not matching";
	    	Assert.assertEquals(updateParBaseUOM, createdparbaseuom,errormessage4);
	    	System.out.println("Parameter Base UOM is matching ");
	    	
	    //Get and Comparing Parameter Effective Date 
	    	 String createdeffectivedate = Parameterpom.Parametereffectivedate(driver).getAttribute("value");
	    	 System.out.println("created Parameter Effective Date  :" +createdeffectivedate );
	    	 String errormessage5 = "Parameter Effective Date   is not matching";
	    	 Assert.assertEquals(updateEffectiveDate, createdeffectivedate,errormessage5);
	    	 System.out.println("Parameter Effective Date   is matching ");
	    	 
//	    //Get and Comparing Parameter Inactive Date 
//	    	 String createdInctivedate = Parameterpom.Parameterinctivedate(driver).getAttribute("value");
//	    	 System.out.println("created Parameter Inactive Date :" +createdInctivedate );
//	    	 String errormessage6 = "Inactive Date  is not matching";
//	    	 Assert.assertEquals(ParInactiveDate, createdInctivedate,errormessage6);
//	    	 System.out.println("Inactive Date  is matching ");
	    
	    //Get and Comparing Parameter Data Type dropdown
		    	String createdpardatatype = Parameterpom.Parameterselecteddatatype(driver).getText();
		    	System.out.println("created Parameter Data Type:" +createdpardatatype );
		    	String errormessage7 = "Parameter Data Type is not matching";
		    	Assert.assertEquals(updateParDataType, createdpardatatype,errormessage7);
		    	System.out.println("Parameter Data Type is matching "); 
		    	
	    //Get and Comparing Parameter Description
	    	 String createdparDescription = Parameterpom.Parameterdescription(driver).getAttribute("value");
	    	 System.out.println("Parameter Description:" +createdparDescription );
	    	 String errormessage8= "Description  is not matching";
	    	 Assert.assertEquals(updateParDescription,createdparDescription,errormessage8);
	    	 System.out.println("Description  is matching ");
	    
	    //Get and Comparing Parameter label
	    	 String createdparlabel = Parameterpom.Parameterlabel(driver).getAttribute("value");
	    	 System.out.println("Parameter label:" +createdparlabel );
	    	 String errormessage9= "label  is not matching";
	    	 Assert.assertEquals(updateParLabel,createdparlabel,errormessage9);
	    	 System.out.println("label  is matching ");
	    	
//	    //Closing the add parameter page
//	  		WebElement closeadd = Parameterpom.Addcross(driver);
//	  		JavascriptExecutor executor = (JavascriptExecutor) driver;
//	  		executor.executeScript("arguments[0].click();", closeadd);
//	  		Thread.sleep(1000);
//	    	 
			}
			 catch(Exception e)
	        {
	        	System.out.println(e.getMessage());
	        } 
	}
		
		@Test(priority=5)
		public void  createversion() throws Exception{
			
			try
			{
				
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
	            Thread.sleep(3000);
	            
	            //Entering value in Version Start
	            Parameterpom.Parameterversionstart(driver).sendKeys(Paraneterversionstart);
	            Thread.sleep(3000);
	            //Entering value in Version End 
	            Parameterpom.Parameterversionend(driver).sendKeys(Paraneterversionend);
	            Thread.sleep(3000);
	            //Clicking on Save Version button
	            Parameterpom.ParameterSaveversionbutton(driver).click();
	            Thread.sleep(3000);
	            
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		@Test(priority=6)
		public void  Updateversion() throws Exception{
			
			try
			{
				//Clicking on created Parameter Version
			       WebElement clickcaption = Parameterpom.ParameterVersioncreated(driver);
			        Actions act = new Actions(driver);
			        act.doubleClick(clickcaption).build().perform();
			        Thread.sleep(5000);
				
	            //Click on Versions
//	            Parameterpom.Parameterversionsection(driver).click();
//	            
//	            //Clicking on versions ADD button
//	            Parameterpom.Parameterversionaddbutton(driver).click();
//	            
//	            //Clicking on  ExpandAll
//	            Parameterpom.ParameterversionExpandalllink(driver).click();
//	            Thread.sleep(3000);
	            
	            
	            
	            //Entering value in DataFormat 
	            Parameterpom.ParameterversionupdateDateformat(driver).sendKeys(updateversiondatafromat);
	            
	            //Selecting value in DataFormat
	            Parameterpom.ParameterversionDateformatselect(driver).click();
	            
	            //Entering value in Stepno Label
	            Parameterpom.ParameterversionStepnolabel(driver).clear();
	            Parameterpom.ParameterversionStepnolabel(driver).sendKeys(updateversionstepnolabel);
	            
	            //Entering value in Step No
	            Parameterpom.ParameterversionStepno(driver).clear();
	            Parameterpom.ParameterversionStepno(driver).sendKeys(updateParaneterstepno);
	            
	            //Entering value in Sort No
	            Parameterpom.ParameterversionSortno(driver).clear();
	            Parameterpom.ParameterversionSortno(driver).sendKeys(updateParanetersortno);
	            
	             //Entering value in Dataentry Instructions
	            Parameterpom.ParameterversiondataentryInstructions(driver).clear();
	            Parameterpom.ParameterversiondataentryInstructions(driver).sendKeys(updateversionDataentry);
	            
	            //Entering value in Default Uom
	            Parameterpom.ParameterversionBaseUOM(driver).sendKeys(updateversionDefaultuom);
	            
	            //Selecting value in Default Uom
	            Parameterpom.ParameterversionSelectBaseUOM(driver).click();
	            
	          //Scroll to Parameter sections 
	            JavascriptExecutor js = (JavascriptExecutor) driver;
			    WebElement Element1 = Parameterpom.Parameterversionstart(driver);
			    js.executeScript("arguments[0].scrollIntoView();",Element1);
	            Thread.sleep(3000);
	            
	            //Entering value in Version Start
	            Parameterpom.Parameterversionstart(driver).clear();
	            Parameterpom.Parameterversionstart(driver).sendKeys(updateParaneterversionstart);
	            Thread.sleep(3000);
	            //Entering value in Version End 
	            Parameterpom.Parameterversionend(driver).clear();
	            Parameterpom.Parameterversionend(driver).sendKeys(updateParaneterversionend);
	            Thread.sleep(3000);
	            //Clicking on Save Version button
	            Parameterpom.ParameterSaveversionbutton(driver).click();
	            Thread.sleep(3000);
	            
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
		@Test(priority=7)
		public void verifyupdateParameterVersion()throws Exception {
		
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
			try {
		 
				
				//Clicking on created Parameter Version
			       WebElement clickcaption = Parameterpom.ParameterVersioncreated(driver);
			        Actions act = new Actions(driver);
			        act.doubleClick(clickcaption).build().perform();
			        
//			      //Get and Comparing Parameter Version Caption
//			    	String createdparvercaption = Parameterpom.ParameterversionCaption(driver).getAttribute("value");
//			    	System.out.println("created ParameterVersion Caption:" +createdparvercaption );
//			    	String errormessage7 = "Parameter Version Caption is not matching";
//			    	Assert.assertEquals(updateversioncaption, createdparvercaption,errormessage7);
//			    	System.out.println("Parameter Version Caption is matching "); 
//				
			    	
			    	//Get and Comparing Parameter Version DataFormat 
			    	String createdparverdatafromat = Parameterpom.ParameterversionDateformatselected(driver).getText();
			    	System.out.println("created ParameterVersion Caption:" +createdparverdatafromat );
			    	String errormessage8 = "Parameter Version Caption is not matching";
			    	Assert.assertEquals(updateversiondatafromat, createdparverdatafromat,errormessage8);
			    	System.out.println("Parameter Version Caption is matching "); 
			    	
			    	//Get and Comparing Parameter Version Stepno Label
			    	String createdparverstepnolabel = Parameterpom.ParameterversionStepnolabel(driver).getAttribute("value");
			    	System.out.println("created ParameterVersion Stepno Label:" +createdparverstepnolabel );
			    	String errormessage9 = "Parameter Version Stepno Label is not matching";
			    	Assert.assertEquals(updateversionstepnolabel, createdparverstepnolabel,errormessage9);
			    	System.out.println("Parameter Version Stepno Label is matching "); 
			    	
			    	//Get and Comparing Parameter Version Step No 
			    	String createdparverstepno = Parameterpom.ParameterversionStepno(driver).getAttribute("value");
			    	System.out.println("created ParameterVersion Step No :" +createdparverstepno );
			    	String errormessage1 = "Parameter Version Step No is not matching";
			    	Assert.assertEquals(updateParaneterstepno, createdparverstepno,errormessage1);
			    	System.out.println("Parameter Version Step No  is matching ");
			    	
			    	//Get and Comparing Parameter Version Sort No 
			    	String createdparversortno = Parameterpom.ParameterversionSortno(driver).getAttribute("value");
			    	System.out.println("created ParameterVersion Sort No :" +createdparversortno );
			    	String errormessage10 = "Parameter Version Sort No  is not matching";
			    	Assert.assertEquals(updateParanetersortno, createdparversortno,errormessage10);
			    	System.out.println("Parameter Version Sort No  is matching "); 
			    	
			    	//Get and Comparing Parameter Version Dataentry Instructions
			    	String createdparverdataentry = Parameterpom.ParameterversiondataentryInstructions(driver).getAttribute("value");
			    	System.out.println("created Parameter VersionDataentry Instructions:" +createdparverdataentry );
			    	String errormessage11 = "Parameter Version Dataentry Instructions is not matching";
			    	Assert.assertEquals(updateversionDataentry, createdparverdataentry,errormessage11);
			    	System.out.println("Parameter Version Dataentry Instructions is matching "); 
			    	
			    	
//			    	//Get and Comparing Parameter Version Default Uom
//			    	String createdparverdefaultuom = Parameterpom.ParameterversionDefaultUOMselected(driver).getText();
//			    	System.out.println("created ParameterVersion Default Uom:" +createdparverdefaultuom );
//			    	String errormessage12 = "Parameter Version Default Uom is not matching";
//			    	Assert.assertEquals(updateversionDefaultuom, createdparverdefaultuom,errormessage12);
//			    	System.out.println("Parameter Version Default Uom is matching "); 
			    	
			    	 //Scroll to Parameter  Version Start
			    	JavascriptExecutor js = (JavascriptExecutor) driver;
				    WebElement Element1 = Parameterpom.Parameterversionstart(driver);
				    js.executeScript("arguments[0].scrollIntoView();",Element1);
		            Thread.sleep(3000);
		            
			    	//Get and Comparing Parameter Version Start
		            String createdparverstart = Parameterpom.Parameterversionstart(driver).getAttribute("value");
			    	System.out.println("created Parameter Version Start:" +createdparverstart );
			    	String errormessage13 = "Parameter Version Start is not matching";
			    	Assert.assertEquals(updateParaneterversionstart, createdparverstart,errormessage13);
			    	System.out.println("Parameter Version Start is matching "); 
			    	
			    	//Get and Comparing Parameter Version End
			    	String createdparverend = Parameterpom.Parameterversionend(driver).getAttribute("value");
			    	System.out.println("created Parameter Version End:" +createdparverend );
			    	String errormessage14 = "Parameter Version End is not matching";
			    	Assert.assertEquals(updateParaneterversionend, createdparverend,errormessage14);
			    	System.out.println("Parameter Version End is matching "); 

			    	 //Closing the add parameter page
//			 		WebElement closeadd = Parameterpom.Addcross(driver);
//			 		JavascriptExecutor executor = (JavascriptExecutor) driver;
//			 		executor.executeScript("arguments[0].click();", closeadd);
//			 		Thread.sleep(1000);
			    	
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
			
		@Test(priority=12) 
		 public void deleteParameter()throws Exception  {
			
				
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
	       		 ResultSet rs2 = st.executeQuery("select * from parameterversion where parameterid = ( select parameterid from parameter where parametername= " +"'"+updateParName+"')");
	            	System.out.println("Data retrieved from the PostgreSQL database ");
	   			while (rs2.next()) {
	       		 System.out.println(rs2.getString(1) + " | "+rs2.getString(2) );
	    			}
	 				// close the result set
	  			rs2.close();

	  			int rs3=st.executeUpdate("delete from parameterversion where parameterid = ( select parameterid from parameter where parametername= " +"'"+updateParName+"')");
	  			
		            // execute the query on database
		            ResultSet rs = st.executeQuery("select * from parameter where parametername=" +"'"+updateParName+"'");
		            System.out.println("Data retrieved from the PostgreSQL database ");
		            while (rs.next()) {
		                System.out.println(rs.getString(1) + " | "+rs.getString(2) );
		            }
		         // close the result set
		            rs.close();
		       
		            int rs1=st.executeUpdate("delete from parameter where parametername=" +"'"+updateParName+"'");
		            
		            //close the statement
		            st.close();
		            //close the database connection
		            db.close();
//		            Parameterpom.Parametersearchbox(driver).clear();
//		            Parameterpom.Parametersearchbox(driver).sendKeys(ParName);
//					Thread.sleep(1000);
//					Parameterpom.Parametersearchboxhit(driver).click();
//					Thread.sleep(3000);	
//							
//					        	String searchItem1 = Parameterpom.Parametersearchclick(driver).getText();
//								System.out.println("searched Item: " +searchItem1);
//								String errormessage1 = "Parameter exists";
//								Assert.assertNotEquals(ParName, searchItem1,errormessage1);
//								System.out.println(" ----Parameter deleted--- "); 
					         
//								 Itempom.searchBox(driver).clear();
//								 Itempom.searchHit(driver).click(); 
								 
								 wb1.close();
			   }	                
		    catch(Exception e)
		     {
		       System.out.println(e.getMessage());
		     }
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
