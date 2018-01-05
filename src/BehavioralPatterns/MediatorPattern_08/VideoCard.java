package BehavioralPatterns.MediatorPattern_08;

/**
 * @Author:ztian
 * @Description:显卡同事类
 * @CreateTime: 2018/1/5  22:55
 */
public class VideoCard extends Colleague{
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * 显示视频数据
     * @param data 被显示的数据
     */
    public void showData(String data){
        System.out.println("您正观看的是："+data);
    }
}
