package CreationalPatterns.FactoryPattern_02_v1;

import CreationalPatterns.FactoryPattern_02_v1.product.Shape;

/**
 * @Author:ztian
 * @Description:工厂方法模式
 * @定义：提供一个用于创建对象的接口，让子类决定实例化哪个类，把类的实例化延时到子类
 * @本质：让父类在不知道具体实现情况下完成自身功能的调用，具体实现延迟到子类进行（延迟到子类选择实现）
 * @CreateTime: 2017/12/7  23:27
 */
public class TestMain {
    public static void main(String[] args) {
        //Shape的实例化交给具体子工厂来实现
        ShapeFactory shapeFactory=null;
        Shape shape=null;
        shapeFactory=new CircleFactory();
        //圆形
        shape = shapeFactory.createShape();
        shape.draw();
        //长方形
        shapeFactory=new CircleFactory();
        shape = shapeFactory.createShape();
        //圆形
        shape.draw();
    }
}
