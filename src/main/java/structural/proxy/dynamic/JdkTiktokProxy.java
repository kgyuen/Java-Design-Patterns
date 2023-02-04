package structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkTiktokProxy<T> implements InvocationHandler {

    private T target;

    // 接受被代理对象
    JdkTiktokProxy(T target) {
        this.target = target;
    }


    public static <T> T getProxy(T t) {

        /**
         * ClassLoader loader, 当前被代理对象的类加载器
         * Class<?>[] interfaces, 当前被代理对象所实现的所有接口
         * InvocationHandler h,
         * 当前被代理对象执行目标方法的时候我们使用h可以定义拦截增强方法
         */
        Object o = Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),//必须接口)
                new JdkTiktokProxy(t));
        return (T) o;
    }

    /**
     * 定义目标方法的拦截罗技：每个方法都会进来的
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射执行
        System.out.println("真正执行被代理对象的方法");
        Object invoke = method.invoke(target,args);
        System.out.println("返回值：....");
        return invoke;
    }
}
