import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BiggerAndSmallerTest {

    BiggerAndSmaller bigsmall;
   @Before
    public void SetUp()
   {
       bigsmall=new BiggerAndSmaller();
       System.out.println("Constructor Initialized");
   }
   @Test
   public void increasingOrder()
   {
       bigsmall.find(new int[]{2,3,4});
       Assert.assertEquals(2,bigsmall.getSmaller());
       Assert.assertEquals(4,bigsmall.getLargest());
   }
    @Test
    public void decreasingOrder()
    {
        bigsmall.find(new int[]{4,3,2});
        Assert.assertEquals(2,bigsmall.getSmaller());
        Assert.assertEquals(4,bigsmall.getLargest());
    }

}
