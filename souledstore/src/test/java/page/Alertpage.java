package page;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;

	import base.Baseclass;

	public class Alertpage extends Baseclass 
	{
		public void clickalertmsg()
		{
		Alert a=driver.switchTo().alert();
		driver.findElement(By.xpath("//*[@id=\"desktopBannerWrapped\"]/div/div[2]/span ")).click();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		}
}
