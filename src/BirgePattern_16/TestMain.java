package BirgePattern_16;

/**
 * @Author:ztian
 * @Description:桥接模式
 * @目的：抽象类实现存在两个或以上纬度的变化，而且这些纬度可以互相拓展，
 *          保留一个纬度，把其余纬度的变化用组合表现出来
 * @CreateTime: 2017/12/21  0:12
 */
public class TestMain {
    public static void main(String[] args) {
        Color white=new White();
        Color green=new Green();
        Shape circle=new Circle();
        circle.setColor(white);
        circle.draw();
        circle.setColor(green);
        circle.draw();
    }
}
