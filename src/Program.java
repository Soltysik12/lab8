import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by agnieszka on 03.12.16.
 */
public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        String scanner = new Scanner(new File("konstytucja.txt")).useDelimiter("\\Z").next();
        String textConstitution = scanner.replace("©Kancelaria Sejmu\n2009-11-16\n", "").replace("-\n", "");

        Constitution constitution = parser(textConstitution);
        //System.out.println(constitution.getChapter(5));
        System.out.print(constitution.getArticle(2,80));


    }
    //\n[A-Z]{3,}.*\n

    public static Constitution parser(String text)
    {
        Constitution konstytucja = new Constitution();

        String[] chapters = text.split("Rozdział \\S+\\n");
        List<Article> articles = new ArrayList<>();
        List<Chapter> chaptersList = new ArrayList<>();

        for(int i = 1; i < chapters.length; i ++)
        {
            String[] artykuly = chapters[i].split("Art\\. ");
            int poczatek = Integer.parseInt(artykuly[1].substring(0,artykuly[1].indexOf(".")));
            int koniec = Integer.parseInt(artykuly[artykuly.length-1].substring(0,artykuly[artykuly.length-1].indexOf(".")));
            chaptersList.add(new Chapter(poczatek,koniec,i,artykuly[0]));

            for(int j = 1; j < artykuly.length ; j ++)
            {
                articles.add(new Article(("Art. " + artykuly[j]),i));
            }
        }
        konstytucja.articles = articles;
        konstytucja.chapters = chaptersList;

        return konstytucja;
    }

}
