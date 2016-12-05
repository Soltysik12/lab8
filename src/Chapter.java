import java.util.ArrayList;
import java.util.List;

/**
 * Created by agnieszka on 03.12.16.
 */
public class Chapter {

    private int start;
    private int end;
    private int number;
    private String title;


    public Chapter(int start, int end, int number, String title)
    {
        this.start = start;
        this.number= number;
        this.end = end;
        this.title = title;
    }

    public int getEnd()
    {
        return end;
    }

    public int getNumber()
    {
        return number;
    }

    public int getStart()
    {
        return start;
    }

    public String getTitle()
    {
        return title;
    }

}
