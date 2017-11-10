import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scraper {
    public static void main(String[] args) throws IOException {
        String URL = args[0];
        String[] keyWords = args[1].split(",");
        int countWord = 0;
        ArrayList<CsvString> listOfStringsForCsv = new ArrayList<CsvString>();
        final Document document = Jsoup.connect(URL).userAgent("Mozilla").get();
        String text = document.body().text().toLowerCase();

        System.out.println(text);

        for (String keyWord : keyWords) {
            Pattern p = Pattern.compile(keyWord.toLowerCase());
            Matcher m = p.matcher(text);
            while(m.find()) {
                countWord++;
            }
            listOfStringsForCsv.add(new CsvString(URL, keyWord, countWord));
            countWord = 0;
        }

        for (CsvString s :
                listOfStringsForCsv) {
            System.out.println(s);
        }
    }
}
