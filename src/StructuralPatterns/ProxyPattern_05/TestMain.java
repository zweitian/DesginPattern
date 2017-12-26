package StructuralPatterns.ProxyPattern_05;

/**
 * @Author:ztian
 * @Description:代理模式
 * @目的：提供一个代理控制代理对象的访问
 * @CreateTime: 2017/12/18  21:26
 */
public class TestMain {
    public static void main(String[] args) {
        Proxy proxy=new Proxy();
        proxy.request();
    }
}
