import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LotteryMain {

    public static void main(String[] args) {

        OptionParser parser = new OptionParser ();
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("a")) {
            System.out.println("`-a` was given with the argument " + options.valueOf("a"));
        }

        if (options.has("l")) {
            System.out.println("`-l` was given with the no additional information.");
        }
        CSVReader reader = null;
        try {
            List<String[]> lines = null;
            CSVWriter writer = null;
            reader = new CSVReader (new FileReader ("C:/Users/dvittay/greenfox/vdominika/week-06/day-3/src/Assets/otos.csv"));
            lines = reader.readAll();
            writer = new CSVWriter (new FileWriter ("C:/Users/dvittay/greenfox/vdominika/week-06/day-3/src/Assets/output.csv"));
            writer.writeAll(lines);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace ( );
        }

    }

    public void argumentHandler(String[] args){

        OptionParser parser = new OptionParser ();
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        OptionSet options = parser.parse(args);

    }
}
