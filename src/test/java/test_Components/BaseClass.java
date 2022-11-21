package test_Components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_Objects.Landing_Page;

public class BaseClass 
{
public WebDriver driver;
public String url;
public Landing_Page landing_Page;
public WebDriver initilizeDriver() throws IOException 
{
Properties properties=new  Properties();
FileInputStream  stream=new FileInputStream("D:\\TESTING\\SELENIUM+ ECLIPSE\\cucumber_\\0_Hybdrid_Framework_Practise\\src\\main\\java\\resources\\global.properties");
properties.load(stream);	
String browserName=properties.getProperty("browser");
url=properties.getProperty("url");

if(browserName.equals("chrome")) 
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
else if(browserName.equals("firefox")) 
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}
if(browserName.equals("edge")) 
{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return driver;
}	

@BeforeMethod
public Landing_Page loginApplication() throws IOException 
{
	driver=initilizeDriver();
	driver.get(url);
	landing_Page=new Landing_Page(driver);
	return landing_Page;
}

@AfterMethod
public void closeApplication()
{
driver.close();	
}
}
