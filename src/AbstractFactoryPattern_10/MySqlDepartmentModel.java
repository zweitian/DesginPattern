package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  21:23
 */
public class MySqlDepartmentModel implements IDepartmentMoel{
    @Override
    public void insertDepartment() {
        System.out.println("Mysql数据库插入Department");
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("Mysql数据库得到id为"+ id+"的Department");
    }
}
