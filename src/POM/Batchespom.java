package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestScripts.BatchAttributeTarget;
import TestScripts.Batchcreation;

public class Batchespom {
	
	
	public static WebElement Batchesclick(WebDriver driver) {
		
		 WebElement Batchesclick = driver.findElement(By.xpath("//nz-header//li[2]"));
		return Batchesclick;
	}
	public static WebElement Batchesplusbutton(WebDriver driver) {
		
		 WebElement Batchesaddplus = driver.findElement(By.xpath("//div[@class='item-master']/button"));
		return Batchesaddplus;
	}
	public static WebElement Batchesselectrecipe(WebDriver driver) {
		
		 WebElement Batchesselectrecipe = driver.findElement(By.xpath("//tbody/tr/td[3]/nz-select[1]/div[1]/div[1]/div[1]"));
		return Batchesselectrecipe;
	}
	public static WebElement Batchesselectrecipevalue(WebDriver driver) {
		
		 WebElement Batchesselectrecipevalue = driver.findElement(By.xpath("//li[contains(text(),'"+Batchcreation.recipename+"')]"));
		return Batchesselectrecipevalue;
	}
	public static WebElement Batchesselectbatchattributerecipevalue(WebDriver driver) {
		
		 WebElement Batchesselectrecipevalue = driver.findElement(By.xpath("//li[contains(text(),'"+BatchAttributeTarget.recipename+"')]"));
		return Batchesselectrecipevalue;
	}
	public static WebElement Batchesbatchnumber(WebDriver driver) {
		
		 WebElement Batchesbatchnumber = driver.findElement(By.xpath("//input[@placeholder='Batch No.']"));
		return Batchesbatchnumber;
	}
	public static WebElement Batchesparentbatch(WebDriver driver) {
		
		 WebElement Batchesparentbatch = driver.findElement(By.xpath("//input[@placeholder='Parent Batch']"));
		return Batchesparentbatch;
	}
	public static WebElement Batchesversionno(WebDriver driver) {
		
		 WebElement Batchesversionno = driver.findElement(By.xpath("//input[@placeholder='Version No.']"));
		return Batchesversionno;
	}
	public static WebElement Batchestemplates(WebDriver driver) {
		
		 WebElement Batchesversionno = driver.findElement(By.xpath("//nz-select[@nzplaceholder='Select Template']/div/div/div[1]"));
		return Batchesversionno;
	}
	public static WebElement Batchestype(WebDriver driver) {
		
		 WebElement Batchestype = driver.findElement(By.xpath("//nz-select[@nzplaceholder='Select Type']/div/div/div[1]"));
		return Batchestype;
	}
	public static WebElement Batchesassignedto(WebDriver driver) {
		
		 WebElement Batchesassignedto = driver.findElement(By.xpath("//nz-select[@nzplaceholder='Assigned To']/div/div/div[1]"));
		return Batchesassignedto;
	}
	public static WebElement Batchcreationsave(WebDriver driver) {
		
		 WebElement Batchcreationsave = driver.findElement(By.xpath("//div[@class='col-sm-1']/div/button"));
		return Batchcreationsave;
	}
	public static WebElement Batchcreationreleasebatchbutton(WebDriver driver) {
		
		 WebElement Batchcreationreleasebatch = driver.findElement(By.xpath("//div[@class='col-sm-1 col-md-1']/div/button"));
		return Batchcreationreleasebatch;
	}
	public static WebElement BatchesSearch(WebDriver driver) {
		
		 WebElement BatchesSerach = driver.findElement(By.id("Grid_searchbutton"));
		return BatchesSerach;
	}
	
	public static WebElement Batchesaddcross(WebDriver driver) {
		
		 WebElement Batchesaddcross = driver.findElement(By.xpath("//body//app-root//ul//span[2]"));
		return Batchesaddcross;
	}
	public static WebElement Batchesdataentry(WebDriver driver) {
		
		 WebElement Batchesdataentry = driver.findElement(By.xpath("//*[@id='Grid_content_table']/tbody/tr/td[1]/a/i"));
		return Batchesdataentry;
	}
	public static WebElement getBatch(WebDriver driver) {
		WebElement getBatch = driver.findElement(By.xpath("//*[@id=\"Grid_content_table\"]/tbody/tr/td"));
		return getBatch;
	}
	public static WebElement Dataentrylockicon(WebDriver driver) {
		WebElement Dataentrylockicon = driver.findElement(By.xpath("//header/div[1]/i[1]"));
		return Dataentrylockicon;
	}
	public static WebElement Batchattributeplusclick(WebDriver driver) {
		WebElement Batchattributeplusclick = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/div[1]/i"));
		return Batchattributeplusclick;
	}
	public static WebElement Batchattributedropdown(WebDriver driver) {
		WebElement Batchattributedropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']/div/div/div[2]/input"));
		return Batchattributedropdown;
	}
	public static WebElement Batchattributesectionclick(WebDriver driver) {
		WebElement Batchattribute = driver.findElement(By.xpath("//tabset[1]/ul[1]/li[3]/a[1]"));
		return Batchattribute;
	}
	public static WebElement Batchattributedropdownselect(WebDriver driver) {
		WebElement Batchattributedropdownselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//ng-dropdown-panel//div//div//div/span"));
		return Batchattributedropdownselect;
	}
	public static WebElement BatchsectionCrossclick(WebDriver driver) {
		WebElement BatchsectionCrossclick = driver.findElement(By.xpath("//modal-container/div/div/div[1]/button"));
		return BatchsectionCrossclick;
	}
	
}
