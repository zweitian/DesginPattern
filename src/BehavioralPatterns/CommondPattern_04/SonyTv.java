package BehavioralPatterns.CommondPattern_04;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  20:20
 */
public class SonyTv implements Tv{
    @Override
    public void close() {
        System.out.println("关闭索尼电视");
    }

    @Override
    public void open() {
        System.out.println("打开索尼电视");
    }
}
