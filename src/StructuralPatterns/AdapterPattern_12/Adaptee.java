package StructuralPatterns.AdapterPattern_12;

/**
 * @Author:ztian
 * @Description:被适配类，旧系统接口
 * @CreateTime: 2017/12/20  15:53
 */
public class Adaptee {
    public void request(){
        System.out.println("旧系统request");
    }
}
