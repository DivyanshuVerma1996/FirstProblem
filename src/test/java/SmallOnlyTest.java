import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallOnlyTest{

    SmallOnly small;
    @Before
    public void SetUp()
    {
        small=new SmallOnly();
        System.out.println("Constructor Initialized");
    }
    @Test
    public void increasingOrder()
    {
        small.find(new int[]{2,3,4});
        Assert.assertEquals(2,small.getSmaller());
    }
    @Test
    public void decreasingOrder()
    {
        small.find(new int[]{4,3,2});
        Assert.assertEquals(2,small.getSmaller());
    }
    @Test
    public void onlyOneElement()
    {
        small.find(new int[]{3});
        Assert.assertEquals(3,small.getSmaller());
    }
}
