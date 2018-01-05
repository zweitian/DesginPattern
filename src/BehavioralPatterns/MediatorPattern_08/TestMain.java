package BehavioralPatterns.MediatorPattern_08;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  22:58
 */
public class TestMain {
    public static void main(String[] args) {
        //1：创建中介者——主板对象
        MediatorMainBoard mediator = new MediatorMainBoard();
        //2：创建同事类
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        SoundCard sc = new SoundCard(mediator);
        //3：让中介者知道所有的同事
        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);

        //4：开始看电影，把光盘放入光驱，光驱开始读盘
        cd.readCD();
    }
}
