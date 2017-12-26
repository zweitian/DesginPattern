package CreationalPattern.FactoryPattern_02_v1;

import CreationalPattern.FactoryPattern_02_v1.product.Shape;
import CreationalPattern.FactoryPattern_02_v1.product.Square;

/**
 * @Author:ztian
 * @Description:具体的正方形工厂
 * @CreateTime: 2017/12/22  18:26
 */
public class SquareFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Square();
    }
}
