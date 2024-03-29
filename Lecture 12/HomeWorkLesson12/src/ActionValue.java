
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ActionValue{

	WebDriver driver;
	
	@Before
	public void setup(){
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.get("http://dl.dropboxusercontent.com/u/55228056/Config.html");
	}
	@After
	public void tearDown(){
		this.driver.quit();
	}
	
	
	@Test
	public void myFirstTest(){
		
		  WebElement selectFirstElement = driver.findElement(By.name("airbags"));
		  selectFirstElement.click();
		  WebElement selectSecondElement = driver.findElement(By.name("parksensor"));
		  selectSecondElement.click();
		  
		  if (selectFirstElement.isSelected()) {
			   String firstSelect = selectFirstElement.toString();
			  System.out.println("Your select is :" + firstSelect );
			
		  }else {
			  System.out.println("You have not selected value! ");
			
		} 
		  
		  if (selectSecondElement.isSelected()) {
			  String secondSelect = selectSecondElement.toString();
			  System.out.println("Your select is : " + secondSelect);
			
		}else {
			System.out.println("You have not selected value! ");
			
		}
		  
		  
		  
		  

		
	}
	

	
}