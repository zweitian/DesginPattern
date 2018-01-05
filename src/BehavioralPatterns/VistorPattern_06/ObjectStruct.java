package BehavioralPatterns.VistorPattern_06;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  22:07
 */
public class ObjectStruct {
    private List<Customer> list=new ArrayList();
    public void handelRequest(Vistor vistor){
        for(Customer customer:list){
            customer.accept(vistor);
        }
    }
    public void addElement(Customer customer){
        list.add(customer);
    }
}
