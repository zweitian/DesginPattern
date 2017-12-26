package BehavioralPatterns.ResponsibilityChainPattern_18;

/**
 * @Author:ztian
 * @Description:责任链模式
 * @目的：多个请求处理器形成处理链来处理请求，避免单个请求处理器职责过重的问题
 * @CreateTime: 2017/12/20  22:00
 */
public class TestMain {
    public static void main(String[] args) {
        //处理器A处理10以下的请求
        ConcreteHandlerA handlerA=new ConcreteHandlerA();
        //处理器B处理30以下的请求
        ConcreteHandlerB handlerB=new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        int[] requests=new int[]{15,8,20,4};
        for(int request:requests){
            handlerA.handlerRequest(request);
        }
    }
}
