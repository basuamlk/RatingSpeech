package Project;


import com.google.gson.JsonArray;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.Scanner;

public class Quote {

public static Object quote() throws UnirestException {


    //todo this API gives a random quote

    Scanner UserInput = new Scanner(System.in);
    Print.ln("enter 1 if you want a movie quote, enter 2 if you want a famous non-movie quote");
    String UserInputString = UserInput.nextLine();
    String value;
    if (UserInputString.equals("1")) {
        value = "movies";
    }
    else if (UserInputString.equals("2")){
        value = "famous";
    }
    else {
            value = null;
            Print.ln("Please enter a 1 or a 2");
            quote();
         }

    HttpResponse<JsonNode> myResponse = Unirest.post("https://andruxnet-random-famous-quotes.p.mashape.com/?cat="+ value)//famous or movies
            .header("X-Mashape-Key","catK80VmEHmshim38HJTbb8XFTt4p1gcxaujsnvrsrJNADVfJ3")// Production API: catK80VmEHmshim38HJTbb8XFTt4p1gcxaujsnvrsrJNADVfJ3       Testing API: nAtU6auLkQmshOTCujXEqMRryjhBp18NGcXjsnFABJK1MkTaZF
            .header("Content-Type", "application/x-www-form-urlencoded")
            .header("Accept", "application/json").asJson();

   Object quote = myResponse.getBody().getObject().get("quote");
    //String author1 = myResponse.getBody().toString().replace("{", "").replace("}","").replace("\"", ""); // replaces the string "quote" to "nothing"
   Object author = myResponse.getBody().getObject().get("author");

    System.out.println("quote: " + quote);
    Print.ln("By: " + author);
   // Print.ln(author); //todo will print the naked Json

    return quote;

}


}
