package StructuralPatterns.FacadePattern_01;

/**
 * @Author:ztian
 * @Description:外观模式
 * @定义：为子系统的一组接口提供一个一致界面，Facde外观模式定义定义了一个高层接口，这一接口使子系统的使用更为容易
 * @本质：封装交互，简化调用，减少与子系统的多个模块交互，松散耦合
 * @CreateTime: 2017/12/18  21:57
 */
public class TestMain {
    public static void main(String[] args) {
        //Fund为混合基金 包括股票1，股票2和国债3
        Fund jijin=new Fund();
        //通过jijin统一买入卖出股票1，股票2和国债3（操作子系统123）
        jijin.buyAll();
        jijin.buyAll();
        System.out.println("-----------------------");
        //通过jijin统一买入卖出股票1，股票2（操作子系统12）
        jijin.buy12();
        jijin.sell12();
    }
}
