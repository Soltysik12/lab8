import java.util.ArrayList;
import java.util.List;

public class OptionsParser {

    public static String clean(String napis)
    {
        String textConstitution = napis.replace("©Kancelaria Sejmu\n2009-11-16\n", "")
                .replace("-\n", "")
                .replaceAll("\n\\p{Lu}{3,}.*\n", "\n");
        return textConstitution;

    }

    public static Constitution parse(String text)
    {

        Constitution konstytucja = new Constitution();

        String[] chapters = text.split("Rozdział \\S+\\n");
        List<Article> articlesList = new ArrayList<>();
        List<Chapter> chaptersList = new ArrayList<>();

        parseChapters(chapters, chaptersList, articlesList);

        konstytucja.articles = articlesList;
        konstytucja.chapters = chaptersList;

        return konstytucja;


    }

    private static void parseChapters(String [] chapters ,List<Chapter> chaptersList, List<Article> articlesList)
    {

        for(int i = 1; i < chapters.length; i ++)
        {
            int [] se = parseArticles(articlesList, chapters[i]);
            chaptersList.add(new Chapter(se[0],se[1],i));


        }
    }

    private static int[] parseArticles(List<Article> articlesList, String chapter)
    {
        int [] se = new int [2];        //numer artykułu początkowego i końcowego
        String[] articles = chapter.split("Art\\. ");

        for(int j = 1; j < articles.length ; j ++)
        {
            articlesList.add(new Article("Art. " + articles[j]));
        }
        se[0] = Integer.parseInt(articles[1].substring(0,articles[1].indexOf(".")));
        se[1] = Integer.parseInt(articles[articles.length-1]
                .substring(0,articles[articles.length-1]
                        .indexOf(".")));
        return se;
    }


}
