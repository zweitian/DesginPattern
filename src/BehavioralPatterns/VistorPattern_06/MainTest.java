package BehavioralPatterns.VistorPattern_06;

/**
 * @Author:ztian
 * @Description:访问者服务
 * @定义：定义访问者作用于对象结构集合各元素，为各元素添加新的功能
 * @本质：预留通路，回调实现
 * @CreateTime: 2018/1/5  22:07
 */
public class MainTest {
    public static void main(String[] args) {
        //元素结构集合
        ObjectStruct objectStruct=new ObjectStruct();
        //元素架构结合添加元素
        Customer person1=new PersonalCustomer("张三");
        objectStruct.addElement(person1);
        EnterpriseCustomer enterprise1=new EnterpriseCustomer("小米");
        EnterpriseCustomer enterprise2=new EnterpriseCustomer("英特尔");
        objectStruct.addElement(enterprise1);
        objectStruct.addElement(enterprise2);

        //通过serviceVistor对元素进行请求服务
        Vistor serviceReqestVistor=new ServiceReqestVistor();
        objectStruct.handelRequest(serviceReqestVistor);
        //通过preliectionVistor对元素进行偏好分析服务
        Vistor predilectionAnalyzeVisitor=new PredilectionAnalyzeVisitor();
        objectStruct.handelRequest(predilectionAnalyzeVisitor);
    }
}
