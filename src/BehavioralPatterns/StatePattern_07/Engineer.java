package BehavioralPatterns.StatePattern_07;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:01
 */
public class Engineer implements Role {
    @Override
    public void doWork() {
        System.out.println("doing working");
    }

    @Override
    public String toString() {
        return "Engineer";
    }
}
