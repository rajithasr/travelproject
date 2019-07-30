package travelproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	
	}

}
