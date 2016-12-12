
public class Article {

    private String textArticle;

    public Article(String textArticle)
    {
        this.textArticle = textArticle;
    }

    public String getTextArticle()
    {
        return textArticle;
    }


    @Override
    public String toString()
    {
        return textArticle;
    }
}
