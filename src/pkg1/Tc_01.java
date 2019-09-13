package pkg1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(MyListner.class)
public class Tc_01 {

	@Test
	public void m1() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");

//WebElement actual=driver.findElement(By.xpath("//input[@id='email']")).sendKeys("98902120047");

//String expected=driver.findElement(By.xpath("//div[@class='_5v-0 _53in']").);
//Assert.assertEquals(actual, expected);

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asadfg45");
}

@Test
public void m2() {
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(10, 10);
	soft.assertEquals(13, 13);
	soft.assertEquals(10, 10);
	soft.assertAll();


}	
}
