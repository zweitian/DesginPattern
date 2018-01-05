package BehavioralPatterns.TemplateMethodPattern_03;

/**
 * @Author:ztian
 * @Description:模版方法模式
 * @定义：定义一个操作中算法的骨架，将一些具体操作延迟到子类中
 * @本质：固定算法骨架
 * @CreateTime: 2017/12/18  21:38
 */
public class TestMain {
    public static void main(String[] args) {
        AbstractClass classA=new ConcreteClassA();
        classA.templaetMethod();
        AbstractClass classB=new ConcreteClassB();
        classB.templaetMethod();
    }
}
