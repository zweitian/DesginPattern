package CreationalPattern.SinglePattern_04;

/**
 * @Author:ztian
 * @Description:单例模式 确保类只有一个实例
 * @CreateTime: 2017/11/25  11:42
 */
public class SingleTester {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
