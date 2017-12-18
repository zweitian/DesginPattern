package TemplateMethodPattern_06;

/**
 * @Author:ztian
 * @Description:模版方法模式
 * @目的：定义一个操作中算法的骨架，将一些具体操作延迟到子类中
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
