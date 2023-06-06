import org.testng.annotations.*;

public class BeforeAnnotation {

    @BeforeSuite
     public void first(){
        System.out.println("this is  the before suite annotation");

     }
   @BeforeTest
     public void second(){
       System.out.println("this is the beforetest annotation");

     }
   @BeforeClass
     public void third(){
       System.out.println("this is the before class");

     }
   @BeforeMethod
      public void forth(){
       System.out.println("this is the before method");

      }
   @Test
      public void fifth(){
       System.out.println("this is the main test class");

      }

}
