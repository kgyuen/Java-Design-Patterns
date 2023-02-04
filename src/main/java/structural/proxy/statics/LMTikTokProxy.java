package structural.proxy.statics;

import structural.proxy.dynamic.ManTikTok;

/**
 * 代理一般都是和被代理对象属于同一个接口
 */
public class LMTikTokProxy implements ManTikTok {

    private ManTikTok manTikTok;

    public LMTikTokProxy(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    /**
     * 代理  被代理对象
     */
    @Override
    public void tiktok() {
        System.out.println("渲染");
        System.out.println("666");
        manTikTok.tiktok();
    }
}
