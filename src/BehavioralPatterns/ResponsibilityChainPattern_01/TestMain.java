package BehavioralPatterns.ResponsibilityChainPattern_01;

/**
 * @Author:ztian
 * @Description:责任链模式
 * @定义：多个对象都有机会处理请求，避免请求发送者和接受者间的耦合关系，
 *          将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理请求为止
 * @本质：分离职责，动态组合
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
