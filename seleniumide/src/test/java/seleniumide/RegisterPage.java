package seleniumide;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	public static void main(String[] args){
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demo.automationtesting.in/Register.html");
		  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("abc");
		  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("d");
		  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("#65 sgdhfgurt");
		  driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("abc@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("987654321");
		  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		  driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,150)", "");
		  driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		  Select skills = new Select(driver.findElement(By.name("//*[@id=\\\"msdd\\")));
		  skills.selectByIndex(0);
		  
		  Select skills1 = new Select(driver.findElement(By.name("//*[@id=\"Skills\"]")));
		  skills1.selectByVisibleText("Java");
		  
		  
		  
		  
}
}
