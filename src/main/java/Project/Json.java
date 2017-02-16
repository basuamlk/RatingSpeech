package Project;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpHost;

/**
 * Created by yassin on 2/14/17.
 */
public class Json {
    public static void main(String[] args) throws UnirestException {

        Unirest.setDefaultHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");

        //sets the proxy of our ip address
        Unirest.setProxy(new HttpHost("165.234.102.177",8080));// ip address was retrieved from the http://proxylist.hidemyass.com/

    HttpResponse<JsonNode> myResponse = Unirest.get("http://httpbin.org/get").queryString("Hey", "not hey").header("what","12")
           .header("what", "31").asJson();
        Print.ln(myResponse.getBody().toString());

        String ipAddress = (String) myResponse.getBody().getObject().get("origin"); //sets our IP address to a string
        Print.ln(ipAddress); //prints out the string


        Print.p(myResponse.getBody().getObject().get("headers"));   // prints out the headers


        Print.l();
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