package structural.adapter.obj;

import structural.adapter.MoviePlayer;

public class MainTest {

    public static void main(String[] args) {

        // MeiYanDecorator decorator = new MeiYanDecorator(manTikTok);
        JMoviePlayerAdapter adapter = new JMoviePlayerAdapter(new MoviePlayer());

        adapter.play();
    }
}
