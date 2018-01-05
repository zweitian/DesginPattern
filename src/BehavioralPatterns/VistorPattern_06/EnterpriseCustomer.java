package BehavioralPatterns.VistorPattern_06;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  21:57
 */
public class EnterpriseCustomer extends Customer{
    public EnterpriseCustomer(String name) {
        super(name);
    }
    @Override
    public void accept(Vistor vistor) {
        vistor.visitEnterpriseCustomer(this);
    }

    @Override
    public String toString() {
        return "EnterpriseCustomer{" +
                "name='" + name + '\'' +
                '}';
    }
}
