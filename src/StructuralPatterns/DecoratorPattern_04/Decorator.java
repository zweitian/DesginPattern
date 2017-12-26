package StructuralPatterns.DecoratorPattern_04;

/**
 * @Author:ztian
 * @Description:装饰器类
 * @CreateTime: 2017/12/18  21:08
 */
public class Decorator implements Component{
    private Component component;
    public Decorator(Component component) {
        this.component=component;
    }
    @Override
    public void show() {
        this.component.show();
    }
}
