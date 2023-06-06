import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Test
public class SoftAsserts {
    public void sum(){
        int a=10;
        int b=20;

        SoftAssert obj= new SoftAssert();
        obj. assertEquals(a+b, 50);

    }
}
