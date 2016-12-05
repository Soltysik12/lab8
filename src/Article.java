/**
 * Created by agnieszka on 03.12.16.
 */
public class Article {

    private String textArticle;
    private int nrChapter;

    public Article(String textArticle, int nrChapter)
    {
        this.textArticle = textArticle;
        this.nrChapter = nrChapter;
    }

    public String getTextArticle()
    {
        return textArticle;
    }

    public int getNrChapter()
    {
        return nrChapter;
    }

    @Override
    public String toString()
    {
        return textArticle;
    }
}
