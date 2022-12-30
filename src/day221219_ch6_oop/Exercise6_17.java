package day221219_ch6_oop;

import java.util.Random;

public class Exercise6_17
{
    public static int[] shuffle(int[] arr)
    {
        if(arr == null || arr.length == 0) //유효성 체크, 값이 null이거나 크기가 0이면 그대로 반환한다.
        {
            return arr;
        }
        for(int i = 0; i < arr.length; i++)
        {
            int j = (int)(Math.random()*arr.length); // 
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }


}
