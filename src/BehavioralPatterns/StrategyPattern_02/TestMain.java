package BehavioralPatterns.StrategyPattern_02;

/**
 * @Author:ztian
 * @Description:策略模式
 * @定义:定义一系列的算法，把它们一个个封装起来，并且使它们可以相互替代
 * @本质：算法可相互替代，分类算法，选择实现
 * @CreateTime: 2017/12/8  0:26
 */
public class TestMain {
    public static void main(String[] args) {
        CashContext context=new CashContext("满10减3");
        System.out.println(context.acceptCash(10));
    }
}
