package structural.adapter;

/**
 * 1、在原有系统上增加一个适配器，让适配器可以把电影的中文字幕翻译成理解的日文字幕
 *
 * 客户调用方法的时候用适配器操作即可。
 *
 * 类结构模型：
 * 对象结构模型：
 */
public class JMovieAdapter implements Player{

    public JMovieAdapter(){

    }

    @Override
    public String play() {
        return null;
    }
}
