package listners;

import org.testng.Assert;

public class dependancy {
	@Test
	public void test1()
	{
		System.out.println("banglore");
	}
    @Test
	public void test2()
    {
    	System.out.println("karnataka");
    	Assert.fail();
    }
    @Test(dependsOnMethods="test2")
    public void test3()
    {
    	System.out.println("india");
    }
}
