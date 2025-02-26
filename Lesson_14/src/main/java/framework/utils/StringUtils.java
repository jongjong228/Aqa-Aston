package framework.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static String findNumInString(String string) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(string);
        matcher.find();
        return matcher.group();
    }

    public static String createPhoneNumber(String string) {
        return "375" + string;
    }

    public static String createCoast(String string) {
        DecimalFormat df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        return df.format(Double.parseDouble(string));
    }
}
