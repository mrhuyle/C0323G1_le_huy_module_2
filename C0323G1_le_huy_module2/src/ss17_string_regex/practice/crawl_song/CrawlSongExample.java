package ss17_string_regex.practice.crawl_song;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            //open the stream and put it into BufferedReader:
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            //close scanner:
            scanner.close();
            //remove all new line
            content = content.replaceAll("\\n+", "");
            //regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = p.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
