package Project;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.InputStream;

/**
 * Created by yassin on 2/15/17.
 */
public class Memes {

    public static void main(String[] args) throws UnirestException {




       HttpResponse<InputStream> myResponse = Unirest.get("https://ronreiter-meme-generator.p.mashape.com/meme?bottom=Bottom+text&font=Impact&font_size=50&meme=Condescending+Wonka&top=Top+text")
               .header("X-Mashape-Key", "YKap7hyWkImshLpzLIlq1VuLgd26p1Q9njejsndM0YIgkXwL3V")// production API: QDteBoNZvpmshtohNDVn82FYB1iZp1LssucjsnldbqIQ3qyPUH      Testing API: YKap7hyWkImshLpzLIlq1VuLgd26p1Q9njejsndM0YIgkXwL3V
               .asBinary();

       System.out.println(myResponse.getBody());
        HttpResponse<InputStream> response = Unirest.get("https://ronreiter-meme-generator.p.mashape.com/meme?bottom=Bottom+text&font=Impact&font_size=50&meme=Condescending+Wonka&top=Top+text")
                .header("X-Mashape-Key", "dt7YlhuKyBmshotQbTak44smSS3Xp1Iy3etjsnx2u6J7wA3E7m") // sample template
                .asBinary();
    }
}
