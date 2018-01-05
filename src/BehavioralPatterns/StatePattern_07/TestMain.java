package BehavioralPatterns.StatePattern_07;

/**
 * @Author:ztian
 * @Description:状态模式
 * @定义：允许对象在内部状态改变时改变它的行为
 * @本质：根据状态来分离与选择行为
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
