package BuilderPattern_08;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  22:59
 */
public class TestMain {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }
}
