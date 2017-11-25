package StatePattern;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  10:59
 */
public class Employee {
    private String name;
    private double salary;
    private Role role;
    public Employee(String name,double salary,Role role) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    public Employee() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public void doWork(){
        System.out.print(role+"  ");
        role.doWork();
    }

}
