package BehavioralPatterns.ObservePattern_05;

/**
 * @Author:ztian
 * @Description:观察者模式
 * @定义：一种一对多依赖关系，当一个对象的状态改变时，所以来它的对象都得到通知并被自动更新
 * @本质：触发联动
 * @CreateTime: 2017/12/19  0:26
 */
public class MainTest {
    public static void main(String[] args) {
        //创建一个报纸，作为主题
        NewsPaperSubject newPaper = new NewsPaperSubject();
        //创建阅读者，也就是观察者
        ReaderObserver readerObserver1 = new ReaderObserver("张三");
        ReaderObserver readerObserver2 = new ReaderObserver("李四");
        ReaderObserver readerObserver3 = new ReaderObserver("王五");
        //注册订阅报纸者
        newPaper.registerObserver(readerObserver1);
        newPaper.registerObserver(readerObserver2);
        newPaper.registerObserver(readerObserver3);
        //更新报纸内容状态，并通知订阅者
        newPaper.updateContent("本期更新内容为观察者模式");
    }
}
