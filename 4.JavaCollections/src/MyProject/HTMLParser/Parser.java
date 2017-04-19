package MyProject.HTMLParser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Andrey on 16.04.2017.
 */
public class Parser {

    //private static final String HH_URL = "https://hh.ru";

    public static void main(String... args) throws IOException {

        Document doc = Jsoup.connect("http://www.4pda.ru").get();
        Elements elements = doc.select("h2[class]");
        for (int i=0;i<elements.size();i++){
        }
    }
}
