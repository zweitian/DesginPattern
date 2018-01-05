package BehavioralPatterns.TemplateMethodPattern_03;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  21:33
 */
public abstract class AbstractClass {

    /*
    * 定义模版方法
    * */
    protected final void templaetMethod(){
        concreteMethod1();
        System.out.println("模版骨架");
        concreteMethod2();
    }
    /*
    * 具体方法交由子类实现
    * */
    abstract void concreteMethod1();
    abstract void concreteMethod2();
}
