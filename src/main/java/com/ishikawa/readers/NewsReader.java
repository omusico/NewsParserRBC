package com.ishikawa.readers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Ishikawa
 * Date: 24.10.13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class NewsReader implements NewsSites {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.parse(new File("C:\\javaProjects\\incubator\\NewsParserRBC\\news_sites_ru.html"), "UTF-8");

        Elements links = doc.getElementsByTag("a");
        System.out.println(links.size());


        for (Element link : links) {
            String linkHref = link.attr("href");
            String linkText = link.text();
            System.out.println(linkText + "  " + linkHref);
        }

    }

}
