package seleniumtestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LoginFunctionalityTest.getDriver();
		
				driver.get("http://159.89.38.11/login");
				//log in
				WebElement element =driver.findElement(By.id("email-1"));
				element.sendKeys("test@orangetoolz.com");
				driver.findElement(By.id("password-1")).sendKeys("8Kh8nTe*^jdk");
				driver.findElement(By.id("checkbox-1")).click();
				driver.findElement(By.id("m_login_signin_submit")).click();
				
				//contact click
				WebElement target =driver.findElement(By.id("main-sidebar"));
				WebElement targ =driver.findElement(By.cssSelector("a[href*=\"contact\"]"));
				Actions s =new Actions (driver);
				s.moveToElement(target);
				s.click(targ);
				s.build().perform();
				
				//click add contact
				
				driver.findElement(By.xpath("//a[@class='btn btn-shadow btn-info compose-btn add-contact'][1]")).click();
				
			// select check box
				driver.findElement(By.xpath("//div[@id='new-group-append-in-add-contact'][1]/div[@class='dt-checkbox dt-checkbox-todo mb-3 '][last()]")).click();
				
			//	new tag
			
				driver.findElement(By.cssSelector("a.add-new-group")).click();
				
				driver.findElement(By.cssSelector("input[required='required'] ")).sendKeys("Roky Bhai");
				driver.findElement(By.cssSelector("textarea[placeholder='Write your group description here...']")).sendKeys("KGF Chapter 3");
				driver.findElement(By.cssSelector(".btn-primary[value='Add Tag']")).click();
				
				Thread.sleep(3000);
			//fill up contact form
				driver.findElement(By.cssSelector("form div.form-row div div input.form-control.form-control-sm[name='number'][placeholder='Enter Number']")).sendKeys("01500000000");
				driver.findElement(By.cssSelector("form div.form-row div div input.form-control.form-control-sm[name='email'][placeholder='Enter Email address']")).sendKeys("RokyVai@gmail.com");
				driver.findElement(By.cssSelector(".form-control-sm[placeholder='Enter First name']")).sendKeys("Roky");
				driver.findElement(By.cssSelector(".form-control-sm[placeholder='Enter Last name']")).sendKeys("Bhai");
				driver.findElement(By.cssSelector(".datetimepicker-input")).sendKeys("22-12-1951");
				
			//Address
				driver.findElement(By.cssSelector(".form-control-sm[name='city']")).sendKeys("Dhaka");
				driver.findElement(By.cssSelector(".form-control-sm[name='state']")).sendKeys("Dhaka");
				driver.findElement(By.cssSelector(".form-control-sm[name='zip']")).sendKeys("1230");
				driver.findElement(By.cssSelector(".form-control-sm[name='country']")).sendKeys("Bangladesh");
				driver.findElement(By.cssSelector(".form-control-sm[name='address']")).sendKeys("PCF9+86W, Dhaka 1222");
				driver.findElement(By.cssSelector("button.btn.btn-primary.submit-file")).click();
}           
}