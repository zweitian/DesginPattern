package AbstractFactoryPattern_10;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  21:23
 */
public class MySqlUserModel implements IUserMoel{
    @Override
    public void insertUser() {
        System.out.println("Mysql数据库插入User");
    }
    @Override
    public void getUser(int id) {
        System.out.println("Mysql数据库得到id为"+ id+"的User");
    }
}
