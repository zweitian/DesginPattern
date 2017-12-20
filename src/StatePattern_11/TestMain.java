package StatePattern_11;

/**
 * @Author:ztian
 * @Description:状态模式
 * @目的：当对象的行为取决于它的状态，并且在运行时根据状态它的行为，把不同状态的行为分布到State子类中
 * @CreateTime: 2017/11/25  11:03
 */
public class TestMain {
    public static void main(String[] args) {
        Employee employee=new Employee("employee",2000,new Engineer());
        //engineer工作
        employee.doWork();
        //employee升职到Manager
        employee.uptoManager();
        //employee升职为Manager后工作
        employee.doWork();
    }
}
