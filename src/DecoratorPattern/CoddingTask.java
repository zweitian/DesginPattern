package DecoratorPattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:28
 */
public class CoddingTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Doing Task");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
