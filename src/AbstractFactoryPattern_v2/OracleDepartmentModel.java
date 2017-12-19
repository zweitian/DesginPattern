package AbstractFactoryPattern_v2;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  21:23
 */
public class OracleDepartmentModel implements IDepartmentMoel {
    @Override
    public void insertDepartment() {
        System.out.println("Oracle数据库插入Department");
    }
    @Override
    public void getDepartment(int id) {
        System.out.println("Oracle数据库得到id为"+ id+"的Department");
    }
}
