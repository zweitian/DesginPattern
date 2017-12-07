package StrategyPattern_02;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/8  0:26
 */
public class CashMain {
    public static void main(String[] args) {
        CashContext context=new CashContext("满10减3");
        System.out.println(context.acceptCash(10));
    }
}
