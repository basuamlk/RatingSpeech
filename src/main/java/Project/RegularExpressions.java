package Project;

/**
 * Created by yassin on 2/16/17.
 */
import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.*;

public class RegularExpressions {

public static void main(String[] args) {

    String names = "Yasin Alsahlani Kosay Alsahlani Zaynab Alsahlani";
    String games = " Playstation X-box";

    Regex("[A-Za-z]\\s[A-Za-z]{1,100}\\s", names);
    Regex("Y[a-z]{3,}",names);
    Regex("\\w{1,}" , names);
}
static String myString;
public static void Regex(String theReg, String line) {

    Pattern pattern = Pattern.compile(theReg);
    Matcher myMatcher = pattern.matcher(line);

    while (myMatcher.find()) {
        if (myMatcher.group().length() > 0) {
            Print.ln("the value is " + myMatcher.group());
        }
        Print.ln("the first value is " + myMatcher.start());  //get the first value of myMatcher
        Print.ln("the last value is " + myMatcher.end());    // gets the last value of myMatcher

//       myString = myMatcher.group(); //creates a string for the matcher
    }
//
//    Print.ln(myString);

}


}



//
//    public static void main(String[] args) {
//
//        String first = "what ever you wish to hear";
//        String second = "Me no likey";
//        String third = " aaa 888888 &*&^%&*( ";
//
//
//        Regexer("\\s\\w{4}\\s", first);
//
//    }
//    public static void Regexer(String theRegex, String line) {
//        Pattern pattern = Pattern.compile(theRegex);
//        Matcher matcher = pattern.matcher(line);
//
//        while (matcher.find()) {
//            if (matcher.group().length() > 0) {
//                Print.ln(matcher.group());
////                Print.ln(matcher.group().split(theRegex,5).toString() + " helo");    converts to array
//            }
////
////            Print.ln("first index is " + matcher.start());
////            Print.ln("Last index is " + matcher.end());
//
//        }
//    }
