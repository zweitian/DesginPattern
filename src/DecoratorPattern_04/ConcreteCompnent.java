package DecoratorPattern_04;

/**
 * @Author:ztian
 * @Description:具体构件类
 * @CreateTime: 2017/12/18  21:07
 */
public class ConcreteCompnent implements Component{
    @Override
    public void show() {
        System.out.println("具体构件类，核心职责操作");
    }
}
