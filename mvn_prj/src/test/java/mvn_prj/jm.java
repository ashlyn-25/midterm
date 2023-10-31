package mvn_prj;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;
public class jm{
	@Test
	public void logintest1()
	{
		demo obj=new demo();
		Assert.assertEquals(0,obj.login ("somename","somepass"));
	}
	@Test
	public void logintest2()
	{
		demo obj1=new demo();
		Assert.assertEquals(1,obj1.login ("ashlyn","1234"));
	}
}