package ObservePattern_09;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  0:19
 */
public class YiYi implements Observer{
    private String flag;
    @Override
    public void update(String flag) {
        this.flag=flag;
        System.out.println("I am yiyi, now reading maganize: " + flag);
    }
}
