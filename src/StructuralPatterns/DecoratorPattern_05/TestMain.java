package StructuralPatterns.DecoratorPattern_05;

/**
 * @Author:ztian
 * @Description:装饰器模式
 * @定义：动态给一个对象添加额外的职责。就增加功能而言，装饰器比生成子类更灵活
 * @本质：功能细化，动态组合
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
