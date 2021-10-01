import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        try{
            String[] pathNames;
            File files = new File("../opr_end/");
            pathNames = files.list();
            String url = "../opr_end/";
            for (String pathName:pathNames) {
                File input = new File(url+pathName);
                System.out.println(pathName+"-------------------------------------------------------------");
                Document doc =Jsoup.parse(input, "windows-1251", "http://example.com/");
                doc.select("a").forEach(System.out::println);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
