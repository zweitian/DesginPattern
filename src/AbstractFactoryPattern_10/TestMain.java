package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:抽象工厂模式
 * @CreateTime: 2017/12/19  21:31
 */
public class TestMain {
    public static void main(String[] args) {
        IModelFactory modelFactory=new MySqlModelFactory();
        IUserMoel userModel = modelFactory.getUserModel();
        userModel.getUser(10);
        userModel.insertUser();
    }
}
