package BehavioralPatterns.VistorPattern_06;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  21:54
 */
public interface Vistor {
    void visitPersonalCustomer(PersonalCustomer personalCustomer);
    void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer);
}
