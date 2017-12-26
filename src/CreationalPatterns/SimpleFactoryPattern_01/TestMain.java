package CreationalPatterns.SimpleFactoryPattern_01;

/**
 * @Author:ztian
 * @Description:简单工厂模式
 * @定义：提供一个创建对象实例功能，而无需知道创建对象的具体实现
 * @本质：重点在于选择实现，使客户端与实例解耦
 * @CreateTime: 2017/12/26  0:20
 */
public class TestMain {
    public static void main(String[] args) {
        //Api是接口，无需知道接口的具体实现
        Api api = ApiFactory.createApi(1);
        api.operation();
    }
}
