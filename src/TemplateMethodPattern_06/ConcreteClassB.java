package TemplateMethodPattern_06;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  21:36
 */
public class ConcreteClassB extends AbstractClass{
    @Override
    protected void concreteMethod1() {
        System.out.println("B:具体类实现的方法1");
    }
    @Override
    protected void concreteMethod2() {
        System.out.println("B:具体类B实现的方法2");
    }
}
