package day230109_ch7_oop2;

class Product
{
    int price;
    int bonusPoint;

    Product(){}
    Product(int price)
    {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product
{
    Tv(){} // Tv(){super();} 과 같은 코드
    public String toString()
    {
        return "TV";
    }
}


public class Exercise7_3
{
    public static void main(String[] args)
    {
        Tv t = new Tv();
    }
}
