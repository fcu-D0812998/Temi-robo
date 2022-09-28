package com.example.fengchiaproject.tools;

import androidx.annotation.NonNull;

/***
 * 抓取到的文章数据封装
 */
public class Article {

    private String title;
    private String price;
    private String imgUrl;
    private String points;
    private String articleUrl;


    //有几个属性还没用到，所以构造方法先用上这四个有爬取到数据的
    public Article(String title, String price, String imgUrl, String points, String articleUrl) {
        this.title = title;
        this.price = price;
        this.imgUrl = imgUrl;
        this.points = points;
        this.articleUrl = articleUrl;
    }


    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public String getImgUrl() {

        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {

        this.imgUrl = imgUrl;
    }

    public String getPoints() {

        return points;
    }

    public void setPoints(String context) {

        this.points = points;
    }

    public String getArticleUrl() {

        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {

        this.articleUrl = articleUrl;
    }



    @NonNull
    @Override
    public String toString() {
        return "Article{" +
        "title='" + title + '\'' +
        ", price='" + price + '\'' +
        ", points='" + points + '\'' +
        ", imgUrl='" + imgUrl + '\'' +
        ", articleUrl='" + articleUrl + '\'' +
        '}';
    }
}
