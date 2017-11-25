package BuilderPattern;

/**
 * @Author:ztian
 * @Description:创建者模式
 * @CreateTime: 2017/11/25  11:08
 */
public class Employee {
    private String name;
    private double salary;
    public Employee(Bulider bulider) {
        this.name = bulider.name;
        this.salary = bulider.salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static class Bulider{
        private String name;
        private double salary;
        public Bulider setName(String name) {
            this.name = name;
            return this;
        }
        public Bulider setSalary(double salary) {
            this.salary = salary;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
