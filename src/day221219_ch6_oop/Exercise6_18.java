package day221219_ch6_oop;

public class Exercise6_18
{
    public static boolean isNumber(String str)
    { // static 메모리 영역에 잡아놓아 져있어야 메인이 호출됐을 때 바로 쓸 수 있다.
        // 유효성 검사
        if(str == null || str.equals(""))
            return false;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i); // 하나하나 쪼개서 참조변수 ch 안에 넣는다.

            if(ch < '0' || ch > '9')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "123";
        System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
    }
}
