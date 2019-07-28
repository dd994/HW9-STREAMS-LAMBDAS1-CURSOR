package main.java.thingsbox;

public class Protected  extends Thing{

    public Protected(String name) {
        super(name);
    }

    boolean weak() {
        return true;
    }

    @Override
    public String toString() {
        return "Protected{" +
                "thing=" + getName() +
                '}';
    }


}
