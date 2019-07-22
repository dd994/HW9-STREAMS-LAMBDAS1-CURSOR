package main.java.userfilter;

public class Team {
    private String name;

    Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
