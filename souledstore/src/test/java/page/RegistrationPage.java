package page;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import base.Baseclass;

	public class RegistrationPage extends Baseclass
	  {
	public RegistrationPage(ChromeDriver driver)
	  {
		PageFactory.initElements(driver, this);
	  }
	//@Test
	public void register() 
	{
		 driver.findElement(By.xpath( "//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/ul/li[2]/span ")).click();
	}
	 
	  
	  }


