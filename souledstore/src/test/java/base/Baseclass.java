package base;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	public class Baseclass 
	  {
		public static  ChromeDriver driver;
		  @BeforeTest
		  public void setUp()
		  {
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
		  }  
		  @AfterTest
		  public void tearDown() 
		  {
			//driver.quit();  
		  }

}
