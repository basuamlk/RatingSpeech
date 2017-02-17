package Project;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

/**
 * Created by yassin on 2/17/17.
 */
public class FaceRecognition2 {

    public static void main(String[] args) throws UnirestException{

        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        String myString2 = myString.replace("/","%2F").replace(":","%3A");
        HttpResponse<JsonNode> response = Unirest.get("https://faceplusplus-faceplusplus.p.mashape.com/detection/detect?attribute=glass%2Cpose%2Cgender%2Cage%2Crace%2Csmiling&url=" + myString2)
                .header("X-Mashape-Key", "wXUU2CvhBlmsh5V2vpPWvVbpy2Lbp1sBYLWjsn4cMyTXMMAYs9")
                .header("Accept", "application/json")
                .asJson();
//
//     Print.ln(response.getBody() + "");
     Print.ln(response.getBody().toString().replace("\"","").replace("{","").replace("}","").replace(",","\n")
     .replace(":", " : "));
    }
}
