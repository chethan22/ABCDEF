package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Itempom {

			
   

	public static WebElement itemClickplus(WebDriver driver) {
		WebElement clickplus = null;
		 clickplus= driver.findElement(By.xpath("/html/body/app-root/app-headerlayout/nz-layout/nz-layout/nz-layout/nz-content/app-itemlist/tabset/div/tab/div/button"));
		return clickplus;
	}
	public static WebElement itemClick(WebDriver driver) {
		
		WebElement  itemClick= driver.findElement(By.xpath("//body//nz-sider//li[1]"));
		return itemClick;
	}
	
    public static WebElement itemName(WebDriver driver){
    	WebElement itemname = driver.findElement(By.id("itemname"));
		return itemname;
    }
    
    public static WebElement typeDropdown(WebDriver driver) {
    	WebElement typedropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//input"));
		return typedropdown;
    }

   
    public static WebElement statusDropdown(WebDriver driver) {
	WebElement statusdropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Status']//input"));
	//WebElement statusdropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Status']//div[@class='ng-value ng-star-inserted']"));
	return statusdropdown;
    }
    public static WebElement statusselectDropdown(WebDriver driver) {
    	WebElement statusselectdropdown = driver.findElement(By.xpath("//body//ng-dropdown-panel//div//div//div[1]"));
    	return statusselectdropdown;
        }


    public static WebElement description(WebDriver driver) {
	WebElement description = driver.findElement(By.xpath("//div[@class='form-group']/textarea"));
	return description;
    }

    public static WebElement saveClick(WebDriver driver) {
    	WebElement savepath = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    	return savepath;
    }
    
    public static WebElement Addcross(WebDriver driver) { 
    WebElement addcross = driver.findElement(By.xpath("/html/body/app-root/app-headerlayout/nz-layout/nz-layout/nz-layout/nz-content/app-itemlist/tabset/ul/li[2]/a/span[2]"));
	return addcross;

    }   
    
    public static WebElement searchBox(WebDriver driver) { 
       WebElement searchtext = driver.findElement(By.xpath("//input[@placeholder='Search']"));
    	return searchtext;
        }
    
    public static WebElement searchHit(WebDriver driver) { 
        WebElement searchhit = driver.findElement(By.id("Grid_searchbutton"));
    	return searchhit;

        }
    public static WebElement getItemname(WebDriver driver) { 
    	
        WebElement searchhit = driver.findElement(By.xpath("//div [@class= \"e-content\"]/table/tbody/tr[1]/td[1]"));
    	return searchhit;

        }
  
    public static WebElement ItemnameClick(WebDriver driver) { 
        WebElement searchhit = driver.findElement(By.xpath("//div[@class='e-gridcontent e-lib e-droppable']/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
    	return searchhit;

        }
    public static WebElement effectiveactiveDate(WebDriver driver) { 
        WebElement activeDate = driver.findElement(By.xpath("//input[@name='effectivedate']"));
    	return activeDate;
    	
        }

    public static WebElement inactiveDate(WebDriver driver) { 
        WebElement inactiveDate = driver.findElement(By.xpath("//input[@name='inactivedate']"));
    	return inactiveDate;
    	
        }   
    public static WebElement updateeffectiveactiveDate(WebDriver driver) { 
        WebElement activeDate = driver.findElement(By.xpath("//input[@name='effectivedate']"));
    	return activeDate;
    	
        }
    public static WebElement updateinactiveDate(WebDriver driver) { 
        WebElement inactiveDate = driver.findElement(By.xpath("//input[@name='inactivedate']"));
    	return inactiveDate;
    	
        }
    public static WebElement selectedTypedropdown(WebDriver driver) { 
        WebElement selectedTypedropdown = driver.findElement(By.xpath("//body//ng-select[@placeholder='Select Type']//div//div//span[2]"));
    	return selectedTypedropdown;
    	
        }
    
    public static WebElement SelectedStatusdropdown(WebDriver driver) { 
        WebElement SelectedStatusdropdown = driver.findElement(By.xpath("//body//ng-select[@placeholder='Select Status']//div//div//span[2]"));
    	return SelectedStatusdropdown;
    	
        }
    public static WebElement searchBoxEdit(WebDriver driver) { 
        WebElement searchtext = driver.findElement(By.xpath("//*[@id=\"Grid_toolbarItems\"]/div/div[3]//div/input"));
     	return searchtext;
         }
    
    
    ///////////////////////////Item Attribute////////////////////////////////////////
    public static WebElement Itemattributeclick(WebDriver driver) { 
        WebElement Itemattributeclick = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//li[3]//a[1]"));
     	return Itemattributeclick;
         }  
    
    public static WebElement Itemattributeplusclick(WebDriver driver) { 
        WebElement Itemattributeclick = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/div/i"));
     	return Itemattributeclick;
         } 
    public static WebElement Itemattributedropdown(WebDriver driver) { 
        WebElement Itemattributedropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//div//div//div//input"));
     	return Itemattributedropdown;
         } 
    public static WebElement Itemattributedropdownselect(WebDriver driver) { 
        WebElement Itemattributedropdownselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//ng-dropdown-panel//div//div//div"));
     	return Itemattributedropdownselect;
         }   
    public static WebElement Itemattributeyesclick(WebDriver driver) { 
        WebElement Itemattributeyesclick = driver.findElement(By.xpath("//modal-container/div/div/div/button[1]"));
     	return Itemattributeyesclick;
         }
    public static WebElement Itemattribuetgroupclick(WebDriver driver) { 
        WebElement Itemattribuetgroupclick = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/ul/li/label"));
     	return Itemattribuetgroupclick;
         }
    public static WebElement Itemattribuetvalueenter(WebDriver driver) { 
        WebElement Itemattribuetvalueenter = driver.findElement(By.xpath("//div[@class='col-sm-7']/input"));
     	return Itemattribuetvalueenter;
         }
    public static WebElement ItemattribuetSave(WebDriver driver) { 
        WebElement ItemattribuetSave = driver.findElement(By.xpath("//div[@class='col-sm-6 attributeform']/div/button"));
     	return ItemattribuetSave;
         }
	public static WebElement ItemTagsclick(WebDriver driver) {
		WebElement ItemTagsclick = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//li[4]//a[1]"));
     	return ItemTagsclick;
	}
	public static WebElement ItemTagsfielddropdowm(WebDriver driver) {
		WebElement ItemTagsfielddropdowm = driver.findElement(By.xpath("//ng-select[@placeholder='Select Tags']//div//div//div//input"));
     	return ItemTagsfielddropdowm;
	}
	public static WebElement ItemTagsSave(WebDriver driver) {		
		WebElement ItemTagsfielddropdowm = driver.findElement(By.xpath("//app-tags/div/div/button"));
     	return ItemTagsfielddropdowm;
	}
	public static WebElement ItemTagsfieldverify(WebDriver driver) {
		WebElement ItemTagsfieldverify = driver.findElement(By.xpath("//app-tags/div/ng-select/div/div/div[2]/span[2]"));
     	return ItemTagsfieldverify;
	}
	public static WebElement ItemTagsdeselect(WebDriver driver) {
		WebElement ItemTagsdeselect = driver.findElement(By.xpath("//app-tags/div/ng-select/div/div/div[2]/span[1]"));
     	return ItemTagsdeselect;
	}
	public static WebElement ItemTagsfieldselectverify(WebDriver driver) {
		WebElement ItemTagsfieldselectverify = driver.findElement(By.xpath("//app-tags/div/ng-select/div/div/div[2]"));
     	return ItemTagsfieldselectverify;
	}
	public static WebElement Itemcommentsection(WebDriver driver) {
		WebElement Itemcommentsection = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//div//li[2]//a[1]"));
     	return Itemcommentsection;
	}
	public static WebElement Itemcommenttextfield(WebDriver driver) {
		WebElement Itemcommenttextfield = driver.findElement(By.xpath("//nz-comment-content[@class='ant-comment-content-detail']/nz-form-item[1]/textarea"));
     	return Itemcommenttextfield;
	}
	public static WebElement Itemcommentsavebutton(WebDriver driver) {
		WebElement Itemcommentsavebutton = driver.findElement(By.xpath("//nz-comment-content[@class='ant-comment-content-detail']/nz-form-item[2]/button"));
     	return Itemcommentsavebutton;
	}
	public static WebElement Itemcommenttextfieldverify(WebDriver driver) {
		WebElement Itemcommenttextfieldverify = driver.findElement(By.xpath("//nz-comment-content/p"));
     	return Itemcommenttextfieldverify;
	}
   
}