package Timf_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Timf_log_In {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://timf.imikrof.com/");
			driver.manage().window().maximize();
			
			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("it0062");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.clear();
			pass.sendKeys("##imikrof@2021");
			
			WebElement login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
			login.click();
			
			driver.get("https://timf.imikrof.com/s/samity/create");
			
				WebElement s_name = driver.findElement(By.xpath("//*[@id=\"container\"]/section/div/form/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[2]/input"));
				s_name.clear();
				s_name.sendKeys("0062-096");
			
				Select product = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/section/div/form/div/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[2]/select")));
			    product.selectByVisibleText("Micro Credit - MC");
			    
			    Thread.sleep(2000);

	}

}
