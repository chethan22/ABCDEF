package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class loginpom  {
	
	
	public static WebElement image_ver(WebDriver driver)
	{
		 WebElement image1 = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div/div[2]/div[1]/img"));
		return image1;
		
	}
	
	
	public static WebElement username_textbox(WebDriver driver)
	{
		 WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Please enter your user name']"));
		 
		return UserName;
		
	}

	public static WebElement password_textbox(WebDriver driver) {
		 WebElement Password = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div/div[2]/div[2]/form/div[2]/input"));
		return Password;
		
	}

	public static WebElement login_btn(WebDriver driver) {
		
		 WebElement Loginbtn = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div/div[2]/div[2]/form/div[3]/div/input"));
		System.out.println("clicked");
		return  Loginbtn;
		
	}
	

	

}
