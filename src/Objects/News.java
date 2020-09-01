package Objects;

import Methods.Methods;

import java.io.Serializable;
import java.util.Arrays;

public class News implements INews {

    private int id;
    private String title;
    private String publishDate;
    private String content;
    private String author;
    private float averageRate;
    private int[] rateList = new int[3];

    //constructor------------------------------------------
    public void News(News news) {
        this.title = news.getTitle();
        this.publishDate = news.getPublishDate();
        this.content = news.getContent();
        this.author = news.getAuthor();
        this.rateList = news.getRateList();
    }

    //getter-----------------------------------------------
    public int getId() { return id; }

    public String getTitle() { return title; }

    public String getPublishDate() { return publishDate; }

    public String getContent() { return content; }

    public String getAuthor() { return author; }

    public float getAverageRate() { return averageRate; }

    public int[] getRateList() { return rateList; }

    //setter------------------------------------------------

    public void setId(int id) { this.id = id; }

    public void setTitle(String title) { this.title = title; }

    public void setPublishDate(String publishDate) { this.publishDate = publishDate; }

    public void setContent(String content) { this.content = content; }

    public void setAuthor(String author) { this.author = author; }

    public void setRateList(int[] rateList) { this.rateList = rateList; }

    public void setAverageRate(float averageRate) { this.averageRate = averageRate; }

    //toString-----------------------------------------------

    @Override
    public String toString() {
        return "News with id " + getId() + " has: " +
                " Title='" + getTitle() + '\'' +
                " Publish date='" + getPublishDate() + '\'' +
                " Content='" + getContent() + '\'' +
                " Author='" + getAuthor() + '\'' +
                " Average Rate=" + getAverageRate() +
                " Rate List=" + Arrays.toString(rateList) +
                "\n";
    }

    @Override
    public void display() {
        System.out.println(
                "\n News with id " + getId() + " has: " +
                "\n Title='" + getTitle() + '\'' +
                "\n Publish date='" + getPublishDate() + '\'' +
                "\n Content='" + getContent() + '\'' +
                "\n Author='" + getAuthor() + '\'' +
                "\n Average Rate=" + getAverageRate() +
                "\n");
    }
}
