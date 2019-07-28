package main.java.thingsbox;

public class Thing {
    private String name;

    public Thing(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    boolean weak() {
        return false;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                '}';
    }
}
