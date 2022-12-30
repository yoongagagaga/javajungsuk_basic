package day221219_ch6_oop;

class Exercise6_20
{

    public static int max(int [] arr)
    {

        if(arr == null || arr.length == 0)
            return -99999;
        int max = arr[0]; // 제일 처음 것이 제일 크다고 표를 붙인다.
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int [] date = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(date));
        System.out.println("최대값 : " + max(date));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{})); // 크기가 0 인 배열

    }
}
