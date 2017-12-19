package AbstractFactoryPattern_v2;

/**
 * @Author:ztian
 * @Description:抽象工厂模式
 * @CreateTime: 2017/12/19  21:31
 */
public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException {
      IUserModel userModel = null;
        try {
            userModel = DataModel.getUserModel();
        } catch (Exception e) {
            e.printStackTrace();
        }
        userModel.getUser(10);
        userModel.insertUser();
    }
}
