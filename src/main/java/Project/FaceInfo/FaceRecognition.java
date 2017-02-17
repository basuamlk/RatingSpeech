package Project.FaceInfo;

import Project.FaceInfo.*;
import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by yassin on 2/17/17.
 */
public class FaceRecognition {

    private static OkHttpClient client = new OkHttpClient();
    public static Face face = new Face();
    public static Nose nose = new Nose();
    public static Race race = new Race();
    public static Smiling smiling = new Smiling();
    public static Mouth_left mouth_left = new Mouth_left();
    public static Mouth_right mouth_right = new Mouth_right();
    public static Pose pose = new Pose();
    public static Position position = new Position();


    public static void main(String[] args) throws UnirestException {


        for (Object thisone : getUserData("http%3A%2F%2Fvignette3.wikia.nocookie.net%2Fthehostseries%2Fimages%2F3%2F39%2FBeautiful-faces-of-girls-411-1-.jpg%2Frevision%2Flatest%3Fcb%3D20130202151837")){
            System.out.println(thisone);
        }


//
//        Scanner myScanner = new Scanner(System.in);
//        String myString = myScanner.nextLine();
//        String myString2 = myString.replace("/","%2F").replace(":","%3A");
//        HttpResponse<JsonNode> response = Unirest.get("https://faceplusplus-faceplusplus.p.mashape.com/detection/detect?attribute=glass%2Cpose%2Cgender%2Cage%2Crace%2Csmiling&url=" + myString2)
//                .header("X-Mashape-Key", "wXUU2CvhBlmsh5V2vpPWvVbpy2Lbp1sBYLWjsn4cMyTXMMAYs9")
//                .header("Accept", "application/json")
//                .asJson();
//
//     Print.ln(response.getBody() + "");
    }

    public static String getJson(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    public static String[] getUserData(String UserData) {

        String json = null;

        try {
            json = getJson("https://faceplusplus-faceplusplus.p.mashape.com/detection/detect?attribute=glass%2Cpose%2Cgender%2Cage%2Crace%2Csmiling&url=" + UserData);
        }catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        Attribute attribute = gson.fromJson(json, Attribute.class);

        return new  String[] {
                "face: " + face.getFace_id(),
        "face: " + face.getTag(),
        "face " + race.getValue()
    };
    }
}

