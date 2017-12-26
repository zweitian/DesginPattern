package StructuralPatterns.DecoratorPattern_05;

/**
 * @Author:ztian
 * @Description:具体装饰器类A
 * @CreateTime: 2017/12/18  21:14
 */
public class ConcreteDecorateA extends Decorator{
    public ConcreteDecorateA(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("具体装饰器A进行装饰");
    }
}
