package StatePattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:03
 */
public class Tester {
    public static void main(String[] args) {
        Employee employee=new Employee("employee",2000,new Engineer());
        employee.doWork();
        employee.setRole(new Manager());
        employee.doWork();
    }
}
