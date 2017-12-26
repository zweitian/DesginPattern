package CreationalPattern.FactoryPattern_02_v1.product;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/22  10:38
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
