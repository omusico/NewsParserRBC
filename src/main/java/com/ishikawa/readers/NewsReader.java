package com.ishikawa.readers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


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
