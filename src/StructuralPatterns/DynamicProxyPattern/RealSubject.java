package StructuralPatterns.DynamicProxyPattern;
/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  21:24
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实委托类进行请求");
    }
}
