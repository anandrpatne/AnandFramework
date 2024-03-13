package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Facebook {
	@Test
	public static String fetchprop() throws FileNotFoundException, IOException
	{
	Properties p=new Properties();
	p.load(new FileInputStream("./anand.properties"));
	String val = p.getProperty("baseURL");
	return val;
	}
}
