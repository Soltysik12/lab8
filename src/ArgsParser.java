public class ArgsParser {

    public void parse(String[] args, Constitution constitution)
    {
        try
        {
            if(args[1].equals("-c") && Integer.parseInt(args[2]) > 0 && Integer.parseInt(args[2]) < 14)
            {
                System.out.print(constitution.getChapter(Integer.parseInt(args[2])));
            }
            else if(args[1].equals("-a") && Integer.parseInt(args[2]) > 0 && Integer.parseInt(args[2]) < 244)
            {
                System.out.print(constitution.getArticle(Integer.parseInt(args[2])));
            }
            else if(args[1].equals("-as") && Integer.parseInt(args[2]) > 0 && Integer.parseInt(args[2]) < 244
                    && Integer.parseInt(args[3]) > Integer.parseInt(args[2]) && Integer.parseInt(args[3]) < 244)
            {
                System.out.print(constitution.getArticles(Integer.parseInt(args[2]),Integer.parseInt(args[3])));

            }
            else
            {
                System.out.print("Niepoprawne argumenty, dostępne opcje: -c [numer rozdziału], -a [numer artykułu], -as [numer artykułu początkowego] [numer artykułu końcowego]");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Niepoprawne argumenty, dostępne opcje: -c [numer rozdziału], -a [numer artykułu], -as [numer artykułu początkowego] [numer artykułu końcowego]");
        }
    }

}
