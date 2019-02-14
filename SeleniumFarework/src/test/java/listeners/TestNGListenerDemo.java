package listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListenerDemo 
{
	@Test
  public void test1()
  {
	  System.out.println("I am inside test1");
	  
  }
	@Test
  public void test2()
  {
	  System.out.println("I am inside test2");
	  Assert.assertTrue(false);
  }@Test
  public void test3()
  {
	  System.out.println("I am inside test3");
	  throw new SkipException("This is skipped");
	  
  }
}
