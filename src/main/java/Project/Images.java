package Project;

import javax.swing.*;

/**
 * Created by yassin on 2/16/17.
 */
public class Images {
public static void main(String[] args) {


    String me = "help me out";
    String mine = me.replaceAll("",":");

    Print.ln(me);
    Print.ln(mine);
        String[] king = me.split("\\s");
        Print.ln(king[1]);
}

}
