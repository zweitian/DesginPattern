package BehavioralPatterns.ResponsibilityChainPattern_01;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  21:58
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handlerRequest(int requst) {
        if(requst<30){
            System.out.printf("具体处理器B处理请求%d%n",requst);
        }else if(nextHandler!=null){
            nextHandler.handlerRequest(requst);
        }
    }
}
