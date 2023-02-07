package structural.adapter.clazz;

import structural.adapter.Player;
import structural.adapter.Zh_JPTranslator;

/**
 * 继承的方式：类构造模型，适配转换到了翻译器的功能上
 */
public class JMoviePlayAdapter extends Zh_JPTranslator implements Player {

    private Player target; // 被适配对象

    public JMoviePlayAdapter(Player target){
        this.target = target;
    }

    @Override
    public String play() {
        String play = target.play();
        // 转换字幕
        String translate = translate(play);
        System.out.println("日文:"+translate);
        return play;
    }
}
