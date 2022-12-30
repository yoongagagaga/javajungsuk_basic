package day221219_ch6_oop;
    class MyTv
    {
        boolean isPowerOn;
        int channel;
        int volume;
        final int MAX_VOLUME = 100;
        final int MIN_VOLUME = 0;
        final int MAX_CHANNEL = 100;
        final int MIN_CHANNEL = 1;
        void turnOnOff() // isPowerOn의
        { // isPowerOn 이 true  → false, false → true 로 바꿔준다
            isPowerOn = !isPowerOn;
        }
        void volumeUp()
        { // volume 을 증가 시킬 수 있으면 하나 증가시킨다.
            if(volume < MAX_VOLUME)
                volume++;
        }
        void volumeDown()
        { // volume 을 감소시킬 수 있으면 하나 감소시킨다.
            if(volume > MIN_VOLUME)
                volume--;
        }
        void channelUp()
        { // channel 이 맥스값이면 최소로 순환시킨다.
            if(channel == MAX_CHANNEL)
            {
                channel = MIN_CHANNEL;
            } else {
                channel++; // 아니면 하나 더 높여준다.
            }
        }
        void channelDown()
        { // channel 이 미니멈 값이면 최대로 순환시킨다.
            if(channel == MIN_CHANNEL)
            {
                channel = MAX_CHANNEL;
            } else {
                channel--; // 아니면 하나 더 낮춰준다.
            }
        }
    }
class Exercise6_19
{
    public static void main(String[] args)
    {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println(" CH : " + t.channel + ", VOL : " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println(" CH : " + t.channel + ", VOL : " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println(" CH : " + t.channel + ", VOL : " + t.volume);

    }
}
