package Project;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.lang3.StringEscapeUtils;
import org.json.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnirestException {
        String p = "<p> Welcome to my thingy</p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));


        HttpResponse<JsonNode> response = Unirest.post("https://community-sentiment.p.mashape.com/text/")
                .header("X-Mashape-Authorization", "jrrH60SvORmshuve3DmPj8Ey8WRap1Kx6hHjsnV1WezguBShda")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json").field("txt", "what is life")
                .asJson();
        System.out.println(response.getBody());


    }
}
