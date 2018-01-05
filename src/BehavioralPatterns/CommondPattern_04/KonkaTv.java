package BehavioralPatterns.CommondPattern_04;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  20:18
 */
public class KonkaTv implements Tv{
    @Override
    public void close() {
        System.out.println("关闭康佳电视");
    }

    @Override
    public void open() {
        System.out.println("打开康佳电视");
    }

}
