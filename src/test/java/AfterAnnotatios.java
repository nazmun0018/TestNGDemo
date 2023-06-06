import org.testng.annotations.*;

public class AfterAnnotatios {

    @AfterMethod
    public void first() {
        System.out.println("this is  the after suite annotation");

    }

    @AfterClass
    public void second() {
        System.out.println("this is the after test annotation");

    }

   @AfterTest
    public void third() {
        System.out.println("this is the after class");

    }

    @AfterSuite
    public void forth() {
        System.out.println("this is the after method");

    }

   @Test
    public void fifth() {
        System.out.println("this is the main test class");
    }

}