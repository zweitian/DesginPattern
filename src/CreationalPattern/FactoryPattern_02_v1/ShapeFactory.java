package CreationalPattern.FactoryPattern_02_v1;

import CreationalPattern.FactoryPattern_02_v1.product.Shape;

/**
 * @Author:ztian
 * @Description:抽象工厂类
 * @CreateTime: 2017/12/22  10:40
 */
public abstract class ShapeFactory {
    public abstract Shape createShape();
}
