package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  21:23
 */
public class OracleUserModel implements IUserMoel{
    @Override
    public void insertUser() {
        System.out.println("Oracle数据库插入User");
    }
    @Override
    public void getUser(int id) {
        System.out.println("Oracle数据库得到id为"+ id+"的User");
    }
}
