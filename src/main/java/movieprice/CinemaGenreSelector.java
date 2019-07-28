package main.java.movieprice;

import static main.java.movieprice.Cinema.averagePriceByGenre;

public class CinemaGenreSelector {

    public void cinemaGenreSelector(int choice) {
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
