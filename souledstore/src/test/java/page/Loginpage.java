package page;


	import org.openqa.selenium.By;

	import base.Baseclass;

	public class Loginpage extends Baseclass
	{
	   public void login ()
	    {
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/ul/li[1]/span ")).click();
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/button/div[2] ")).click();
	   
	    }
	}

