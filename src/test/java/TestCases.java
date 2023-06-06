import org.testng.annotations.*;

public class TestCases {

    @Test(dependsOnMethods = {"second"})
    public void first(){
        System.out.println("first");

    }
    @Test
    public void second(){
        System.out.println("second");

    }
    @Test(dependsOnMethods = {"forth"})
    public void third(){
        System.out.println("third");

    }
    @Test
    public void forth(){
        System.out.println("forth");

    }
    @Test
    public void fifth(){
        System.out.println("fifth");

    }

}


