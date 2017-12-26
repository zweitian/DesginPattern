package CreationalPatterns.FactoryPattern_02_v1;

import CreationalPatterns.FactoryPattern_02_v1.product.Circle;
import CreationalPatterns.FactoryPattern_02_v1.product.Shape;

/**
 * @Author:ztian
 * @Description:具体圆形工厂
 * @CreateTime: 2017/12/22  18:26
 */
public class CircleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
