package CreationalPatterns.SimpleFactoryPattern_01;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  0:18
 */
public class ApiFactory {
    public static Api createApi(int condition){
        Api api=null;
        if(condition==1){
            api=new ApiImpl1();
        }else if(condition==2){
            api=new ApiImpl2();
        }
        return api;
    }
}
