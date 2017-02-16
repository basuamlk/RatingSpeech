package Project;

/**
 * Created by yassin on 2/16/17.
 */
import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.*;

public class RegularExpressions {


    public static void main(String[] args) {

        String first = "what ever you wish to hear";
        String second = "Me no likey";
        String third = " aaa 888888 &*&^%&*( ";


        Regexer("\\s\\w{4}\\s", first);

    }
    public static void Regexer(String theRegex, String line) {
        Pattern pattern = Pattern.compile(theRegex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            if (matcher.group().length() > 0) {
                Print.ln(matcher.group());
//                Print.ln(matcher.group().split(theRegex,5).toString() + " helo");    converts to array
            }
//
//            Print.ln("first index is " + matcher.start());
//            Print.ln("Last index is " + matcher.end());

        }
    }

}


//
//    public static void main(String[] args) {
//
//        String longString = " Yassin Alsahlani CA 12345 PA (404)212-3423 John Smith";
//        String strangeString = " 1Z aaa **** *** {{{{ {{ { ";
//
//        regexChecking(strangeString);
//
//    }
//
//    public static void regexChecking( String Check) {
//
//        Pattern checkRegex = Pattern.compile("\\s[A-Za-z]2,20}\\s");
//        Matcher regexMacther = checkRegex.matcher(Check);
//
//        while (regexMacther.find()) {
//            if (regexMacther.group().length() != 0) {
//                System.out.println(regexMacther.group().trim());
//            }
//            System.out.println("Start index: " + regexMacther.start());
//            System.out.println("End Index: " + regexMacther.end());
//        }
//    }
