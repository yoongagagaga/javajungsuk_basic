package day230109_ch7_oop2;

class Outer //외부클래스
{
    class Inner{int iv = 100;}//내부클래스
}
public class Exercise7_6
{
    public static void main(String[] args)
    {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        System.out.println(inner.iv);
    }
}
