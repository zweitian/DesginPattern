package StructuralPatterns.AdapterPattern_12;

/**
 * @Author:ztian
 * @Description:适配器
 * @CreateTime: 2017/12/20  15:53
 */
public class Adapter implements NewInterface{
    private Adaptee adaptee=new Adaptee();
    @Override
    public void newRequest() {
        System.out.println("旧系统适配器");
        adaptee.request();
    }
}
