package day221219_ch6_oop;

public class Exercise6_5
{
    static class PlayingCard
    {
        int kind;
        int num;
        static int width;
        static int height;

        PlayingCard(int k, int n)
        {
            kind = k;
            num = n;
        }

        public void main(String[] args)
        {
            PlayingCard card = new PlayingCard(1, 1);
        }

    }

}
