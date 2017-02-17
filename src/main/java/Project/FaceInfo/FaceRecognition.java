package Project.FaceInfo;

import Project.Print;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by yassin on 2/17/17.
 */
public class FaceRecognition {

    private static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws UnirestException {

       FaceRecognition myFace = new FaceRecognition();
       Face face= new Face();



        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        String myString2 = myString.replace("/","%2F").replace(":","%3A");
        HttpResponse<JsonNode> response = Unirest.get("https://faceplusplus-faceplusplus.p.mashape.com/detection/detect?attribute=glass%2Cpose%2Cgender%2Cage%2Crace%2Csmiling&url=" + myString2)
                .header("X-Mashape-Key", "wXUU2CvhBlmsh5V2vpPWvVbpy2Lbp1sBYLWjsn4cMyTXMMAYs9")
                .header("Accept", "application/json")
                .asJson();

     Print.ln(response.getBody() + "");
     Print.ln(face.getFace_id());

    }

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
