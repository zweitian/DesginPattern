package CreationalPatterns.FactoryPattern_02_v2;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/22  10:38
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
