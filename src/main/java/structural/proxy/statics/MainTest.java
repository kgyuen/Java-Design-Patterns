package structural.proxy.statics;

import structural.proxy.dynamic.LeiTikTok;

/**
 * 代理的东西不一样，每一种不同的代理类Person，Dog，Cat，创建不同的静态代理类
 */
public class MainTest {
    public static void main(String[] args) {
        LMTikTokProxy proxy = new LMTikTokProxy(new LeiTikTok());
        proxy.tiktok();
        // 静态代理对象就是装饰器
        // 装饰器模式是代理模式的一种
    }
}
