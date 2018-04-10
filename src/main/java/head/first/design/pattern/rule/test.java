package head.first.design.pattern.rule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
        long time = formatter.parse(formatter.format(new Date())).getTime() - (1200 * 1000);
        // NOW_DATE, SEND_DATE < time

        System.out.println(formatter.format(time));
    }
}
