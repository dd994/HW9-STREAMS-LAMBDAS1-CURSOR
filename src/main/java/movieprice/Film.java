package main.java.movieprice;

public class Film {
    private String name;
    private double price;
    private   Genre genre;

    public  Film(String name, double price, Genre genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price ;
    }

    public Genre getGenre() {
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
