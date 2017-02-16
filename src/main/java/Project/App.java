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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws UnirestException {

            // list of API incorporated
        SpeechRater myRater = new SpeechRater();
        Quote myQuote = new Quote();


        myQuote.quote();
        myRater.rate();

    }
}
