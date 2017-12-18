package ObservePattern_09;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  0:26
 */
public class MainTest {
    public static void main(String[] args) {
        //创建主题对象
        Maganize maganize = new Maganize();

        //创建观察者
        Observer yiyi = new YiYi();
        Observer erer = new ErEr();
        Observer sansan = new SanSan();
        //将观察者对象登记到主题对象上
        maganize.registerObserver(yiyi);
        maganize.registerObserver(erer);
        maganize.registerObserver(sansan);
        //改变主题对象的状态（发布新杂志）
        maganize.publishNewMaganize("New Maginize");
    }
}
