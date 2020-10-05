package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestScripts.CreateTag;

public class Recipepom {
	
	
	public static WebElement Recipeclick(WebDriver driver) {
		
		 WebElement Recipeclick = driver.findElement(By.xpath("//body//nz-layout//nz-layout//li[2]"));
		return Recipeclick;
	}
	public static WebElement Recipeplusclick(WebDriver driver) {
		
		 WebElement Recipeplusclick = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-icon btn-icon-mini btn-round item-addbtn']/i"));
		return Recipeplusclick;
	}
	public static WebElement Recipename(WebDriver driver) {
		
		 WebElement Recipename = driver.findElement(By.xpath("//div[@class='row pt-3']/div/div/input[1]"));
		return Recipename;
	}
	public static WebElement Recipetype(WebDriver driver) {
		
		 WebElement Recipeclick = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//div//input\r\n"));
		return Recipeclick;
	}
	public static WebElement Recipetypeselect(WebDriver driver) {
		
		 //WebElement Recipetypeselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//ng-dropdown-panel//div//div//div"));
		WebElement Recipetypeselect = driver.findElement(By.xpath("//ng-dropdown-panel//div//div//div[1]"));
		return Recipetypeselect;
	}
	public static WebElement Recipestatus(WebDriver driver) {
		
		 WebElement Recipestatus = driver.findElement(By.xpath("//form/div[4]/div[1]/div/ng-select/div/div/div[3]/input"));
		return Recipestatus;
	}
	public static WebElement Recipestatusselect(WebDriver driver) {
		
		 WebElement Recipestatusselect = driver.findElement(By.xpath("//ng-dropdown-panel//div//div//div[1]"));
		return Recipestatusselect;
	}
	public static WebElement RecipeItem(WebDriver driver) {
		
		 WebElement RecipeItem = driver.findElement(By.xpath("//form/div[4]/div[2]/div/ng-select/div/div/div[3]/input"));
		return RecipeItem;
	}
	public static WebElement RecipeItemselect(WebDriver driver) {
		
		 WebElement RecipeItemselect = driver.findElement(By.xpath("//ng-dropdown-panel/div/div[2]/div[1]"));
		return RecipeItemselect;
	}
	public static WebElement Recipeeffectivedate(WebDriver driver) {
		
		 WebElement Recipeeffectivedate = driver.findElement(By.xpath("//input[@name='effectivedate']"));
		return Recipeeffectivedate;
	}
	public static WebElement Recipeinctivedate(WebDriver driver) {
		
		 WebElement Recipeinctivedate = driver.findElement(By.xpath("//input[@name='inactivedate']"));
		return Recipeinctivedate;
	}
	public static WebElement RecipeDescription(WebDriver driver) {
		
		 WebElement RecipeDescription = driver.findElement(By.xpath("//form/div[6]/div[1]/div/textarea"));
		return RecipeDescription;
	}

    public static WebElement RecipeallowBatch(WebDriver driver) {
	
	 WebElement RecipeallowBatch = driver.findElement(By.xpath("//body//label//div[2]"));
	return RecipeallowBatch;
    }
    public static WebElement Recipesave(WebDriver driver) {
    	
   	 WebElement Recipesave = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
   	return Recipesave;
    }
	public static WebElement Addcross(WebDriver driver) {
		
		WebElement Addcross = driver.findElement(By.xpath("//body//app-root//ul//span[2]"));
	   	return Addcross;
	}
	public static WebElement searchBox(WebDriver driver) {
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	   	return searchBox;
	}
	public static WebElement searchHit(WebDriver driver) {
		WebElement searchHit = driver.findElement(By.xpath("//ejs-grid/div[2]/div/div[3]/div/div/span"));
	   	return searchHit;
	}
	public static WebElement getrecipename(WebDriver driver) {
		WebElement getrecipename = driver.findElement(By.xpath("//div[4]//div[1]//table[1]//tbody[1]//tr[1]//td[1]"));
	   	return getrecipename;
	}
	public static WebElement Recipetypeselected(WebDriver driver) {
		WebElement Recipetypeselected = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//span[2]"));
	   	return Recipetypeselected;
	}
	public static WebElement RecipeItemselected(WebDriver driver) {
		WebElement RecipeItemselected = driver.findElement(By.xpath("//form/div[4]/div[2]/div/ng-select/div/div/div[2]/span[2]"));
	   	return RecipeItemselected;
	}
	public static WebElement RecipeStatusselected(WebDriver driver) {
		
		WebElement RecipeStatusselected = driver.findElement(By.xpath("//form/div[4]/div[1]/div/ng-select/div/div/div[2]/span[2]"));
	   	return RecipeStatusselected;
	}
	public static WebElement Recipeinctivedateselected(WebDriver driver) {
		WebElement RecipeStatusselected = driver.findElement(By.xpath("//form/div[5]/div[2]/div/ejs-datepicker/div/input"));
	   	return RecipeStatusselected;	
	}
	public static WebElement Recipesectionscroll(WebDriver driver) {
		WebElement Recipesectionscroll = driver.findElement(By.xpath("//*[@id=\"ParentGrid\"]"));
	   	return Recipesectionscroll;	
	}
	public static WebElement Recipeparentsectionname(WebDriver driver) {
		WebElement Recipeparentsectionname = driver.findElement(By.id("ParentGridrecipesectionname"));
	   	return Recipeparentsectionname;	
	}
	public static WebElement Recipeparentseqno(WebDriver driver) {
		WebElement Recipesectionseqno = driver.findElement(By.xpath("//input[@name='seqno']"));
	   	return Recipesectionseqno;	
	}
	public static WebElement RecipeparentAddclick(WebDriver driver) {
		WebElement Recipesectionclick = driver.findElement(By.id("ParentGrid_add"));
	   	return Recipesectionclick;	 
	}
	public static WebElement Recipeparentistable(WebDriver driver) {
		WebElement Recipesectionistable = driver.findElement(By.xpath("//*[@id=\"ParentGridEditForm\"]/table/tbody/tr/td[3]/span"));
	   	return Recipesectionistable;	 
	}
	
	public static WebElement Recipeparentdescription(WebDriver driver) {
		WebElement Recipesectionistable = driver.findElement(By.xpath("//input[@name='description']"));
	   	return Recipesectionistable;	 
	}
	public static WebElement Recipeparentsectiontype(WebDriver driver) {
		WebElement Recipeparentsectiontype = driver.findElement(By.xpath("//input[@name='recipesectiontype']"));
	   	return Recipeparentsectiontype;	 
	}
	public static WebElement Recipechildsectionclick(WebDriver driver) {
		WebElement Recipechildsectionclick = driver.findElement(By.id("tab2"));
	   	return Recipechildsectionclick;	 
	}
	public static WebElement Recipechildsectionname(WebDriver driver) {
		WebElement Recipechildsectionname = driver.findElement(By.xpath("//input[@name='recipesectionname']"));
	   	return Recipechildsectionname;	 
	}
	public static WebElement Recipechildseqno(WebDriver driver) {
		WebElement Recipechildseqno = driver.findElement(By.xpath("//input[@name='seqno']"));
	   	return Recipechildseqno;	 
	}
	public static WebElement Recipechildistable(WebDriver driver) {
		WebElement Recipechildistable = driver.findElement(By.xpath("//*[@id=\"ChildGridEditForm\"]/table/tbody/tr/td[3]/span"));
	   	return Recipechildistable;	 
	}
	public static WebElement Recipechilddescription(WebDriver driver) {
		WebElement Recipechilddescription = driver.findElement(By.xpath("//input[@name='description']"));
	   	return Recipechilddescription;	 
	}
	public static WebElement Recipechildparentdropdown(WebDriver driver) {
		WebElement Recipechildparentdropdown = driver.findElement(By.xpath("//*[@id=\"ChildGridEditForm\"]/table/tbody/tr/td[6]/span"));
	   	return Recipechildparentdropdown;	 
	}
	public static WebElement SectionUpdate(WebDriver driver) {
		WebElement SectionUpdate = driver.findElement(By.xpath("//span[contains(text(),'Update')]"));
	   	return SectionUpdate;	 
	}
	public static WebElement Recipesearchbox(WebDriver driver) {
		
		WebElement Recipesectionsearch = driver.findElement(By.id("ParentGrid_searchbar"));
	   	return Recipesectionsearch;
		
	}
	public static WebElement Recipeparentclick(WebDriver driver) {
		WebElement Recipeparentclick = driver.findElement(By.xpath("//*[@id=\"ParentGrid_content_table\"]/tbody/tr/td[1]"));
		return Recipeparentclick;
	}
	public static WebElement Recipeparentistableget(WebDriver driver) {
		WebElement Recipeparentistableget = driver.findElement(By.xpath("//*[@id=\"ParentGridis_table_hidden\"]/option"));
		return Recipeparentistableget;
	}
	public static WebElement Recipecancelclick(WebDriver driver) {
		WebElement Recipecancelclick = driver.findElement(By.id("ParentGrid_cancel"));
		return Recipecancelclick;
		
	}
	public static WebElement RecipechildAdd(WebDriver driver) {
		WebElement RecipechildAdd = driver.findElement(By.id("ChildGrid_add"));
		return RecipechildAdd;
	}
	public static WebElement Recipechildsearchbox(WebDriver driver) {	
		WebElement Recipechildsearchbox = driver.findElement(By.id("ChildGrid_searchbar"));
		return Recipechildsearchbox;
	}
	public static WebElement Recipechildclick(WebDriver driver) {
		WebElement Recipechildclick = driver.findElement(By.xpath("//div[6]//div[1]//table[1]//tbody[1]//tr"));
		return Recipechildclick;
	}
	public static WebElement Recipechildsectionselected(WebDriver driver) {
		WebElement Recipechildsectionselected = driver.findElement(By.xpath("//*[@id=\"ChildGridparentrecipesectioname_hidden\"]/option"));
		return Recipechildsectionselected;
	}
	public static WebElement Recipechildcancelclick(WebDriver driver) {
		WebElement Recipechildcancelclick = driver.findElement(By.xpath("//*[@id=\"ChildGrid_cancel\"]/span[2]"));
		return Recipechildcancelclick;
	}
	
	
	
	
	/////////////////RECIPE ATTRIBUTE PATHS//////////////////
	public static WebElement RecipeAttributesectionclick(WebDriver driver) {
		WebElement RecipeAttributesectionclick = driver.findElement(By.xpath("//tabset/ul/li[3]/a"));
		return RecipeAttributesectionclick;
	}
	public static WebElement RecipeAttributeclickplus(WebDriver driver) {
		WebElement RecipeAttributeclickplus = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/div/i"));
		return RecipeAttributeclickplus;
	}
	public static WebElement RecipeAttributedropdown(WebDriver driver) {
		WebElement RecipeAttributedropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//div//div//div//input"));
		return RecipeAttributedropdown;
	}
	public static WebElement RecipeAttributedropdownselect(WebDriver driver) {
		WebElement RecipeAttributedropdownselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//ng-dropdown-panel//div//div//div[1]"));
		return RecipeAttributedropdownselect;
	}
	public static WebElement RecipeAttributeaddclick(WebDriver driver) {
		WebElement RecipeAttributeaddclick = driver.findElement(By.xpath("//modal-container/div/div/div/button[1]"));
		return RecipeAttributeaddclick;
	}
	public static WebElement RecipeAttributeclick(WebDriver driver) {
		WebElement RecipeAttributeclick = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/ul/li/label[1]"));
		return RecipeAttributeclick;
	}
	public static WebElement RecipeAttributeclickElemented(WebDriver driver) {
		WebElement RecipeAttributeclickElemented = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/ul/li[1]/label"));
		return RecipeAttributeclickElemented;
	}
	public static WebElement RecipeAttributelistfield(WebDriver driver) {
		WebElement RecipeAttributeclickElemented = driver.findElement(By.xpath("//app-attributes/div/div/div[2]/div/div/div/div[2]/input"));
		return RecipeAttributeclickElemented;
	}
	public static WebElement RecipeAttributeSave(WebDriver driver) {
		WebElement RecipeAttributeSave = driver.findElement(By.xpath("//app-attributes/div/div/div[2]/div/button"));
		return RecipeAttributeSave;
	}
	
	/////////////////RECIPE TAG PATHS//////////////////
	public static WebElement RecipeTagsclick(WebDriver driver) {
		WebElement RecipeTagsclick = driver.findElement(By.xpath("//div[@class='col-sm-12 bg-light ng-star-inserted']/tabset/ul/li[4]"));
		return RecipeTagsclick;
	}
	public static WebElement RecipeTagsfielddropdowm(WebDriver driver) {
		WebElement RecipeTagsfielddropdowm = driver.findElement(By.xpath("//ng-select[@placeholder='Select Tags']/div/div[1]/div[2]/input"));
		return RecipeTagsfielddropdowm;
	}
	public static WebElement RecipeTagsfielddropdowmselect(WebDriver driver) {
		//WebElement RecipeTagsfielddropdowmselect = driver.findElement(By.xpath("//div[@class='ng-optgroup ng-star-inserted']"));
		WebElement RecipeTagsfielddropdowmselect = driver.findElement(By.xpath("//span[contains(text(),'"+CreateTag.caption+"')]"));
		return RecipeTagsfielddropdowmselect;
	}
	public static WebElement RecipeTagsSave(WebDriver driver) {
		WebElement RecipeTagsSave = driver.findElement(By.xpath("//app-tags/div/div/button"));
		return RecipeTagsSave;
		
	}
	public static WebElement RecipeTagsverify(WebDriver driver) {
		WebElement RecipeTagsverify = driver.findElement(By.xpath("//ng-select[@placeholder='Select Tags']/div/div/div[2]/span[2]"));
		return RecipeTagsverify;	
	}
	public static WebElement RecipeTagsdeselect(WebDriver driver) {
		WebElement RecipeTagsdeselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Tags']/div/div/div[2]/span[1]"));
		return RecipeTagsdeselect;	
	}
	public static WebElement RecipeTagsdeselectverify(WebDriver driver) {
		WebElement RecipeTagsdeselectverify = driver.findElement(By.xpath("//ng-select[@placeholder='Select Tags']/div/div/div[2]"));
		return RecipeTagsdeselectverify;	
	}
	public static WebElement Recipecommentsection(WebDriver driver) {
		WebElement Recipecommentsection = driver.findElement(By.xpath("//div[@class='col-sm-12 bg-light ng-star-inserted']/tabset/ul/li[2]/a"));
		return Recipecommentsection;	
	}
	public static WebElement Recipecommenttextfield(WebDriver driver) {
		WebElement Recipecommenttextfield = driver.findElement(By.xpath("//nz-comment-content[@class='ant-comment-content-detail']/nz-form-item[1]/textarea"));
		return Recipecommenttextfield;	
	}
	public static WebElement Recipecommentsavebutton(WebDriver driver) {
		WebElement Recipecommentsavebutton = driver.findElement(By.xpath("//nz-comment-content[@class='ant-comment-content-detail']/nz-form-item[2]/button"));
		return Recipecommentsavebutton;	
	}
	public static WebElement Recipecommenttextfieldverify(WebDriver driver) {
		WebElement Recipecommenttextfieldverify = driver.findElement(By.xpath("//nz-comment-content/p"));
		return Recipecommenttextfieldverify;	
	}
	
}
