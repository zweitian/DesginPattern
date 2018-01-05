package BehavioralPatterns.ResponsibilityChainPattern_01;

/**
 * @Author:ztian
 * @Description:抽象处理器类
 * @CreateTime: 2017/12/20  21:56
 */
public abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handlerRequest(int requst);

}
