package StructuralPatterns.AdapterPattern_12;

/**
 * @Author:ztian
 * @Description:适配器模式
 * @目的：复用现存类，但现存与目标接口不符，解决现存类与目标接口复用问题
 * @CreateTime: 2017/12/20  15:56
 */
public class TestMain {
    public static void main(String[] args) {
        NewInterface adapter=new Adapter();
        adapter.newRequest();
    }
}
