package StatePattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:02
 */
public class Manager implements Role{
    @Override
    public void doWork() {
        System.out.println("Dispatcher work");
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
