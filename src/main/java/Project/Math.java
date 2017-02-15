package Project;

import java.util.Scanner;

/**
 * Created by yassin on 2/14/17.
 */
public class Math {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        int mine = myInt/2;
        for (int i = 1; i <= mine ; i++) {
            if (i * i == myInt) {
                i++;
                System.out.println(i*i);
                break;
            }if (i == mine) {
                System.out.println("i");
            }

        }

    }
    
}
