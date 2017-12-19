package DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  20:21
 */
public class MyInvocationHandler implements InvocationHandler{

    //代理类持有对委托类的对象引用
    private Object delegate;
    public MyInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.currentTimeMillis();
        //利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果。
        //因为示例程序没有返回值，所以这里忽略了返回值处理
        method.invoke(delegate, args);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");
        return null;
    }
}
