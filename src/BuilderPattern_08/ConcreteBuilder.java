package BuilderPattern_08;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  22:55
 */
public class ConcreteBuilder extends Builder{
    @Override
    void buildPartA() {
        product.setPartA("part A");
    }

    @Override
    void buildPartB() {
        product.setPartB("part B");
    }

    @Override
    void buildPartC() {
        product.setPartC("part C");
    }
}
