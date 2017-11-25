package SinglePattern;

import java.io.IOException;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/11/25  11:42
 */
public class SingleTester {
    public static void main(String[] args) {
        try {
            System.out.println(Singleton.getInstance().get("pattern"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
