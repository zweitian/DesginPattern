package SinglePattern;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:37
 */
public class Singleton {
    private static Properties prop=null;
    //私有化构造函数
    private Singleton(){
    }
    public static synchronized Properties getInstance() throws IOException {
        if(prop==null){
            InputStream inputStream = Singleton.class.getResourceAsStream("single.properties");
            prop=new Properties();
            prop.load(inputStream);
            return prop;
        }else{
            return prop;
        }
    }
}
