package CreationalPatterns.AbstractFactoryPattern_03;

import CreationalPatterns.AbstractFactoryPattern_03.product.Clothe;
import CreationalPatterns.AbstractFactoryPattern_03.product.Pant;

/**
 * @Author:ztian
 * @Description:抽象工厂模式
 * @定义:提供一个创建一系列相关或相互依赖对象的接口，返回工厂，再由工厂创建这些相互依赖对象
 * @本质：选择产品簇实现
 * @CreateTime: 2017/12/22  11:27
 */
public class TestMain {
    public static void main(String[] args) {
        //Muji品牌工厂
        AbstractFactory mujiFactory = FactoryProducer.getFactory(MujiFactory.class);
        Clothe mujiClothe = mujiFactory.createClothe();
        Pant mujiPant = mujiFactory.createPant();
        mujiClothe.display();
        mujiPant.display();
        //Uniqo品牌工厂
        AbstractFactory uniqloFactory = FactoryProducer.getFactory(UniqloFactory.class);
        Clothe uniqloClothe = uniqloFactory.createClothe();
        Pant uniqalFactoryPant = uniqloFactory.createPant();
        uniqloClothe.display();
        uniqalFactoryPant.display();
    }
}
