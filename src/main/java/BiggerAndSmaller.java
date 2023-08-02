public class BiggerAndSmaller {

    private int largest=Integer.MIN_VALUE;
    private int smaller=Integer.MAX_VALUE;
    public void find(int []numbers)
    {
        for (int i:numbers)
        {
            if(i>largest)
                  largest=i;
            if(i<smaller)
                smaller=i;
        }
    }

    public int getLargest()
    {
        return  largest;
    }
    public int getSmaller()
    {
        return smaller;
    }
}
