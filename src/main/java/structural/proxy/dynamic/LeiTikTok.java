package structural.proxy.dynamic;

public class LeiTikTok implements ManTikTok,SellTikTok{

        @Override
        public void tiktok() {
            System.out.println("l，tiktok.... ");
        }

        @Override
        public void sell() {
            System.out.println("l，只要666，赶紧来包...");
        }

        public void haha(){
            System.out.println("hahaha ,......");
        }
}
