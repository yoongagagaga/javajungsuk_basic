package day230109_ch7_oop2;

class Outer2
{
    int value = 10;  //OUter.this.value
    class Inner
    {
        int value =20; //this.value
        void method1()
        {
            int value = 30;  //value
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer2.this.value);
        }
    }
}
public class Exercise7_8
{
    public static void main(String[] args)

    {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.method1();;
    }
}
