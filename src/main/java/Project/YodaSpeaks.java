package Project;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

/**
 * Created by yassin on 2/16/17.
 */
public class YodaSpeaks {

    public static void Speak() throws UnirestException{


        Print.ln("What do you want Yoda to say?");
        Scanner myScanner = new Scanner(System.in);
        String UserInput = myScanner.nextLine();
        String mine = UserInput.replace(" ", "+");

        HttpResponse<String> response = Unirest.get("https://yoda.p.mashape.com/yoda?sentence=" + mine)
                .header("X-Mashape-Key", "ttcz69Z457mshpLMko2KYRcrkwCbp1FJzXIjsn35a4moyfgV1D") //test API: slT8wfinM0mshh6c0RR6eeqqF9x6p1382bSjsnbEKxUiy07xbz           production API: ttcz69Z457mshpLMko2KYRcrkwCbp1FJzXIjsn35a4moyfgV1D
                .header("Accept", "text/plain")
                .asString();

        Print.ln("Yoda:  " + response.getBody());


    }
}
