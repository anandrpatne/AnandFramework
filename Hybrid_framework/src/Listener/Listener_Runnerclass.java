package Listener;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_Runnerclass {
@Test
public void compose()
{
	System.out.println("Message composed");
}
@Test
public void sentitems()
{
	System.out.println("message sent");
	Assert.fail();
}
@Test(dependsOnMethods ="SentItems")
public void trash()
{
	System.out.println("message deleted");
	


	

}
}
