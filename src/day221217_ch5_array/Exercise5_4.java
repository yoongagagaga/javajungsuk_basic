package day221217_ch5_array;

public class Exercise5_4
{
    public static void main(String[] args)
    {
        int[][] arr=
                {
                        {5, 5, 5, 5, 5},
                        {10, 10, 10, 10, 10},
                        {20, 20, 20, 20, 20},
                        {30, 30, 30, 30, 30}
                };

        int total = 0;
        float average;

        for(int [] ints : arr)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                total += ints[j];
            }
        }
        average= (float) total /  ((arr.length) * (arr[0].length));
        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
