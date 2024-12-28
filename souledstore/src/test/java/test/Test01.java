package test;

import org.testng.annotations.Test;

import base.Baseclass;


	public class Test01 extends Baseclass 
	{
		@Test
		public void test01()
		{
			driver.get("https://www.thesouledstore.com");
		}
}
