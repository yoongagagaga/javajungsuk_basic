package day221219_ch6_oop;

class MyPoint
{
    int x, y;
    MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1)// 인스턴스 매소드
    {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }
}

public class Exercise6_6
{
    public static void main(String[] args)
    {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }

}
