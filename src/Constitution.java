import java.util.List;


public class Constitution {

    protected List<Article> articles;
    protected List<Chapter> chapters;

    public String getChapter(int n)
    {
        StringBuilder sb = new StringBuilder("Rozdział " + n + "\n");

        for(int i = chapters.get(n-1).getStart(); i < chapters.get(n-1).getEnd(); i ++)
        {
            sb.append(articles.get(i).getTextArticle());
        }
        return sb.toString();
    }

    public String getArticle(int a)
    {
        return getArticles(a,a);

    }

    public String getArticles(int a, int b)
    {

        StringBuilder sb = new StringBuilder();

        for(int i = a - 1; i < b ; i ++)
        {
            sb.append(articles.get(i).getTextArticle());
        }
        return sb.toString();
    }




}
