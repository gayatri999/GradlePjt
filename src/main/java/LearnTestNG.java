
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG{
	
    @BeforeMethod
    public void setup()
    {
        System.out.println("Before Method");
    }

    @Test
    public void test()
    {
        System.out.println("I am in Test");
    }

    @AfterMethod
    public void tearDown()
    {
        System.out.println("After Method");
    }
}
