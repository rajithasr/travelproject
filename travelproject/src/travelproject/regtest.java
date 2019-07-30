package travelproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
	
	}  

}
