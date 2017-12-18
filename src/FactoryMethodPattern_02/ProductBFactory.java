package FactoryMethodPattern_02;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  20:45
 */
public class ProductBFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
