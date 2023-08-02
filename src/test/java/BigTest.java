import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BigTest {

    BigOnly big;
    @Before
    public void SetUp()
    {
        big=new BigOnly();
        System.out.println("Constructor Initialized");
    }
    @Test
    public void increasingOrder()
    {
        big.find(new int[]{2,3,4});

        Assert.assertEquals(4,big.getLargest());
    }
    @Test
    public void decreasingOrder()
    {
        big.find(new int[]{4,3,2});
        Assert.assertEquals(4,big.getLargest());
    }

}
