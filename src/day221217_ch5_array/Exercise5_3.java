package day221217_ch5_array;

public class Exercise5_3
{
    public static void main(String [] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int j : arr)
        {
            sum += j;
        }
        System.out.println("sum = " + sum);

    }
}
