import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {

    @DataProvider(name = "TestDemo")
    public Object [][] datatest (){
        return new Object[][] { {"FirstName"}, {"LastName"}};
        }


    @Test(dataProvider = "TestDemo")
    public void Demo(String Val){
        System.out.println(Val);

    }
}
