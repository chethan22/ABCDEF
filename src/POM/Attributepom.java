package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestScripts.UpdateAttribute;

public class Attributepom {
	
	public static WebElement Attributeclick(WebDriver driver) {
		
		 WebElement Attributeclick = driver.findElement(By.xpath("//body//nz-layout//nz-layout//li[4]"));
		return Attributeclick;
	}
	
	public static WebElement Attributeplusclick(WebDriver driver) {
		
		 WebElement Attributeplusclick = driver.findElement(By.xpath("//app-attributegrouplist//tabset//div//tab//div//button//i"));
		return Attributeplusclick;
	}
	
	public static WebElement AttributegroupCaption(WebDriver driver) {
		
		 WebElement AttributegroupCaption = driver.findElement(By.xpath("//form/div[3]/div[1]/div/input[1]"));
		return AttributegroupCaption;
	}
	
	public static WebElement AttributegroupName(WebDriver driver) {
		
		 WebElement AttributegroupName = driver.findElement(By.xpath("//form/div[3]/div[2]/div/input"));
		return AttributegroupName;
	}
	public static WebElement AttributegroupTargetObjname(WebDriver driver) {
		
		 WebElement AttributetargetObjname = driver.findElement(By.xpath("//ng-select[@placeholder='Select Status']//div//div//div//input"));
		return AttributetargetObjname;
	}
	public static WebElement AttributegroupEffectivedate(WebDriver driver) {
		
		 WebElement AttributegroupEffectivedate = driver.findElement(By.xpath("//input[@name='effectivedate']"));
		return AttributegroupEffectivedate;
	}
	public static WebElement Attributegroupinactivedate(WebDriver driver) {
		
		 WebElement Attributegroupinactivedate = driver.findElement(By.xpath("//input[@name='inactivedate']"));
		return Attributegroupinactivedate;
	}
	public static WebElement Attributegroupdescription(WebDriver driver) {
		
		 WebElement Attributegroupdescription = driver.findElement(By.xpath("//form//div//div//div//textarea"));
		return Attributegroupdescription;
	}
	public static WebElement AttributegroupSave(WebDriver driver) {
		
		 WebElement AttributegroupSave = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		return AttributegroupSave;
	}
	public static WebElement Attributelistscroll(WebDriver driver) {
		
		 WebElement Attributelistscroll = driver.findElement(By.xpath("//app-add-attribute-group/div/div/tabset/div[1]"));
		return Attributelistscroll;
	}
	
	public static WebElement Attributelistadd(WebDriver driver) {
		
		 WebElement Attributelistadd = driver.findElement(By.id("Grid_add"));
		return Attributelistadd;
	}
	
	public static WebElement Attributelistcaption(WebDriver driver) {
		
		 WebElement Attributelistcaption = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[2]/div[1]/div/input"));
		return Attributelistcaption;
	}
	public static WebElement Attributelistname(WebDriver driver) {
		
		 WebElement Attributelistname = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[2]/div[2]/div/input[1]"));
		return Attributelistname;
	}
	public static WebElement Attributelisttype(WebDriver driver) {
		
		 WebElement Attributelisttype = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[3]/div[1]/div/ng-select/div/div/div[2]/input"));
		return Attributelisttype;
	}
	public static WebElement Attributelistdataformat(WebDriver driver) {
		
		 WebElement Attributelistdataformat = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[3]/div[2]/div/ng-select/div/div/div[2]/input"));
		return Attributelistdataformat;
	}
	public static WebElement AttributelistdataformatClick(WebDriver driver) {
		
		 WebElement Attributelistdataformatclick = driver.findElement(By.xpath("//body//ng-dropdown-panel//div//div//div[1]"));
		return Attributelistdataformatclick;
	}
	
	public static WebElement AttributelistEffectiveDate(WebDriver driver) {
		
		 WebElement AttributelistEffective = driver.findElement(By.xpath("//input[@name='startdate']"));
		return AttributelistEffective;
	}
	public static WebElement Attributelistinactive(WebDriver driver) {
		
		 WebElement Attributelistinactive = driver.findElement(By.xpath("//input[@name='enddate']"));
		return Attributelistinactive;
	}
	public static WebElement AttributelistListName(WebDriver driver) {
		
		 WebElement Attributelistname = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[5]/div[1]/ng-select/div/div/div[2]/input"));
		return Attributelistname;
	}
	public static WebElement AttributelistSequenceNumber(WebDriver driver) {
		
		 WebElement AttributelistSequenceNumber = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[6]/div[1]/div/input"));
		return AttributelistSequenceNumber;
	}
	public static WebElement AttributelistDescription(WebDriver driver) {
		
		 WebElement AttributelistDescription = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[6]/div[2]/div/textarea"));
		return AttributelistDescription;
	}
	public static WebElement AttributelistLimitToList(WebDriver driver) {
		
		 WebElement AttributelistLimitToList = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[2]/div[1]/div/input"));
		return AttributelistLimitToList;
	}
	
	public static WebElement AttributelistSave(WebDriver driver) {
		
		 WebElement AttributelistSave = driver.findElement(By.xpath("//*[@id=\"Grid_dialogEdit_wrapper\"]/div[3]/button[1]"));
		return AttributelistSave;
	}
	
	public static WebElement Attributegroupsearchbox(WebDriver driver) {
		
		 WebElement Attributegroupsearchbox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		return Attributegroupsearchbox;
	}
	public static WebElement Attributegroupsearchhit(WebDriver driver) {
		
		 WebElement Attributegroupsearchhit = driver.findElement(By.id("Grid_searchbutton"));
		return Attributegroupsearchhit;
	}
	public static WebElement Attributegrouplistclick(WebDriver driver) {
		
		 WebElement Attributegrouplistclick = driver.findElement(By.xpath("//*[@id=\"Grid_content_table\"]/tbody/tr[1]/td[1]"));
		return Attributegrouplistclick;
	}
	
	public static WebElement Attributegrouptypedropdown(WebDriver driver) {
		
		 WebElement Attributegrouptypedropdown = driver.findElement(By.xpath("//body//form//div//div//div//div//div//span[2]"));
		return Attributegrouptypedropdown;
	}
	
	public static WebElement Attributelistsearchbox(WebDriver driver) {
		
		 WebElement Attributelistsearchbox = driver.findElement(By.xpath("//app-attributelist//div//ejs-grid//div//div//div//div//div//input[@placeholder='Search']"));
		return Attributelistsearchbox;
	}
	
	public static WebElement Attributelistclickcaption(WebDriver driver) {
		
		WebElement Attributelistclickcaption = driver.findElement(By.xpath("//div[6]//div[1]//table[1]//tbody[1]//tr[1]//td[1]"));
		//WebElement Attributelistclickcaption = driver.findElement(By.xpath("//td[contains(text(),'"+UpdateAttribute.Attricaption+"')]"));
		return Attributelistclickcaption;
	}

	public static WebElement Attributelistselectedtype(WebDriver driver) {
		
		 WebElement Attributelistselectedtype = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[3]/div[1]/div/ng-select/div/div/div[2]/span[2]"));
		return Attributelistselectedtype;
	}
	
	public static WebElement Attributelistselecteddateformat(WebDriver driver) {
		
		 WebElement Attributelistselecteddateformat = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[3]/div[2]/div/ng-select/div/div/div[2]/span[2]"));
		return Attributelistselecteddateformat;
	}
	
	public static WebElement Attributelistclose(WebDriver driver) {
		
		 WebElement Attributelistclose = driver.findElement(By.xpath("//*[@id=\"Grid_dialogEdit_wrapper\"]/div[1]/button"));
		return Attributelistclose;
	}
	
	public static WebElement Attributegroupscroll(WebDriver driver) {
		WebElement Attributegroupscroll = driver.findElement(By.xpath("//app-add-attribute-group/div/form/div[2]/div"));
		return Attributegroupscroll;
		
	}
	public static WebElement Attributegroupupdatecaption(WebDriver driver) {
		
		WebElement Attributegroupupdatecaption = driver.findElement(By.xpath("//div[@class='row pt-3']//div[1]//div[1]//input[1]"));
		return Attributegroupupdatecaption;
		
	}
	
   public static WebElement Attributelistupdatetype(WebDriver driver) {
		
		WebElement Attributelistupdatetype = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//div//input"));
		return Attributelistupdatetype;
		
		
	}
   public static WebElement Attributelistupdatetypeclick(WebDriver driver) {
		
		WebElement Attributelistupdatetypeclick = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//ng-dropdown-panel//div//div//div[1]"));
		return Attributelistupdatetypeclick;
		
		
	}
   public static WebElement Attributelistupdatedataformat(WebDriver driver) {
		
		 WebElement Attributelistupdatedataformat = driver.findElement(By.xpath("//form//div//form//div//div//div//ng-select[@placeholder='Select Status']//div//div//div//input"));
		return Attributelistupdatedataformat;
	}

public static WebElement Addcross(WebDriver driver) {
	WebElement Addcross = driver.findElement(By.xpath("//body//app-root//ul//span[2]"));
	return Addcross;
}
 
 
}
