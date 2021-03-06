package CreationalPatterns.AbstractFactoryPattern_03;

import CreationalPatterns.AbstractFactoryPattern_03.product.Clothe;
import CreationalPatterns.AbstractFactoryPattern_03.product.Pant;
import CreationalPatterns.AbstractFactoryPattern_03.product.UniqloClothe;
import CreationalPatterns.AbstractFactoryPattern_03.product.UniqloPant;

/**
 * @Author:ztian
 * @Description:Uniqlo品牌生成衣服和裤子的工厂
 * @CreateTime: 2017/12/22  11:19
 */
public class UniqloFactory extends AbstractFactory{
    @Override
    Clothe createClothe() {
        return new UniqloClothe();
    }
    @Override
    Pant createPant() {
        return new UniqloPant();
    }
}
