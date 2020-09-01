package Objects;

import IOManagement.IOManager;
import Methods.Methods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NewsList implements INewsList, Serializable {

    public static List<News> list = new ArrayList<>();
    Methods m = new Methods();
    IOManager io = new IOManager();

    @Override //Read form file newsList.dat
    public void setList() {
        list = (ArrayList<News>) io.readFromFile("newsList.dat");
    }

    @Override
    public void creatNews(int id) {
        list.add(m.createNews(id));
    }

    @Override
    public void editNews(int id) {
        list.get(id).News(m.createNews(id));
    }

    @Override
    public void deleteNews(int id) {
        list.remove(id);
    }

    @Override
    public void displayList() {
        m.displayList(list);
    }

    @Override //Write list to file newsList.dat
    public void recordList() {
        IOManager.writeObjectToFile(NewsList.list);
    }
}
