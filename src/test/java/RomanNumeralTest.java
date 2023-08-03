
import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {

      @Test
    public void aSingleNumber()
    {
        RomanNumeral roman=new RomanNumeral();
        int number=roman.convert("I");
        Assert.assertEquals(1,number);
    }
}
