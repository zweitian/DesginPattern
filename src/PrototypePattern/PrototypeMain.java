package PrototypePattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  12:27
 */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1=new Employee();
        e1.setName("ztian");
        e1.setAge(18);
        e1.setSalary(5000);
        Employee e2 = (Employee) e1.clone();
        e2.setName("ztian2");
        System.out.println(e1);
        System.out.println(e2);
    }
}
