package AbstractFactoryPattern_v2;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  21:43
 */
public class DataModel {
    private final static String db="MySql";
    private final static String pack="AbstractFactoryPattern_v2.";
    public static IUserModel getUserModel() throws Exception{
        IUserModel userModel = (IUserModel) Class.forName(pack+db + "UserModel").newInstance();
        return userModel;
    }
    public static IDepartmentMoel getDepartmentModel() throws Exception{
        IDepartmentMoel departmentModel = (IDepartmentMoel) Class.forName(pack+db  + "DepartmentModel").newInstance();
        return departmentModel;
    }
}
