package main.java.userfilter;

public   class  Team {
    private String name;

    public  Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
