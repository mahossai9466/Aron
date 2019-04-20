package SITS;


import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_web_driver {

public static void main(String[] args) 

{
	
System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\DRIVERS\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.findElementByName("firstname").sendKeys("Priscilla");
driver.findElementByLinkText("Sign Up").click();
driver.findElementByXPath("//input [@name='reg_email__']").sendKeys("12345");



driver.close();


//driver.findElementByLinkText("Gmail").click();
//driver.findElementByLinkText("Create an account").click();
//driver.findElement(By.id("lastName")).sendKeys("Aron");
//driver.findElementByName("firstName").sendKeys("Priscilla");

		
	}

}
