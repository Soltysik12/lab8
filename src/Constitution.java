import java.util.List;

/**
 * Created by agnieszka on 03.12.16.
 */
public class Constitution {

    protected List<Article> articles;
    protected List<Chapter> chapters;

    public String getChapter(int n)
    {
        StringBuilder sb = new StringBuilder("Rozdział " + n + "\n" + chapters.get(n).getTitle());

        for(int i = chapters.get(n).getStart() - 1 ; i < chapters.get(n).getEnd(); i ++)
        {
            sb.append(articles.get(i).getTextArticle());
        }
        return sb.toString();
    }

    public String getArticle(int a, int b)
    {
        int nrRozdzial = articles.get(a).getNrChapter();

        StringBuilder sb = new StringBuilder("Rozdział " + nrRozdzial + "\n");

        for(int i = a; i < b ; i ++)
        {
            if(nrRozdzial != articles.get(i).getNrChapter())
            {
                nrRozdzial = articles.get(i).getNrChapter();
                sb.append("Rozdział " + nrRozdzial + "\n");
            }
            sb.append(articles.get(i).getTextArticle());
        }
        return sb.toString();
    }




}
