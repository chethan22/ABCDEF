package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestScripts.ParameterRecipe;
import TestScripts.UpdateParameter;



public class Parameterpom {
	
	
	public static WebElement Parameterclick(WebDriver driver) {
		
		 WebElement Parameterclick = driver.findElement(By.xpath("//body//nz-layout//nz-layout//li[3]"));
		return Parameterclick;
	}
	public static WebElement Parameterplusclick(WebDriver driver) {
		
		 WebElement Parameterplusclick = driver.findElement(By.xpath(" //button[@class='btn btn-primary btn-icon btn-icon-mini btn-round item-addbtn']/i"));
		return Parameterplusclick;
	}
	public static WebElement Parametername(WebDriver driver) {
		
		 WebElement Parametername = driver.findElement(By.xpath("//div[@class='row pt-3']/div/div/input[1]"));
		return Parametername;
	}
	public static WebElement Parametertype(WebDriver driver) {
		
		 WebElement Parametertype = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//div//div//div//input"));
		return Parametertype;
	}
	public static WebElement Parametertypeselect(WebDriver driver) {
		
		 WebElement Parametertypeselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//ng-dropdown-panel//div//div//div"));
		return Parametertypeselect;
	}
	public static WebElement Parameterstatus(WebDriver driver) {
		
		 WebElement Parameterstatus = driver.findElement(By.xpath("//form/div[4]/div[1]/div/ng-select/div/div/div[3]/input"));
		return Parameterstatus;
	}
	public static WebElement Parameterstatusselect(WebDriver driver) {
		
		 WebElement Parameterstatusselect = driver.findElement(By.xpath("//ng-dropdown-panel//div//div//div[1]"));
		return Parameterstatusselect;
	}
	
	public static WebElement ParameterBaseUOM(WebDriver driver) {
		
		 WebElement ParameterBaseUOM = driver.findElement(By.xpath("//form/div[4]/div[2]/div/ng-select/div/div/div[3]/input"));
		return ParameterBaseUOM;
	}
	public static WebElement ParameterBaseUOMselect(WebDriver driver) {
		
		 WebElement ParameterBaseUOMselect = driver.findElement(By.xpath("//ng-dropdown-panel//div//div//div[1]"));
		return ParameterBaseUOMselect;
	}
	public static WebElement Parametereffectivedate(WebDriver driver) {
		
		 WebElement Parametereffectivedate = driver.findElement(By.xpath("//input[@name='effectivedate']"));
		return Parametereffectivedate;
	}
	public static WebElement Parameterinctivedate(WebDriver driver) {
		
		 WebElement Parametereffectivedate = driver.findElement(By.xpath("//input[@name='inactivedate']"));
		return Parametereffectivedate;
	}
	public static WebElement Parameterdatatype(WebDriver driver) {
		
		 WebElement Parameterdatatype = driver.findElement(By.xpath("//form/div[6]/div[1]/div/ng-select/div/div/div[3]/input"));
		return Parameterdatatype;
	}
	public static WebElement Parameterdatatypeselect(WebDriver driver) {
		
		 WebElement Parameterdatatypeselect = driver.findElement(By.xpath("//form/div[6]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]"));
		return Parameterdatatypeselect;//form/div[7]/div[1]/div/textarea
	}
	public static WebElement Parameterdescription(WebDriver driver) {
		
		 WebElement Parameterdescription = driver.findElement(By.xpath("//form/div[7]/div[1]/div/textarea"));
		return Parameterdescription;
	}
	public static WebElement Parameterlabel(WebDriver driver) {
		
		 WebElement Parameterlabel = driver.findElement(By.xpath("//form/div[7]/div[2]/input"));
		return Parameterlabel;
	}
	public static WebElement Parameterenableversion(WebDriver driver) {
		
		 WebElement Parameterenableversion = driver.findElement(By.xpath("//label//div[1]"));
		return Parameterenableversion;
	}
	public static WebElement ParameterSave(WebDriver driver) {
		 WebElement ParameterSave = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
			return ParameterSave;
	}
	public static WebElement Addcross(WebDriver driver) {
		 WebElement Addcross = driver.findElement(By.xpath("//body//app-root//ul//span[2]"));
			return Addcross;
	}
	
	public static WebElement Parametersearchbox(WebDriver driver) {
		WebElement Parametersearchbox = driver.findElement(By.xpath("//*[@id=\"Grid_searchbar\"]"));
		return Parametersearchbox;
	}
	
	public static WebElement Parametersearchboxhit(WebDriver driver) {
		WebElement Parametersearchboxhit = driver.findElement(By.xpath("//*[@id=\"Grid_searchbutton\"]"));
		return Parametersearchboxhit;
	}
	public static WebElement Parametersearchclick(WebDriver driver) {
		WebElement Parametersearchclick = driver.findElement(By.xpath("//a[contains(text(),'"+UpdateParameter.ParName +"')]"));
		return Parametersearchclick;
	}
	public static WebElement Parameterselectedtype(WebDriver driver) {
		WebElement Parameterselectedtype = driver.findElement(By.xpath("//body//ng-select[@placeholder='Select Type']//div//div//span[2]"));
		return Parameterselectedtype;
	}
	public static WebElement Parameterselectedstatus(WebDriver driver) {
		WebElement Parameterselectedstatus = driver.findElement(By.xpath("//form/div[4]/div[1]/div/ng-select/div/div/div[2]/span[2]"));
		return Parameterselectedstatus;
	}
	public static WebElement Parameterselectedbaseuom(WebDriver driver) {
		WebElement Parameterselectedbaseuom = driver.findElement(By.xpath("//form/div[4]/div[2]/div/ng-select/div/div/div[2]/span[2]"));
		return Parameterselectedbaseuom;
	}
	public static WebElement Parameterselecteddatatype(WebDriver driver) {
		WebElement Parameterselecteddatatype = driver.findElement(By.xpath("//form/div[6]/div[1]/div/ng-select/div/div/div[2]/span[2]"));
		return Parameterselecteddatatype;
	}
	public static WebElement Parameterversionsection(WebDriver driver) {
		WebElement Parameterversionsection = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//div//li[1]//a[1]"));
		return Parameterversionsection;
	}
	public static WebElement Parameterversionaddbutton(WebDriver driver) {
		WebElement Parameterversionadd = driver.findElement(By.id("VersionGrid_add"));
		return Parameterversionadd;
	}
	public static WebElement ParameterversionExpandalllink(WebDriver driver) {
		WebElement ParameterversionExpandall = driver.findElement(By.xpath("//div[@class='row mr-0 ng-star-inserted']/div/span"));
		return ParameterversionExpandall;
	}
	public static WebElement ParameterversionCaption(WebDriver driver) {
		WebElement ParameterversionCaption = driver.findElement(By.xpath("//input[@name='dataentrycaption']"));
		return ParameterversionCaption;
	}
	public static WebElement ParameterversionDateformat(WebDriver driver) {
		WebElement ParameterversionCaption = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div[1]/div[2]/ng-select/div/div/div[2]/input"));
		return ParameterversionCaption;
	}
	public static WebElement ParameterversionDateformatselect(WebDriver driver) {
		WebElement ParameterversionDateformatselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Type']//ng-dropdown-panel//div//div//div[1]//span"));
		return ParameterversionDateformatselect;
	}
	public static WebElement ParameterversionStepnolabel(WebDriver driver) {
		WebElement ParameterversionStepnolabel = driver.findElement(By.xpath("//input[@name='stepnolabel']"));
		return ParameterversionStepnolabel;
	}
	public static WebElement ParameterversionStepno(WebDriver driver) {
		WebElement ParameterversionStepno = driver.findElement(By.xpath("//input[@name='stepno']"));
		return ParameterversionStepno;
	}
	public static WebElement ParameterversionSortno(WebDriver driver) {
		WebElement ParameterversionSortno = driver.findElement(By.xpath("//input[@name='sortno']"));
		return ParameterversionSortno;
	}
	public static WebElement ParameterversiondataentryInstructions(WebDriver driver) {
		WebElement ParameterversiondataentryInstructions = driver.findElement(By.xpath("//input[@name='dataentryinstructions']"));
		return ParameterversiondataentryInstructions;
	}	
	public static WebElement ParameterversionBaseUOM(WebDriver driver) {
		WebElement ParameterversionBaseUOM = driver.findElement(By.xpath("//ng-select[@placeholder='Select Base UOM']//div//div//div//input"));
		return ParameterversionBaseUOM;
	}
	public static WebElement ParameterversionSelectBaseUOM(WebDriver driver) {
		WebElement ParameterversionBaseUOM = driver.findElement(By.xpath("//ng-dropdown-panel/div/div[2]/div[1]"));
		return ParameterversionBaseUOM;
	}
	public static WebElement Parameterversionstart(WebDriver driver) {
		WebElement Parameterversionstart = driver.findElement(By.xpath("//input[@name='versionstart']"));
		return Parameterversionstart;
	}
	public static WebElement Parameterversionend(WebDriver driver) {
		WebElement Parameterversionend = driver.findElement(By.xpath("//input[@name='versionend']"));
		return Parameterversionend;
	}
	public static WebElement ParameterSaveversionbutton(WebDriver driver) {
		WebElement ParameterversionSave = driver.findElement(By.xpath("//button[contains(text(),'Save Version')]"));
		return ParameterversionSave;
	}
	public static WebElement ParameterVersioncreated(WebDriver driver) {
		WebElement ParameterVersioncreated = driver.findElement(By.xpath("//*[@id=\"VersionGrid_content_table\"]/tbody/tr"));
		return ParameterVersioncreated;
	}
	
	public static WebElement ParameterversionDateformatselected(WebDriver driver) {
		WebElement ParameterversionDateformatselected = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div[1]/div[2]/ng-select/div/div/div[2]/span[2]"));
		return ParameterversionDateformatselected;
	}  
	
	public static WebElement ParameterversionDefaultUOMselected(WebDriver driver) {
		WebElement ParameterversionDefaultUOMselected = driver.findElement(By.xpath("//ng-select[@placeholder='Select Base UOM']//div//div//span[2]"));
		return ParameterversionDefaultUOMselected;
	}
	public static WebElement ParameterversionupdateDateformat(WebDriver driver) {
		WebElement ParameterversionupdateDateformat = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div[1]/div[2]/ng-select/div/div/div[3]/input"));
		return ParameterversionupdateDateformat;
	}
	public static WebElement ParameterversionupdateDateformatselect(WebDriver driver) {
		WebElement ParameterversionupdateDateformatselect = driver.findElement(By.xpath("//ng-dropdown-panel//div//div//div[2]"));
		return ParameterversionupdateDateformatselect;
	}
	
	
	
	////////////////////////////Parameter Sections tab paths/////////////////////////////////////
	public static WebElement Parametersections(WebDriver driver) {
		WebElement Parametersections = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//div//li[2]//a[1]"));
		return Parametersections;
	}
	
	public static WebElement ParametersectionsAddbutton(WebDriver driver) {
		WebElement ParametersectionsAddbutton = driver.findElement(By.id("sectionParameter_add"));
		return ParametersectionsAddbutton;
	}
	
	public static WebElement ParametersectionsRecipe(WebDriver driver) {
		WebElement ParametersectionsRecipe = driver.findElement(By.xpath("//ng-select[@placeholder='Select Recipe']//div//div//div//input"));
		return ParametersectionsRecipe;
	}
	public static WebElement ParametersectionsRecipeselect(WebDriver driver) {
		WebElement ParametersectionsRecipeselect = driver.findElement(By.xpath("//span[contains(text(),'"+ParameterRecipe.recipename+"')]"));
		return ParametersectionsRecipeselect;
	}
	public static WebElement ParametersectionsRecipesection(WebDriver driver) {
		WebElement ParametersectionsRecipesection = driver.findElement(By.xpath("//ng-select[@placeholder='Select Section']//div//div//div//input"));
		return ParametersectionsRecipesection;
	}
	public static WebElement ParametersectionsRecipesectionselect(WebDriver driver) {
		WebElement ParametersectionsRecipesectionselect = driver.findElement(By.xpath("//span[contains(text(),'"+ParameterRecipe.childsecname+"')]"));
		return ParametersectionsRecipesectionselect;
	}
	public static WebElement Parametersectionsversionstart(WebDriver driver) {
		WebElement Parametersectionsversionstart = driver.findElement(By.xpath("//div//div//div//div//form//div[3]//div[1]//input[1]"));
		return Parametersectionsversionstart;
	}
	
	public static WebElement ParametersectionsSavebutton(WebDriver driver) {
		WebElement ParametersectionsSavebutton = driver.findElement(By.xpath("//*[@id=\"sectionParameter_dialogEdit_wrapper\"]/div[3]/button[1]"));
		return ParametersectionsSavebutton;
	}
	public static WebElement Parameterattributeclick(WebDriver driver) {
		WebElement Parameterattributeclick = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//li[4]//a[1]"));
		return Parameterattributeclick;
	}
	public static WebElement Parameterattributeplusclick(WebDriver driver) {
		WebElement Parameterattributeplusclick = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/div[1]/i"));
		return Parameterattributeplusclick;
	}
	public static WebElement Parameterattributedropdown(WebDriver driver) {
		WebElement Parameterattributedropdown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//div//div//div//input"));
		return Parameterattributedropdown;
	}
	public static WebElement Parameterattributedropdownselect(WebDriver driver) {
		WebElement Parameterattributedropdownselect = driver.findElement(By.xpath("//ng-select[@placeholder='Select Attributes']//ng-dropdown-panel//div//div//div[1]//span"));
		return Parameterattributedropdownselect;
	}
	public static WebElement Parameterattributeyesclick(WebDriver driver) {
		WebElement Parameterattributeyesclick = driver.findElement(By.xpath("//body/modal-container/div/div/div/button[1]"));
		return Parameterattributeyesclick;
	}
	public static WebElement Parameterattribuetgroupclick(WebDriver driver) {
		WebElement Parameterattribuetgroupclick = driver.findElement(By.xpath("//app-attributes/div/div/div[1]/ul/li/label"));
		return Parameterattribuetgroupclick;
	}
	public static WebElement Parameterattribuetvalueenter(WebDriver driver) {
		WebElement Parameterattribuetvalueenter = driver.findElement(By.xpath("//div[@class='col-sm-7']/input"));
		return Parameterattribuetvalueenter;
	}
	public static WebElement ParameterattribuetSave(WebDriver driver) {
		WebElement ParameterattribuetSave = driver.findElement(By.xpath("//app-attributes/div/div/div[2]/div/button"));
		return ParameterattribuetSave;
	}
	
	//////////////Parameter tag paths//////////////////////////////
	public static WebElement ParameterTagsclick(WebDriver driver) {
		WebElement ParameterTagsclick = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//li[5]"));
		return ParameterTagsclick;
	}
	public static WebElement ParameterTagsfielddropdowm(WebDriver driver) {
		WebElement ParameterTagsfielddropdowm = driver.findElement(By.xpath("//ng-select[@placeholder='Select Tags']//div//div//div//input"));
		return ParameterTagsfielddropdowm;
	}
	public static WebElement ParameterTagsSave(WebDriver driver) {
		WebElement ParameterTagsSave = driver.findElement(By.xpath("//app-tags/div/div/button"));
		return ParameterTagsSave;
	}
	public static WebElement ParameterTagsfieldverify(WebDriver driver) {
		WebElement ParameterTagsfieldverify = driver.findElement(By.xpath("//app-tags/div/ng-select/div/div/div[2]/span[2]"));
		return ParameterTagsfieldverify;
	}
	public static WebElement ParameterTagsdeselect(WebDriver driver) {
		WebElement ParameterTagsdeselect = driver.findElement(By.xpath("//app-tags/div/ng-select/div/div/div[2]/span[1]"));
		return ParameterTagsdeselect;
	}
	public static WebElement ParameterTagsfieldselectverify(WebDriver driver) {
		WebElement ParameterTagsfieldselectverify = driver.findElement(By.xpath("//app-tags/div/ng-select/div/div/div[2]"));
		return ParameterTagsfieldselectverify;
	}
	public static WebElement Parametercommentsection(WebDriver driver) {
		WebElement Parametercommentsection = driver.findElement(By.xpath("//nz-layout//nz-layout//nz-layout//li[3]"));
		return Parametercommentsection;
	}
	public static WebElement Parametercommenttextfield(WebDriver driver) {
		WebElement Parametercommentsection = driver.findElement(By.xpath("//nz-comment-content[@class='ant-comment-content-detail']/nz-form-item[1]/textarea"));
		return Parametercommentsection;
	}
	public static WebElement Parametercommentsavebutton(WebDriver driver) {
		WebElement Parametercommentsavebutton = driver.findElement(By.xpath("//nz-comment-content[@class='ant-comment-content-detail']/nz-form-item[2]/button"));
		return Parametercommentsavebutton;
	}
	public static WebElement Parametercommenttextfieldverify(WebDriver driver) {
		WebElement Parametercommenttextfieldverify = driver.findElement(By.xpath("//nz-comment-content/p"));
		return Parametercommenttextfieldverify;
	}
}
