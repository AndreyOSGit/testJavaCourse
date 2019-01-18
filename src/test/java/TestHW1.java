import HW.HW1;
import org.junit.Assert;
import org.junit.Test;

public class TestHW1 {


    @Test
    public void testHW1_moneyToReturn_String(){
        String exp = "aaaa";
        String act =  "aaaa";

        Assert.assertEquals( exp, act);

    }
    @Test
    public void testHW1_moneyToReturn_800(){
        double exp = 800.0;
        double act =  HW1.moneyToReturn(10);
        Assert.assertEquals(exp, act,0);
    }
    @Test
    public void testHW1_moneyToReturn_1000(){
        double exp = 1000.0;
        double act =  HW1.moneyToReturn(10);
        Assert.assertEquals(exp, act,0);
    }
    @Test
    public void testHW1_moneyToReturn_m1(){
        double exp = -1;
        double act =  HW1.moneyToReturn(10);
        Assert.assertEquals(exp, act,0);
    }


}
