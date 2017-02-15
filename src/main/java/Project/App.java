package Project;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.scene.chart.PieChart;
import org.apache.commons.lang3.StringEscapeUtils;
import org.json.*;


import java.awt.image.ImageProducer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
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
        Object myArray = response.getBody().getObject().get("result"); //will get the result Object from the Json


// System.out.println(myArray);
//        Print.l();


        Print.l();
        Gson gson = new Gson();    //this Gson will convert the Java to Json.
        StringBuilder buildGson = new StringBuilder();
        String the = gson.toJson("ehl");
        buildGson.append(the);
       buildGson.append(gson.toJson("First"));
       buildGson.append(gson.toJson("Second"));
       buildGson.append(gson.toJson(3+"rd"));
       System.out.println(buildGson);



//todo this API gives a random quote
       HttpResponse<JsonNode> myResponse = Unirest.post("https://andruxnet-random-famous-quotes.p.mashape.com/?cat=movies")
               .header("X-Mashape-Key","catK80VmEHmshim38HJTbb8XFTt4p1gcxaujsnvrsrJNADVfJ3")// Production API: catK80VmEHmshim38HJTbb8XFTt4p1gcxaujsnvrsrJNADVfJ3       Testing API: nAtU6auLkQmshOTCujXEqMRryjhBp18NGcXjsnFABJK1MkTaZF
               .header("Content-Type", "application/x-www-form-urlencoded")
               .header("Accept", "application/json").asJson();

       System.out.println(myResponse.getBody());
       Object quote = myResponse.getBody().getObject().get("quote");
       System.out.println(quote);


//
//        HttpResponse<JsonNode> response = Unirest.post("https://andruxnet-random-famous-quotes.p.mashape.com/?cat=movies")
//                .header("X-Mashape-Key", "dt7YlhuKyBmshotQbTak44smSS3Xp1Iy3etjsnx2u6J7wA3E7m")
//                .header("Content-Type", "application/x-www-form-urlencoded")
//                .header("Accept", "application/json")
//                .asJson();





//todo The meme generator
//       HttpResponse<InputStream> myResponse = Unirest.get("https://ronreiter-meme-generator.p.mashape.com/meme?bottom=Bottom+text&font=Impact&font_size=50&meme=Condescending+Wonka&top=Top+text")
//               .header("X-Mashape-Key", "YKap7hyWkImshLpzLIlq1VuLgd26p1Q9njejsndM0YIgkXwL3V")// production API: QDteBoNZvpmshtohNDVn82FYB1iZp1LssucjsnldbqIQ3qyPUH      Testing API: YKap7hyWkImshLpzLIlq1VuLgd26p1Q9njejsndM0YIgkXwL3V
//               .asBinary();
//
//       System.out.println(myResponse.getBody());
//        HttpResponse<InputStream> response = Unirest.get("https://ronreiter-meme-generator.p.mashape.com/meme?bottom=Bottom+text&font=Impact&font_size=50&meme=Condescending+Wonka&top=Top+text")
//                .header("X-Mashape-Key", "dt7YlhuKyBmshotQbTak44smSS3Xp1Iy3etjsnx2u6J7wA3E7m") // sample template
//                .asBinary();

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
