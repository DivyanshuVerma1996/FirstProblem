public class BigOnly {

    private int largest=Integer.MIN_VALUE;

    public void find(int []numbers)
    {
        for (int i:numbers)
        {
            if(i>largest)
                largest=i;

        }
    }

    public int getLargest()
    {
        return  largest;
    }
    public void check()
    {

    }
}



