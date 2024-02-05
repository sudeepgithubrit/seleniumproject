package seleniumide;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datepicker {
	public static void main(String[] args) throws Throwable {
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demo.automationtesting.in/Datepicker.html");
		  driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td//a[text()='2']")).click();
}
}
