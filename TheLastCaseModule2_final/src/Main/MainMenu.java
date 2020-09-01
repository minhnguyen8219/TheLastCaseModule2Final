package Main;

import Objects.NewsList;

import java.util.Scanner;

public class MainMenu {

    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        NewsList newsList = new NewsList();
        newsList.setList();
        int id = newsList.list.size();

        do {
            System.out.println("\nMain menu:");
            System.out.println("1: Insert news");
            System.out.println("2: Edit news");
            System.out.println("3: Delete news");
            System.out.println("4: Views list news");
            System.out.println("5: Save & Exit");

            String choice = input.nextLine();

            switch (choice) {
                case "1" -> {
                    newsList.creatNews(id);
                    id++;
                }
                case "2" -> {
                    if (!NewsList.list.isEmpty()) {
                        String message = "Insert news ID need edit: ";
                        int idEdit = -1;
                        do {
                            System.out.println(message);
                            try {
                                idEdit = Integer.parseInt(input.nextLine());
                            } catch (Exception ex) {
                                message = "Please re-insert news ID!";
                            }
                        } while (idEdit < 0 || idEdit > NewsList.list.size());
                        newsList.editNews(idEdit);
                    } else {
                        System.out.println("News list is empty!");
                    }
                }
                case "3" -> {
                    if (!NewsList.list.isEmpty()) {
                        String message = "Insert news ID need delete: ";
                        int idDelete = -1;

                        do {
                            System.out.println(message);
                            try {
                                idDelete = Integer.parseInt(input.nextLine());
                            } catch (Exception ex) {
                                message = "Please re-insert news ID!";
                            }
                        } while (idDelete < 0 || idDelete > NewsList.list.size());
                        newsList.deleteNews(idDelete);

                    } else {
                        System.out.println("News list is empty!");
                    }
                }
                case "4" -> {
                    if (!NewsList.list.isEmpty()) {
                        newsList.displayList();
                    } else {
                        System.out.println("News list is empty!");
                    }
                }
                case "5" -> {
                    newsList.recordList();
                    System.exit(0);
                }
                default -> System.out.println("'" + choice + "' isn't on the menu! Please try again or insert '5' to exit!");
            }
        } while (true);
    }
}