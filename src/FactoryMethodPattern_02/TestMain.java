package FactoryMethodPattern_02;

/**
 * @Author:ztian
 * @Description:工厂方法模式
 * @目的：封装对象创建过程，克服简单工厂模式违背开闭原则的缺点
 * @CreateTime: 2017/12/18  20:48
 */
public class TestMain {
    public static void main(String[] args) {
        ProductFactory factoryA=new ProductAFactory();
        Product productA = factoryA.createProduct();
        productA.use();
        ProductFactory factoryB=new ProductBFactory();
        Product productB = factoryB.createProduct();
        productB.use();
    }
}
