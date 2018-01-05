package BehavioralPatterns.VistorPattern_06;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  21:57
 */
public class PersonalCustomer extends Customer{
    public PersonalCustomer(String name) {
        super(name);
    }
    @Override
    public void accept(Vistor vistor) {
        vistor.visitPersonalCustomer(this);
    }

    @Override
    public String toString() {
        return "PersonalCustomer{" +
                "name='" + name + '\'' +
                '}';
    }
}
