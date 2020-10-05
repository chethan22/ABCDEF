package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Itempom;
import POM.loginpom;
import TestScripts.CreateItem;

public class loginbase  {
	 
		
	
	public static WebDriver driver;
    public static String Filepath="D:\\BLMA_Automation\\blma-testautomation\\TestData\\TestInput.xlsx";
   
	
	@BeforeTest
	public void setbaseurl() throws InterruptedException, IOException
	{
		System.out.println("Opening an application");
		
		
		
	try {
	     
		    File src=new File(Filepath);

	        FileInputStream fis=new FileInputStream(src);
	        XSSFWorkbook wb1=new XSSFWorkbook(fis);
	        XSSFSheet sheet2=wb1.getSheetAt(2);
	        int rowcount=sheet2.getLastRowNum();
	        System.out.println("RowCount= " +rowcount);
	        
            //GET CELL
            Cell cell1 = sheet2.getRow(1).getCell(0); 
            Cell cell2 = sheet2.getRow(1).getCell(1); 
            Cell cell3 = sheet2.getRow(1).getCell(2); 
            
            //SET AS STRING TYPE
            //cell1.setCellType(Cell.CELL_TYPE_STRING);
            String baseurl= cell1.getStringCellValue();
            System.out.println("Test Data From Excel : "+baseurl);
            
            String path= cell2.getStringCellValue();
            System.out.println("Test Data From Excel : "+path);
            
            String key= cell3.getStringCellValue();
            System.out.println("Test Data From Excel : "+key); 
            
            
            {
        		System.setProperty(path, key);
        	}
            driver = new ChromeDriver();
            driver.get(baseurl);
    		driver.manage().window().maximize();
    		
			
//			//Image verification 
//			WebElement img1 = loginpom.image_ver(driver);
//			if(!img1.isDisplayed())
//			{
//				System.out.println("Image not  displayed1.");
//			}
//			else 
//			{
//				System.out.println("Image displayed ");
//			}			
		
		}
		catch(Exception e){
			System.out.println("Unable to load the application");
		}
	
	}
	
	
	
	// closing the application
		@AfterTest
		public void endsession() {
			System.out.println("closed");
			driver.close();
		}
		
		@Test(priority=0)
		public void ReadLogin() throws Exception {

		        

			File src=new File(Filepath);

		        FileInputStream fis=new FileInputStream(src);

		        XSSFWorkbook wb=new XSSFWorkbook(fis);
		        XSSFSheet sheet1=wb.getSheetAt(0);
		        int rowcount=sheet1.getLastRowNum();
		        System.out.println("RowCount= " +rowcount);

		         
		            //GET CELL
		       
		            Cell cell1 = sheet1.getRow(1).getCell(0); 
		            Cell cell2 = sheet1.getRow(1).getCell(1); 
		            //cell2.setCellType ( Cell.CELL_TYPE_STRING );
		            //String j_username = cell2.getStringCellValue();
		            //SET AS STRING TYPE
		            //cell1.setCellType(Cell.CELL_TYPE_STRING);
		            String UNdata0= cell1.getStringCellValue();
		            System.out.println("Test Data From Excel username  : "+UNdata0);
		        
		            
		            double PWdata0= cell2.getNumericCellValue();
		            int PWdata01=(int) PWdata0;
		            String Password = Integer.toString(PWdata01);
		            System.out.println("Test Data From Excel password : "+PWdata01);
		          
		
		         //Entering Username
			     loginpom.username_textbox(driver).sendKeys(UNdata0);
			 Thread.sleep(1000);
				
				//Entering Password
				loginpom.password_textbox(driver).sendKeys(Password);
			Thread.sleep(1000);
			
				 loginpom.login_btn(driver).click();
				 Thread.sleep(1000);
				 
				 

				wb.close();
				
		     
		        
	 }
}
