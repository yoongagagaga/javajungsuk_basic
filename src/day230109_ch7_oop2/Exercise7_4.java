package day230109_ch7_oop2;
//Exercise7_4,5

class MyTv
{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL =1;
    public void setVolume(int volume){
        if(volume > MAX_VOLUME||volume<MIN_VOLUME)// 매개변수가 있는 매소드는 유효성검사 해야함
            return;

        this.volume = volume;
    }
    public int getVolume()
    {
        return volume;
    }

    public void setChannel(int channel){
        if(channel > MAX_CHANNEL||channel<MIN_CHANNEL) // 매개변수가 있는 매소드는 유효성검사 해야함
            return;

        prevChannel = this.channel; //현재 채널을 이전 채널에 저장한다.
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }

    public void gotoPrevChannel()
    {
        setChannel(prevChannel); //현재 채널을 이전 채널로 변경한다.
    }


}
public class Exercise7_4
{
    public static void main(String[] args)
    {
        MyTv t = new MyTv();
        t.setChannel(10);
        System.out.println("CH : " +t.getChannel());
        t.setVolume(20);
        System.out.println("VOL : " + t.getVolume());
        t.gotoPrevChannel();
        System.out.println("CH : " +t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH :"  + t.getChannel());
    }
}
