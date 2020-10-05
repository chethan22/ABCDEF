package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tagpom {
	
	public static WebElement Tagclick(WebDriver driver) {
		
		 WebElement Tagclick = driver.findElement(By.xpath("//body//nz-layout//nz-layout//li[5]"));
		return Tagclick;
	}
	
	
	public static WebElement TagPlus(WebDriver driver) {
		
		 WebElement TagPlus = driver.findElement(By.xpath("//tabset/div/tab/div/button"));
		return TagPlus;
	}
	
	public static WebElement Caption(WebDriver driver) {
		
		 WebElement Caption = driver.findElement(By.xpath("//form/div/div[1]/div[1]/input[1]"));
		return Caption;
	}
	public static WebElement TagName(WebDriver driver) {
		
		 WebElement TagName = driver.findElement(By.xpath("//form/div[3]/div[2]/div/input"));
		return TagName;
	}
	
	public static WebElement TargetObjName(WebDriver driver) {
		
		 WebElement TargetObjName = driver.findElement(By.xpath("//ng-select[@placeholder='Select Obj Name']//div//div//div//input"));
		 return TargetObjName;
	}
	
	public static WebElement Tagtype(WebDriver driver) {
		
		 WebElement Tagtype = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//div//input"));
		 return Tagtype;
	}
	public static WebElement EffectiveDate(WebDriver driver) {
		
		 WebElement EffectiveDate = driver.findElement(By.xpath("//input[@name='effectivedate']"));
		 return EffectiveDate;
	}
	public static WebElement InactiveDate(WebDriver driver) {
		
		 WebElement InactiveDate = driver.findElement(By.xpath("//input[@name='inactivedate']"));
		 return InactiveDate;
	}
	public static WebElement Description(WebDriver driver) {
		
		 WebElement Description = driver.findElement(By.xpath("//form//div//div//div//textarea"));
		 return Description;
	}
	
	
	public static WebElement HideTogglebutton(WebDriver driver) {
		
		 WebElement HideTogglebutton = driver.findElement(By.xpath("//form/div/div[2]/div[1]/div[1]/label[1]"));
		 return HideTogglebutton;
	}
	public static WebElement TagSave(WebDriver driver) {
		
		 WebElement TagSave = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		 return TagSave;
	}
	
	public static WebElement TaglistAdd(WebDriver driver) {
		
		WebElement TaglistAdd = driver.findElement(By.xpath("//*[@id=\"Grid_add\"]/span[2]"));
		 return TaglistAdd;
	}
	
   public static WebElement TaglistCaption(WebDriver driver) {
		
		WebElement TaglistCaption = driver.findElement(By.xpath("//form/div[2]/div[1]/div[1]/input[1]"));
		 return TaglistCaption;
	}
	
   public static WebElement TaglistName(WebDriver driver) {
		
		WebElement TaglistCaption = driver.findElement(By.xpath("//body//div//div//div//div[2]//div[2]//div[1]//input[1]"));
		 return TaglistCaption;
	}
   public static WebElement TaglistSort(WebDriver driver) {
		
		WebElement TaglistCaption = driver.findElement(By.xpath("//div//div//div//div//form//div[3]//div[1]//div[1]//input[1]"));
		 return TaglistCaption;
	}
   
   public static WebElement TaglistSave(WebDriver driver) {
		
		WebElement TaglistSave = driver.findElement(By.xpath("//body/div/div/div[3]/button[1]"));
		 return TaglistSave;
	}
   
 
   public static WebElement TaglistEffectivedate(WebDriver driver) {
	
		WebElement TaglistEffectivedate = driver.findElement(By.xpath("//form//div//form//div//div//div//ejs-datepicker//div//input[@name='effectivedate']"));
		 return TaglistEffectivedate;
	}

   public static WebElement TaglistInactivedate(WebDriver driver) {
		
		WebElement TaglistInactivedate = driver.findElement(By.xpath("//form//div//form//div//div//div//ejs-datepicker//div//input[@name='inactivedate']"));
		 return TaglistInactivedate;
	}
 
   
   public static WebElement TaglistDescription(WebDriver driver) {
		
		WebElement TaglistDescription = driver.findElement(By.xpath("//*[@id=\"GridEditForm\"]/div/form/div[5]/div/div/textarea"));
		 return TaglistDescription;
	}
   
   public static WebElement searchBox(WebDriver driver) {
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		 return searchBox;
	}
   public static WebElement searchhit(WebDriver driver) {
		
		WebElement searchhit = driver.findElement(By.id("Grid_searchbutton"));
		 return searchhit;
	}
   public static WebElement Taggrouplist(WebDriver driver) {
	 
	   WebElement Taglist = driver.findElement(By.id("//div[4]//div[1]//table[1]//tbody[1]//tr[1]//td[1]"));
		//WebElement Taglist = driver.findElement(By.id("//a[contains(text(),TagDateValidation11')]"));
		 return Taglist;
	}
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static WebElement Taggrouplistclick(WebDriver driver) {
		 
	   WebElement Taggrouplistclick = driver.findElement(By.xpath("//*[@id=\"Grid_content_table\"]/tbody/tr[1]/td[1]/a"));
		 return Taggrouplistclick;
	}
   public static WebElement Taggroupsearctext(WebDriver driver) {
		 
	   WebElement Taggrouplistclick = driver.findElement(By.xpath("//*[@id=\"Grid_content_table\"]/tbody/tr[1]/td[1]"));
		 return Taggrouplistclick;
	}

   public static WebElement selectedtargetobjdropdown(WebDriver driver) {
		 
	   WebElement selectedtargetobjdropdown = driver.findElement(By.xpath("//span[contains(text(),'Item Master')]"));
		 return selectedtargetobjdropdown;
	}
 
   public static WebElement selectedtagtypedropdown(WebDriver driver) {
		 
	   WebElement selectedtagtypedropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//span[2]"));
		 return selectedtagtypedropdown;
	}
 
   public static WebElement taglistsearchbox(WebDriver driver) {
		 
	   WebElement taglistsearchbox = driver.findElement(By.xpath("//app-taglist//div//ejs-grid//div//div//div//div//div//input[@placeholder='Search']"));
		return taglistsearchbox;
	}
 
   public static WebElement taglistsearchhit(WebDriver driver) {
		 
	   WebElement taglistsearchhit = driver.findElement(By.xpath("//app-taglist//div//ejs-grid//div//div//div//div//div//span"));
		return taglistsearchhit;
	}
 //*[@id=\"Grid_content_table\"]/tbody/tr
   public static WebElement taglistselect(WebDriver driver) {
		 
	   WebElement taglistselect = driver.findElement(By.xpath("//ejs-grid/div[6]/div/table/tbody/tr/td[1]"));
		return taglistselect;
}
 
   public static WebElement taglistEdit(WebDriver driver) {
		 
	   WebElement taglistEdit = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
		return taglistEdit;
}  
   public static WebElement Taglistclose(WebDriver driver) {
	 
	   WebElement Taglistclose = driver.findElement(By.xpath("//*[@id=\"Grid_dialogEdit_wrapper\"]/div[1]/button"));
		return Taglistclose;
}


public static WebElement Addcross(WebDriver driver) {
	 WebElement Addcross = driver.findElement(By.xpath("//body//app-root//ul//span[2]"));
		return Addcross;
} 
}
