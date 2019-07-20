package main.java.movieprice;

import java.util.Scanner;

import static main.java.movieprice.Cinema.averagePriceByGenre;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the genre of th film by number");
        System.out.println("1 - COMEDY, 2 - STORY, 3 - THRILLER, 4 - FAMILY, 5 - HORROR, 6 - HISTORICAL, 7 ACTION");
        int choice = scan.nextInt();
        if (choice > 0 && choice < 8) {
            switch (choice) {
                case (1):
                    averagePriceByGenre(Genre.COMEDY);
                    break;
                case (2):
                    averagePriceByGenre(Genre.STORY);
                    break;
                case (3):
                    averagePriceByGenre(Genre.THRILLER);
                    break;
                case (4):
                    averagePriceByGenre(Genre.FAMILY);
                    break;
                case (5):
                    averagePriceByGenre(Genre.HORROR);
                    break;
                case (6):
                    averagePriceByGenre(Genre.HISTORICAL);
                    break;
                case (7):
                    averagePriceByGenre(Genre.ACTION);
                    break;
            }

        } else {
            System.out.println("Wrong choice");
        }


    }
}
