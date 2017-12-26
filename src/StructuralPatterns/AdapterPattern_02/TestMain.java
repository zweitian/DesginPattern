package StructuralPatterns.AdapterPattern_02;

/**
 * @Author:ztian
 * @Description:适配器模式
 * @定义：将一个类的接口转换为客户希望的另一接口，复用原来类，让接口不兼容的类可以一起工作
 * @本质：转化匹配，复用功能
 * @CreateTime: 2017/12/20  15:56
 */
public class TestMain {
    public static void main(String[] args) {
        NewInterface adapter=new Adapter();
        adapter.newRequest();
    }
}
