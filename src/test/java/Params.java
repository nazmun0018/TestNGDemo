import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
    @Parameters( {"val1","val2"})
    @Test
    public void DemoTest (int v1, int v2){
        int sum=v1+v2;
        System.out.println("Sum of 2 values"+sum);

    }
}
