public class SmallOnly {


    private int smaller=Integer.MAX_VALUE;
    public void find(int []numbers)
    {
        for (int i:numbers)
        {

            if(i<smaller)
                smaller=i;
        }
    }


    public int getSmaller()
    {
        return smaller;
    }
}
