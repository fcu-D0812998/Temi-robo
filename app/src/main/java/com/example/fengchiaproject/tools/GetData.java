package com.example.fengchiaproject.tools;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class GetData {

    private static final String TAG ="GetData" ;

    /**
     * 抓取什么值得买首页的精选文章
     * @param html
     * @return  ArrayList<Article> articles
     */
    public static ArrayList<Article> spiderArticle(String html){
        ArrayList<Article> articles = new ArrayList<>();

        Document document = Jsoup.parse(html);
        Elements elements = document
                .select("ul[class=list-unstyled products]");

        //Log.i(TAG, "spiderArticle: elements " +elements.html());

        for (Element element : elements) {
            String title = element
                    .select("h3[class=ellipsis item-title]")
                    .select("a")
                    .text();

            String price = element
                    .select("p[class=price]")
                    .select("span")
                    .text();

            String points = element
                    .select("p[class=price]")
                    .text();

            String imgUrl = element
                    .select("a")
                    .select("img")
                    .attr("src");

            String articleUrl = element
                    .select("h3[class=ellipsis item-title]")
                    .select("a")
                    .attr("href");

            Article article = new Article(title,price,points,imgUrl,articleUrl);
            articles.add(article);
            //Log.e("DATA>>",article.toString());
        }
        return articles;
    }
}
