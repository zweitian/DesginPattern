package CreationalPattern.FactoryPattern_02_v2;

/**
 * @Author:ztian
 * @Description:工厂方法模式简化版本，去除抽象工厂类，使用反射技术来进行功能拓展
 * @CreateTime: 2017/12/7  23:27
 */
public class TestMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        //正方形
        Rectangle rectangle = (Rectangle) shapeFactory.createShape(Rectangle.class);
        rectangle.draw();
        //圆形
        Circle circle = (Circle) shapeFactory.createShape(Circle.class);
        circle.draw();
    }
}
