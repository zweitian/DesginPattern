package StrategyPattern_03;

/**
 * @Author:ztian
 * @Description:策略模式
 * @目的：把策略（规则）选择职责移交给策略上下文类（Context类）
 * @CreateTime: 2017/12/8  0:26
 */
public class TestMain {
    public static void main(String[] args) {
        CashContext context=new CashContext("满10减3");
        System.out.println(context.acceptCash(10));
    }
}
