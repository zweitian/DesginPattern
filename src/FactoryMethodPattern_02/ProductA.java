package FactoryMethodPattern_02;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  20:45
 */
public class ProductA implements Product{
    @Override
    public void use() {
        System.out.println("使用产品A");
    }
}
