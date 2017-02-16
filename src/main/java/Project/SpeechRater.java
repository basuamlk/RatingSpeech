package Project;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

/**
 * Created by yassin on 2/15/17.
 */
public class SpeechRater {

    public static void rate() throws UnirestException{

        Print.ln("Enter a line you wish to examine");
        String userInput = new Scanner(System.in).nextLine();

        HttpResponse<JsonNode> response = Unirest.post("https://community-sentiment.p.mashape.com/text/")
                .header("X-Mashape-Authorization", "jrrH60SvORmshuve3DmPj8Ey8WRap1Kx6hHjsnV1WezguBShda")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json").field("txt", userInput)
                .asJson();
        // System.out.println(response.getBody());
        Object myArray = response.getBody().getObject().get("result"); //will get the result Object from the Json
        String mine = myArray.toString().replace("{", "").replace("}","").replace("\"", "")
                .replace(":" , "  -  ").replace("," , "\n");

        System.out.println(mine);
        Print.l();

    }
}
