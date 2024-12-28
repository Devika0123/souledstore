package test;


	import org.testng.annotations.Test;

	import base.Baseclass;
    import page.Alertpage;
    import page.Loginpage;
	

	public class Test02 extends Baseclass
	{
		
	
		@Test
	 public void test1()
	 {
		Test01 tc=new Test01() ;
		tc.test01();
	 }
		@Test
		public void clickalertmsg ()
		{
			Alertpage ap=new Alertpage();
			ap.clickalertmsg();
		}
		@Test
		public void login()
		{
			Loginpage lo=new Loginpage();
			lo.login();
			
		}
		
		
	 }

