package BehavioralPatterns.MediatorPattern_08;

/**
 * @Author:ztian
 * @Description:声卡同事类
 * @CreateTime: 2018/1/5  22:56
 */
public class SoundCard extends Colleague{
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * 按照声频数据发出声音
     * @param data 发出声音的数据
     */
    public void soundData(String data){
        System.out.println("画外音："+data);
    }
}
