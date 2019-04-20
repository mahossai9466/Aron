package SELFPRACTICE;


import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_web_driver 
{

public static void main(String[] args) 

{
	
System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\DRIVERS\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();

driver.findElementByXPath("//a[@class='gb_d']").click();
driver.findElementByLinkText("Create an account").click();










		
}

}