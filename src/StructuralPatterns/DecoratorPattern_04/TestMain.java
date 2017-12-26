package StructuralPatterns.DecoratorPattern_04;

/**
 * @Author:ztian
 * @Description:装饰器模式
 * @目的：给已有的功能动态添加更多的功能，把类的核心职责和装饰功能区分开
 * @CreateTime: 2017/11/25  11:30
 */
public class TestMain {
    public static void main(String[] args) {
        ConcreteCompnent compnent=new ConcreteCompnent();
        ConcreteDecorateA decorateA=new ConcreteDecorateA(compnent);
        ConcreteDecorateB decorateB=new ConcreteDecorateB(decorateA);
        decorateB.show();
    }
}
