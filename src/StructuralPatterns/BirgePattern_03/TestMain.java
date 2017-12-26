package StructuralPatterns.BirgePattern_03;

/**
 * @Author:ztian
 * @Description:桥接模式
 * @定义：将抽象部分与实现部分分离，使它们可以独立变化
 * @本质：分离抽象与实现，为这两个部分搭桥。桥接是单向的，由抽象部分使用具体实现部分
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
