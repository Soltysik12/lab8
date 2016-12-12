import java.util.ArrayList;
import java.util.List;


public class Chapter {

    private int start;
    private int end;
    private int number;



    public Chapter(int start, int end, int number)
    {
        this.start = start;
        this.number= number;
        this.end = end;

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



}
