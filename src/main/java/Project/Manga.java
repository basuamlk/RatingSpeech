package Project;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Basu on 2/18/2017.
 */
public class Manga {

    public static void MangaInfo() throws UnirestException {
        Print.ln("Enter the name of the manga you wish to look up");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        HttpResponse<String> response = Unirest.get("https://doodle-manga-scraper.p.mashape.com/mangareader.net/manga/"+name+"/")
                .header("X-Mashape-Key", "TWK0TuZqGEmsh8mJmWIoOZYGaSNEp1qkqNTjsnjDRSCcMUCVHz")
                .header("Accept", "text/plain")
                .asString();
        Print.ln("Manga: "+response.getBody());
    }
}
