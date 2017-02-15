package Project;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.scene.chart.PieChart;
import org.apache.commons.lang3.StringEscapeUtils;
import org.json.*;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) throws UnirestException {


        String p = "<p> Welcome to my thingy</p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));



        String userInput = new Scanner(System.in).nextLine();

        HttpResponse<JsonNode> response = Unirest.post("https://community-sentiment.p.mashape.com/text/")
                .header("X-Mashape-Authorization", "jrrH60SvORmshuve3DmPj8Ey8WRap1Kx6hHjsnV1WezguBShda")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json").field("txt", userInput)
                .asJson();
        System.out.println(response.getBody());


        Gson gson = new Gson();    //this Gson will convert the Java to Json.
        StringBuilder buildGson = new StringBuilder();
        String the = gson.toJson("ehl");
        buildGson.append(the);
       buildGson.append(gson.toJson("First"));
       buildGson.append(gson.toJson("Second"));
       buildGson.append(gson.toJson(3+"rd"));
       System.out.println(buildGson);





    }
}




//todo proper way to use Gson

//        try {
//            Sample();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("Didnt work");
//        }
//    }

//    public static void Sample() throws IOException {
//        Writer writer = new FileWriter("Output.json");
//        Gson gson = new GsonBuilder().create();
//        gson.toJson("bye",writer);
//        gson.toJson(911, writer);
//        System.out.println();
//        System.out.println(gson);
//        writer.close();
