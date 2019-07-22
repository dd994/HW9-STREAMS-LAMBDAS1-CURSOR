package main.java.movieprice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cinema {

    private static List<Film> getFirstMovies() {

        List<Film> firstMovieList = new ArrayList<>();
        firstMovieList.add(new Film("Terminator", 52, Genre.ACTION));
        firstMovieList.add(new Film("Mask", 80, Genre.COMEDY));
        firstMovieList.add(new Film("She", 55, Genre.THRILLER));
        firstMovieList.add(new Film("Avatar", 90, Genre.ACTION));
        firstMovieList.add(new Film("Hobbit", 50, Genre.STORY));
        firstMovieList.add(new Film("Home Alone", 50, Genre.FAMILY));

        return firstMovieList;
    }

    private static List<Film> getSecondMovies() {
        List<Film> secondMovieList = new ArrayList<>();
        secondMovieList.add(new Film("The Fast and the Furious", 63, Genre.ACTION));
        secondMovieList.add(new Film("Overlord", 80, Genre.HORROR));
        secondMovieList.add(new Film("Stupid", 55, Genre.COMEDY));
        secondMovieList.add(new Film("Terminator2", 59, Genre.ACTION));
        secondMovieList.add(new Film("Terminator3", 68, Genre.ACTION));
        secondMovieList.add(new Film("Dunkerk", 68, Genre.HISTORICAL));

        return secondMovieList;
    }

    static void averagePriceByGenre(Genre genre) {
        List<Film> movies = new ArrayList<>();
        movies.addAll(getFirstMovies());
        movies.addAll(getSecondMovies());

        Map<Genre, Double> averagePrice = movies.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .collect(Collectors.groupingBy(Film::getGenre, Collectors.averagingDouble(Film::getPrice)));

        System.out.println("The average price(grn) : " + averagePrice);

        List<String> genreList = movies.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .map(Film::getName)
                .collect(Collectors.toList());

        System.out.println("Movies are available: " + genreList);
    }


}

