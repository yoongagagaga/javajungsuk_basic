package day221219_ch6_oop;

public class Exercise6_16
{
    public static void change(String str)
    {
        str += "456";
    }

    public static void main(String[] args)
    {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change : " + str);
    }
}

// 결과 ABC123
// After change : ABC123