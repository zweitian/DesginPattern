package BehavioralPatterns.VistorPattern_06;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  21:54
 */
public abstract class Customer {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }
    public abstract void accept(Vistor vistor);
}
