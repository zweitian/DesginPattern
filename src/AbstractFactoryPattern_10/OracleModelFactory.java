package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:Oracle模块工厂
 * @CreateTime: 2017/12/19  21:26
 */
public class OracleModelFactory implements IModelFactory {
    @Override
    public IUserMoel getUserModel() {
        return new OracleUserModel();
    }

    @Override
    public IDepartmentMoel getDepartmentModel() {
        return new OracleDepartmentModel();
    }
}
