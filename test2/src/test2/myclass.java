package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
         
public class myclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbstudent\\Desktop\\testcase\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("start-maximixed");
	options.addArguments("disable-infobar ");
	options.addArguments("--incognito");
	options.addArguments("--ignore-certificate-error");
	options.addArguments("--disable-popup-blocking");
		
		
		WebDriver driver = new ChromeDriver();
		
		//Opening the Website		                                
			driver.get("https://demo.opencart.com/index.php?route=account/login");	
			driver.manage().window().maximize();
			 System.out.println("Window is opened");
				 
		     //Comparing Page title
		     String actualpagetitle = driver.getTitle();
			 String expectedTitle = "Account Login";
					 
			if (actualpagetitle.contentEquals(expectedTitle)){
			   System.out.println("Test Passed!");
		    } else {
	          System.out.println("Test Failed");
				        }

			//Enter Email
		   WebElement email;
 		   email = driver.findElement(By.id("input-email"));
	       email.sendKeys("9876@gmail.com");
		   System.out.println("Email is entered");
					 
			//Enter Password
			 WebElement pass1;
			pass1 = driver.findElement(By.id("input-password"));
		    pass1.sendKeys("asdf123");
			System.out.println("Password is entered");
					 
			//Clicking on Login button
			WebElement loginButton;  
			loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			loginButton.click(); 
			System.out.println("Login button is clicked!");
					  
			//Comparing Page title
			String actualpagetitle2 = driver.getTitle();
			 String expectedTitle2 = "My Account";
						 
			if (actualpagetitle2.contentEquals(expectedTitle2)){
			         System.out.println("Test Passed!");
		      } else {
					  System.out.println("Test Failed");
					   }
			
			//Enter Password
			 WebElement search;
			search = driver.findElement(By.name("search"));
		    search.sendKeys("HP LP3065");
			System.out.println("Search is entered");
			
			//Clicking on Login button
			WebElement searchButton;  
			searchButton = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
			searchButton.click(); 
			System.out.println("search button is clicked!");
			
			//Cart button
			WebElement tButton;  
		tButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a"));
			tButton.click(); 
			System.out.println("Cart button is clicked!");
			
			
			//Clicking on Cart button
			WebElement cartButton;  
			cartButton = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
			cartButton.click(); 
			System.out.println("Cart is added!");
			
			//Clicking on Cart button
			WebElement ppButton;  
			ppButton = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
			ppButton.click(); 
			System.out.println("Cart menu!");
			
			//Clicking on Cart button
			WebElement pppButton;  
			pppButton = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"));
			pppButton.click(); 
			System.out.println("view!");
			
			//Clicking on Cart button
			WebElement poButton;  
			poButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]"));
			poButton.click(); 
			System.out.println("Deleted");
			
			
	
	}

}
