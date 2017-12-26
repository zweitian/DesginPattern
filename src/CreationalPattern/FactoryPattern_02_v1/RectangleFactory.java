package CreationalPattern.FactoryPattern_02_v1;

import CreationalPattern.FactoryPattern_02_v1.product.Rectangle;
import CreationalPattern.FactoryPattern_02_v1.product.Shape;

/**
 * @Author:ztian
 * @Description:具体的长方形工厂
 * @CreateTime: 2017/12/22  18:26
 */
public class RectangleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
