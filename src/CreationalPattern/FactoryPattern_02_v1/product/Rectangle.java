package CreationalPattern.FactoryPattern_02_v1.product;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/22  10:39
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画长方形");
    }
}
