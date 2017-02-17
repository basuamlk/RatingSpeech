package Project;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

/**
 * Created by yassin on 2/16/17.
 */
public class PhoneNumber {

    public static void main(String[] args) throws UnirestException{

        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        HttpResponse<JsonNode> response = Unirest.post("https://neutrinoapi-phone-validate.p.mashape.com/phone-validate")
                .header("X-Mashape-Key", "wXUU2CvhBlmsh5V2vpPWvVbpy2Lbp1sBYLWjsn4cMyTXMMAYs9")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json")
                .field("country-code", "GB")
                .field("number", "+1" + myString)
                .asJson();

        Print.ln(response.getBody() + "");

    }



}
