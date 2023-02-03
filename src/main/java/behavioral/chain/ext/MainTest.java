package behavioral.chain.ext;

public class MainTest {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();

        // web.xml =- filter
        HttpFilter filter = new HttpFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();
        chain.addFilter(filter);
        chain.addFilter(characterFilter);
        chain.addFilter(encodingFilter);

        chain.setTarget(new My());

        // filter如何链式执行
        chain.doFilter(new Request("hello world"),new Response("adhkdsaghakj"),chain);

    }
}
