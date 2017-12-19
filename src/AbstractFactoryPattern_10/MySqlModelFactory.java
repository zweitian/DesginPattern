package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:MySql模块工厂
 * @CreateTime: 2017/12/19  21:26
 */
public class MySqlModelFactory implements IModelFactory {
    @Override
    public IUserMoel getUserModel() {
        return new MySqlUserModel();
    }

    @Override
    public IDepartmentMoel getDepartmentModel() {
        return new MySqlDepartmentModel();
    }
}
