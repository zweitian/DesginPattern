package ObservePattern_09;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  0:19
 */
public class ErEr implements Observer{
    private String flag;
    @Override
    public void update(String flag) {
        this.flag=flag;
        System.out.println("I am erer, now reading maganize: " + flag);
    }
}
