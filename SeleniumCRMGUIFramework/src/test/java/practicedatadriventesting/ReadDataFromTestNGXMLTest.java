package practicedatadriventesting;


import org.testng.annotations.Test;
import org.testng.xml.XmlTest;


public class ReadDataFromTestNGXMLTest 
{
	@Test
	public void sampleTest(XmlTest test)
	{
		System.out.println("execute sampletest");
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("url"));
		System.out.println(test.getParameter("username"));
		System.out.println(test.getParameter("password"));
		
	}

}
