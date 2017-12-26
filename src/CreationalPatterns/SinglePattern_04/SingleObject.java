package CreationalPatterns.SinglePattern_04;


/**
 * @Author:ztian
 * @Description:单例模式
 * @定义：保证一个类只有一个实例
 * @本质：控制实例数目
 * @CreateTime: 2017/11/25  11:37
 */
public class SingleObject {
    private static SingleObject instance=new SingleObject();
    //私有化构造函数
    private SingleObject(){
    }
    public static  SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
