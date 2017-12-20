package ResponsibilityChainPattern_18;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  21:58
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handlerRequest(int requst) {
        if(requst<10){
            System.out.printf("具体处理器A处理请求%d%n",requst);
        }else if(nextHandler!=null){
            nextHandler.handlerRequest(requst);
        }
    }
}
