package Timf_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class timf_member_admission {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://timf.imikrof.com/");
		    Thread.sleep(2000);
			
		    WebElement user = driver.findElement(By.id("email"));
			user.clear();
			user.sendKeys("it0062");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.clear();
			pass.sendKeys("##imikrof@2021");
			
			WebElement login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
			login.click();
			
			
			
			
			driver.get("https://timf.imikrof.com/s/member_information_create");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			

		      // samity_Name	:
		      Select Samity = new Select(driver.findElement(By.id("samity")));
		      Samity.selectByVisibleText("0062-001-001 Komolpur");
		      
		      //Member_name
		      WebElement m_name = driver.findElement(By.id("m_member_name"));
		      m_name.sendKeys("test");
		      
		      //Sur_name
		      WebElement s_name = driver.findElement(By.id("m_member_sure_name"));
		      s_name.sendKeys("sur test");

		      //Product_category_name
		      Select product = new Select(driver.findElement(By.id("cbo_primary_product")));
		      product.selectByVisibleText("Micro Credit - MC");
				     
			 //gender_select
		      Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"member\"]/div[2]/table/tbody/tr[4]/td[3]/select")));
		      gender.selectByVisibleText("Male");
		      
		      //Calendar_select
		      WebElement date_select = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[4]/input"));
		      date_select.sendKeys("2001-02-17");
		      
		      //Marital_status
		      Select marital_status = new Select(driver.findElement(By.xpath("//*[@id=\"txt_marital_status\"]")));
		      marital_status.selectByVisibleText("Unmarried");
		      
		      //Mother Name
		      WebElement mother_name = driver.findElement(By.xpath("//*[@id=\"m_mother_name\"]"));
		      mother_name.sendKeys("mtest name");
		      

		      //Father Name
		      WebElement father_name = driver.findElement(By.xpath("//*[@id=\"f_father_name\"]"));
		      father_name.sendKeys("fathiar");
		      
		      //Spouse_name
		      WebElement Spouce_name = driver.findElement(By.xpath("//*[@id=\"Spouse_name\"]"));
		      Spouce_name.sendKeys("fokirni");
		      
		      //Birth Registration Number
		      WebElement Birth_registration = driver.findElement(By.xpath("//*[@id=\"m_birth_registration_no\"]"));
		      Birth_registration.sendKeys("");
		      
		      //Natinaol_Id
		      WebElement National_id = driver.findElement(By.xpath("//*[@id=\"m_national_id\"]"));
		      National_id.sendKeys("12345678901012");
		      
		      //Smart_card
		      WebElement smart_card = driver.findElement(By.xpath("//*[@id=\"smart_card\"]"));
		      smart_card.sendKeys("");
		      
		      //Education_level
		      Select Education_level = new Select(driver.findElement(By.xpath("//*[@id=\"m_education_label\"]")));
		      Education_level.selectByVisibleText("Primary");
		      
		      //Mobile_no
		      WebElement Mobile_no = driver.findElement(By.xpath("//*[@id=\"m_mobile_no\"]"));
		      Mobile_no.sendKeys("01796722459");
		      
		      //Passbook_no
		      WebElement passbook_no = driver.findElement(By.xpath("//*[@id=\"passbook_no\"]"));
		      passbook_no.sendKeys("4569");
		      
		      //ADDRESS_SELECT
		      //Divison_s
		   
		      
		    //Divison_s
		      Select division = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]/select")));
		      division.selectByVisibleText("Rajshahi");
		      
		    //District_s
		      Select District = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[3]/select")));
		      District.selectByVisibleText("Bogra");
		      
		    //Thana_s
		      Select Thana = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[4]/select")));
		      Thana.selectByVisibleText("Bogra Sadar");
		      
		    //Union_s
		      Select Union = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[5]/select")));
		      Union.selectByVisibleText("Ashekpur");
		      
		    //Village_s
		      Select village = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[6]/select")));
		      village.selectByVisibleText("Boiradigi");
		      
		    //Working_s
		      Select working_area = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[7]/select")));
		      working_area.selectByVisibleText("Boiradigi");
		      
		      //Addition
		      WebElement addition_address = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/textarea"));
		      addition_address.sendKeys("Kazipara,Mirpur-10");
		      
		      //Same_as_present
		      WebElement Check_box = driver.findElement(By.xpath("//*[@id=\"same_as_present_address\"]"));
		      Check_box.click();
		      
		      //Religion
		      Select religion = new Select(driver.findElement(By.xpath("//*[@id=\"m_religion\"]")));
		      religion.selectByVisibleText("Muslim");
		      
		      //Gardian_Info
		      
		      WebElement Gardina_name = driver.findElement(By.xpath("//*[@id=\"m_member_gardian_name\"]"));
		      Gardina_name.sendKeys("tethera");
		      
		    //Date_of_Birth
		      WebElement gardian_age = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[7]/div[2]/div[2]/table/tbody/tr[2]/td[2]/input"));
		      gardian_age.sendKeys("1986-02-17");
		      
		      
		      ////Birth Registration Number
		      WebElement Gardian_birth = driver.findElement(By.xpath("//*[@id=\"m_gardian_national_id\"]"));
		      Gardian_birth.sendKeys("");
		      
		      //Natinaol_Id
		      WebElement gardian_national = driver.findElement(By.xpath("//*[@id=\"m_gardian_national_id\"]"));
		      gardian_national.sendKeys("12345988901012");
		      
		      //Smart_card
		      WebElement gardian_smart = driver.findElement(By.xpath("//*[@id=\"m_gardian_smart_card\"]"));
		      gardian_smart.sendKeys("");
		      
		      
		      //Mobile_no
		      WebElement Gardian_mobile = driver.findElement(By.xpath("//*[@id=\"m_gardian_mobile_no\"]"));
		      Gardian_mobile.sendKeys("01796722409");
		      
		      //Relation
		      WebElement relation = driver.findElement(By.xpath("//*[@id=\"m_gardian_relation\"]"));
		      relation.sendKeys("rela");
		      
		    
		      
		      
		      //SAVE
		      WebElement Save_member = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[12]/table/tbody/tr/td/button"));
		      Save_member.click();
		      
		      
		      
		      
		      
		      
		      Thread.sleep(1000);
			  //driver.close();
			  //driver.quit();

	}

}
