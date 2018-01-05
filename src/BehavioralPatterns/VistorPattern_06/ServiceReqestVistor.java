package BehavioralPatterns.VistorPattern_06;

/**
 * @Author:ztian
 * @Description:请求服务
 * @CreateTime: 2018/1/5  22:00
 */
public class ServiceReqestVistor implements Vistor{
    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        System.out.printf("(请求服务)ServiceReqestVistor 对个人客户%s添加功能\n",personalCustomer.getName());
    }

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        System.out.printf("(请求服务)ServiceReqestVistor 对企业客户%s添加功能\n",enterpriseCustomer.getName());
    }
}
