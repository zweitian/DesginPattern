package StructuralPatterns.DecoratorPattern_05;

/**
 * @Author:ztian
 * @Description:具体装饰器类B
 * @CreateTime: 2017/12/18  21:14
 */
public class ConcreteDecorateB extends Decorator{
    public ConcreteDecorateB(Component component) {
        super(component);
    }
    @Override
    public void show() {
        super.show();
        System.out.println("具体装饰器B进行装饰");
    }
}
