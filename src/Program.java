import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        String scanner = "";
        try
        {
            scanner = new Scanner(new File(args[0])).useDelimiter("\\Z").next();
        }
        catch(ArrayIndexOutOfBoundsException | FileNotFoundException r)
        {
            System.out.print("Niepoprawne dane");
            return;
        }
        scanner = OptionsParser.clean(scanner);
        Constitution constitution = OptionsParser.parse(scanner);
        ArgsParser argsParser = new ArgsParser();
        argsParser.parse(args, constitution);
    }



}
