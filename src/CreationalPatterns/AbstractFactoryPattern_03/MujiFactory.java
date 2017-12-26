package CreationalPatterns.AbstractFactoryPattern_03;

import CreationalPatterns.AbstractFactoryPattern_03.product.Clothe;
import CreationalPatterns.AbstractFactoryPattern_03.product.MujiClothe;
import CreationalPatterns.AbstractFactoryPattern_03.product.MujiPant;
import CreationalPatterns.AbstractFactoryPattern_03.product.Pant;

/**
 * @Author:ztian
 * @Description:Muji品牌生成衣服和裤子的工厂
 * @CreateTime: 2017/12/22  11:19
 */
public class MujiFactory extends AbstractFactory{
    @Override
    Clothe createClothe() {
        return new MujiClothe();
    }
    @Override
    Pant createPant() {
        return new MujiPant();
    }
}
