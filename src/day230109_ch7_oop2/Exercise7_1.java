package day230109_ch7_oop2;
//Exercise7_1,2
class SutdaDeck
{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    //sutdacard객체 배열, 참조변수의 배열이 생긴것이지 객체가 생긴것이 아니다.
    SutdaDeck()
    {// sutdacard 객체를 넣어 초기화
        for(int i =0; i< cards.length; i++ )
        {
            int num = i%10+1; // 0~19인 i를 20인 것을 1~10으로 만들기
            boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
            //num이 1,3,8일때, 한쌍의 카드 중에서 하나는 광(kwang)이어야한다.
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
//-----1.흔들기----------------
    void shuffle()
    {
        for(int i =0; i<cards.length; i++)
        {
            int j = (int)(Math.random()* cards.length);
//            cards[i]와 cards[j]의 순서를 바꿈
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
//-----2.매소드 매개변수 ㅇ ----------------
    SutdaCard pick(int index)
    {
        if(index <0 || index >= CARD_NUM)  // 유효성 검사  하지 않으면 범위에러 발생
            return null;
        return  cards[index];
    }
//-----3.매소드 매개변수 X ----------------
    SutdaCard pick()
    {
        int index = (int)(Math.random()*cards.length);
        return pick(index);// 2.매소드 호출
    }
}
class SutdaCard
{
    int num;
    boolean isKwang;
    SutdaCard(){this(1,true);} // 생성자
    SutdaCard(int num, boolean isKwang) //생성자
    {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString(){return num + (isKwang? "K":"");}
}
public class Exercise7_1
{

    public static void main(String[] args)
    {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards.length; i++)
        {
            System.out.print((deck.cards[i] + ","));
            System.out.println();
            System.out.println(deck.pick(0));
        }

    }
}
