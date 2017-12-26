package CreationalPattern.AbstractFactoryPattern_03;

import CreationalPattern.AbstractFactoryPattern_03.product.Clothe;
import CreationalPattern.AbstractFactoryPattern_03.product.Pant;

/**
 * @Author:ztian
 * @Description:抽象工厂类 产品族为衣服和裤子
 * @CreateTime: 2017/12/22  11:11
 */
public abstract class AbstractFactory {
    abstract Clothe createClothe();
    abstract Pant createPant();
}
