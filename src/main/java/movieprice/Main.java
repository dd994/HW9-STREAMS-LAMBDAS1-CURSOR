package main.java.movieprice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CinemaGenreSelector cinemaGenreSelector = new CinemaGenreSelector();
        System.out.println("Please, enter the genre of the film by number");
        System.out.println("1 - COMEDY, 2 - STORY, 3 - THRILLER, 4 - FAMILY, 5 - HORROR, 6 - HISTORICAL, 7 ACTION");
        cinemaGenreSelector.cinemaGenreSelector(scan.nextInt());
    }
}
