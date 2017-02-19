package Project;


import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws UnirestException {

            // list of API incorporated
        SpeechRater myRater = new SpeechRater();
        Quote myQuote = new Quote();
        YodaSpeaks speaks = new YodaSpeaks();


        myQuote.quote();
        String rate = SpeechRater.rate();
        Print.ln(rate);

        if (rate.equalsIgnoreCase("positive")) {


            //add function for positive meme
        }
        else if(rate.equalsIgnoreCase("neutral")) {
            //add function for neutral meme here
        }
        else {
            //add function for negative meme here
        }

YodaSpeaks.Speak();
Manga.MangaInfo();


    }
}
