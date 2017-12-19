package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:抽象模块工厂
 * @CreateTime: 2017/12/19  21:25
 */
public interface IModelFactory {
    IUserMoel getUserModel();
    IDepartmentMoel getDepartmentModel();
}
