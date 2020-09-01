package Methods;

import Objects.News;

import java.util.List;
import java.util.Scanner;

public class Methods {

    public static Scanner input = new Scanner(System.in);

    public News createNews(int id) {
        News news = new News();

        int[] rate = new int[3];

        news.setId(id);

        System.out.println("Insert title: ");
        String title = input.nextLine();
        news.setTitle(title);
        System.out.println();

        System.out.println("Insert publish date: ");
        String publishDate = input.nextLine();
        news.setPublishDate(publishDate);
        System.out.println();

        System.out.println("Insert author: ");
        String author = input.nextLine();
        news.setAuthor(author);
        System.out.println();

        System.out.println("Insert content: ");
        String content = input.nextLine();
        news.setContent(content);
        System.out.println();

        System.out.println("Insert rate list: ");
        boolean isRate = false;
        for (int i = 0; i < 3; i++) {
            do {
                try {
                    System.out.format("Rate [" + "%d]: ", i + 1);
                    rate[i] = Integer.parseInt(input.nextLine());
                } catch (Exception ignored) { }
                isRate = rate[i] < 1 || rate[i] > 5 ? true:false;
                if (isRate) { System.out.println("Value of rate from 1 to 5!"); }
            } while (isRate);
        }
        news.setRateList(rate);

        int sum = 0;
        float average;
        for (int x : news.getRateList()) { sum += x; }
        if (sum == 0) {
            average = 0;
        } else {
            average = (float) sum / 3;
        }
        news.setAverageRate(average);

        return news;
    }

    public void displayList(List<News> list) {
        for (News news : list) {
            news.display();
        }
    }

}



