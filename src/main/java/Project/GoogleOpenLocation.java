package Project;

import com.google.gson.JsonArray;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

/**
 * Created by yassin on 2/17/17.
 */
public class GoogleOpenLocation {

    public static void main(String[] args) throws UnirestException{

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().replace(" ", "%20");
        HttpResponse<String> response = Unirest.get("https://maps.googleapis.com/maps/api/geocode/json?address=Oxford%20University,%20uk&sensor=false\n")
                .asString();

        Print.ln("" + response.getBody());

    }




}
