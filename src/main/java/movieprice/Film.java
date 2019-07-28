package main.java.movieprice;

public class Film {
    private String name;
    private double price;
    private Genre genre;

    Film(String name, double price, Genre genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price ;
    }

    Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
