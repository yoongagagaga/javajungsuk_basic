package day230109_ch7_oop2;

class Outer1 // 외부 클래스
{
    static class Inner // 내부 클래스
    {
        int iv =200;
    }
}
public class Exercise7_7
{
    public static void main(String[] args)
    {
        Outer1.Inner inner = new Outer1.Inner();
        System.out.println(inner.iv);
    }
}
