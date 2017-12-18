package DecoratorPattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:30
 */
public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("main thread start");
        LoggingRunable logTask = new LoggingRunable(new CoddingTask());
        logTask.run();
    }
}
