package DecoratorPattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:24
 */
public class LoggingRunable implements Runnable{
    private Runnable innerRunner;

    public void setInnerRunner(Runnable innerRunner) {
        this.innerRunner = innerRunner;
    }
    public LoggingRunable(Runnable innerRunner) {
        this.innerRunner = innerRunner;
    }
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("任务开始");
        innerRunner.run();
        long endTime=System.currentTimeMillis();
        System.out.println("任务结束，花费时间为:"+String.valueOf(endTime-startTime));
    }
}
