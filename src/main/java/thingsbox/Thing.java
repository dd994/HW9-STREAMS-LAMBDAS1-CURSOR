package main.java.thingsbox;

public class Thing {
    private String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
