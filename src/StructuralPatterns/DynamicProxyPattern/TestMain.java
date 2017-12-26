package StructuralPatterns.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author:ztian
 * @Description:jdk动态代理
 * @目的：动态生成代理对象，委托类接口声明的方法转移到统一集中到处理器类的invoke方法出来
 * @CreateTime: 2017/12/19  20:24
 */
public class TestMain {
    public static void main(String[] args) {
        Subject realSubject=new RealSubject();
        //1.生成代理处理器，实现InvocationHandler接口
        InvocationHandler handler=new MyInvocationHandler(realSubject);
        //2.根据classloader,代理的接口数组，代理处理器动态生成代理对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), handler);
        //3.调用动态代理对象方法
        proxySubject.request();
    }
}
