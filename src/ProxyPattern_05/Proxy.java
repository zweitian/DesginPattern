package ProxyPattern_05;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  21:24
 */
public class Proxy implements Subject{
    private Subject realSubject;
    public Proxy() {
        if(this.realSubject==null){
            realSubject=new RealSubject();
        }
    }
    @Override
    public void request() {
        System.out.println("代理类进行请求代理");
        realSubject.request();
    }
}
