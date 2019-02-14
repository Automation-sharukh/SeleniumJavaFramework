package demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGParameterDemo 
{
    @Test
    @Parameters({"MyName"})
	public void test(String name)
	{
		System.out.println("Name is :"+name);
	}
	
}
