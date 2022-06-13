package Timf_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reportcheck {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://timf.imikrof.com/");
		driver.manage().window().maximize();
	      
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("imikrof");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("##imikrof@2021");
		
		WebElement login = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
		
		driver.get("https://timf.imikrof.com/PKSF_POMIS_1_REPORT");
		//Report Level	:
	      Select report_level = new Select(driver.findElement(By.name("report_level")));
	      report_level.selectByVisibleText("Branch");
	      
	      //Branch 	:
	      Select branch = new Select(driver.findElement(By.xpath("//*[@id=\"filter_bazr_info\"]")));
	      branch.selectByVisibleText("0063 - Kichok Branch");
	      
	      //Month
	      Select month = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/table/tbody/tr[2]/td[3]/select\r\n"
	      		+ "")));
	      month.selectByVisibleText("May");
	      
	      //Year
	      Select year = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/table/tbody/tr[2]/td[4]/select")));
	      year.selectByVisibleText("2022");
	      
	      //Show
	      WebElement show = driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/table/tbody/tr[2]/td[7]/button"));
	      show.click();
	      
		
	      Thread.sleep(500);
		  Thread.sleep(500);
		

	}

}
