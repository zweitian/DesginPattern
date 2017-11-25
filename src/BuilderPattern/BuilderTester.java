package BuilderPattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:18
 */
public class BuilderTester {
    public static void main(String[] args) {
        Employee employee=new Employee.Bulider().setName("ztian").setSalary(10000).build();
        System.out.println(employee);
    }
}
